import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {HttpClient} from "@angular/common/http";
import {LoginService} from "./login.service";
export interface Compte{
  id?: number;
  login? :string;
  privilege? : string;
  password?: string;
}
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  error: string | undefined;
  loginForm: FormGroup;
  isLoading = false;
  user : Compte;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private formBuilder: FormBuilder,
    private httpClient : HttpClient,
    private loginService : LoginService
  ) {
    this.createForm();

  }

  ngOnInit() {
  }

  ngOnDestroy() {}

  login() {
    this.isLoading = true;
    const login$ = this.httpClient.post('http://localhost:8080',this.loginForm.value);

    login$.subscribe(
      (compte: Compte) => {
        this.user = compte;
        this.loginService.setUserLoggedIn(this.user);
        this.router.navigate(['/home'], { replaceUrl: true });
      },
      error => {
        this.isLoading = false;
        console.log("error",error);
        this.error = error.error.message;
      }
    );
  }

  checkLocalStorage() {
    if (!localStorage.getItem('user')) {
      this.login();
    } else {
      console.log('localStorage ready!');
    }
  }


  private createForm() {
    this.loginForm = this.formBuilder.group({
      login: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

}
