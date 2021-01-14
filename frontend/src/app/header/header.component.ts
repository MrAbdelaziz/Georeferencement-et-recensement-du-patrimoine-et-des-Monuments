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

  constructor() {
   // this.pas.set('test', 'test');
    this.logo = 'assets/img/logo.svg';
    this.menu.push({ name : 'HOME', path : 'Home'});
    this.menu.push({ name : 'MAP', path : 'Map'});
    this.menu.push({ name : 'DashBoard', path : 'dash'});
  }

  ngOnInit(): void {
   // console.log(this.pas);
  }

}
