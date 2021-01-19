import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';
import {MapComponent} from './map/map.component';
import {LoginComponent} from "../login/login.component";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'Home', component: HomeComponent},
  {path: 'Map', component: MapComponent},
  { path:'login', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class ContentRoutingModule { }
