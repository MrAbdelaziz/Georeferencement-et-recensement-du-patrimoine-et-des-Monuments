package com.backend.geo_monument.Services;

import com.backend.geo_monument.Enum.StatusUser;
import com.backend.geo_monument.Http.Requests.SignupRequest;
import com.backend.geo_monument.Models.Region;
import com.backend.geo_monument.Models.User;
import com.backend.geo_monument.Models.users.AdminReg;
import com.backend.geo_monument.Models.users.GestCpt;
import com.backend.geo_monument.Models.users.Minister;
import com.backend.geo_monument.Models.users.Recenseur;
import com.backend.geo_monument.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Autowired
    private RegionService regionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException(username + "not found");
        return user;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User loadUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    public User create(SignupRequest user) throws Exception {
        try {
            switch (user.getRole()) {
                case role_minister:
                    return userRepository.save(
                            new Minister(
                                    user.getName(),
                                    user.getUsername(),
                                    user.getEmail(),
                                    user.getTel(),
                                    user.getAddress(),
                                    bcryptEncoder.encode(user.getPassword()),
                                    StatusUser.APPROVED
                            )
                    );
                case role_recenseur:
                    Region region = regionService.addRegion(user.getRegion());
                    User user1 = new Recenseur(user.getName(),
                            user.getUsername(),
                            user.getEmail(),
                            user.getTel(),
                            user.getAddress(),
                            bcryptEncoder.encode(user.getPassword()),
                            StatusUser.APPROVED,
                            region
                    );
                    return userRepository.save(user1);
                case role_adminRegional:
                    Region _region = regionService.addRegion(user.getRegion());
                    User user2 = new AdminReg(user.getName(),
                            user.getUsername(),
                            user.getEmail(),
                            user.getTel(),
                            user.getAddress(),
                            bcryptEncoder.encode(user.getPassword()),
                            StatusUser.APPROVED,
                            _region
                    );
                    return userRepository.save(user2);
                case role_gestionnaireCpt:
                    return userRepository.save(
                            new GestCpt(user.getName(),
                                    user.getUsername(),
                                    user.getEmail(),
                                    user.getTel(),
                                    user.getAddress(),
                                    bcryptEncoder.encode(user.getPassword()),
                                    StatusUser.APPROVED
                            )
                    );
                default:
                    return null;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public Authentication authenticate(String username, String password) throws Exception {
        System.out.println(username + password);
        try {
            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS");
        }
    }

}