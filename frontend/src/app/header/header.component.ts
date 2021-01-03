import { Component, OnInit } from '@angular/core';

interface Menu{
  name: string;
  path: string;
}

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})



export class HeaderComponent implements OnInit {
  logo: any;
  menu: Menu[] = [];
  //pas = new Map();
  constructor() {
   // this.pas.set('test', 'test');
    this.logo = 'assets/img/logo.svg';
    this.menu.push({ name : 'HOME', path : 'Home'});
  }

  ngOnInit(): void {
   // console.log(this.pas);
  }

}
