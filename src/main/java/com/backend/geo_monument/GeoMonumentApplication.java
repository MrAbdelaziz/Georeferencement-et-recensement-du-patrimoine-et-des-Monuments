package com.backend.geo_monument;

import com.backend.geo_monument.Enum.StatusUser;
import com.backend.geo_monument.Models.Region;
import com.backend.geo_monument.Models.User;
import com.backend.geo_monument.Models.users.Recenseur;
import com.backend.geo_monument.Repositories.RegionRepository;
import com.backend.geo_monument.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableJpaAuditing
public class GeoMonumentApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Autowired
    private RegionRepository regionRepository;

    public static void main(String[] args) {
        SpringApplication.run(GeoMonumentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Region region = regionRepository.save(
                new Region("marrakech")
        );

       User user = new Recenseur("abdellah",
                        "boli_dev",
                        "aa@gmail.com",
                        "06666666",
                        "marrakech",
                        bcryptEncoder.encode("123546"),
                        StatusUser.APPROVED,
                        region
            );
        userRepository.save(user);
    }
}
