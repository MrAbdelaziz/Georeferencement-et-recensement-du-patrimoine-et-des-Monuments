import { Component, OnInit } from '@angular/core';
//import {Compte} from "../../login/login.component";
//import {LoginService} from "../../login/login.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-dash-header',
  templateUrl: './dash-header.component.html',
  styleUrls: ['./dash-header.component.css']
})
export class DashHeaderComponent implements OnInit {



  ngOnInit(): void {
  }

 // compte : Compte;
  isGestComptes; isAdminRegional ; isRecenseur;


  constructor(/*private loginService : LoginService,*/private router: Router) {
    this.getUserLoggedIn();
  }



  getUserLoggedIn() {
   /* this.compte = JSON.parse(localStorage.getItem('user'));

    if(this.compte){
      console.log("compte", this.compte);
      if(this.compte.privilege === "Gestionnaire des comptes"){
        this.isGestComptes = true;
      }else if(this.compte.privilege === "Administrateur Regional"){
        this.isAdminRegional = true;
      }else if(this.compte.privilege === "Recenseur"){
        this.isRecenseur = true;
      }
    }
  */
  }


  logout() {
   // this.loginService.clearLocalStorage();
    this.router.navigate(['/login']);
  }
}
