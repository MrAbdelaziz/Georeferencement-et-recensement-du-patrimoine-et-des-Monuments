import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DashboardComponent} from "./dashboard.component";
import {HomeDashComponent} from "./home-dash/home-dash.component";
import {AddMonumentComponent} from "./add-monument/add-monument.component";

const routes: Routes = [
  {path:'dash', component:DashboardComponent},
  {path:'dash/h', component:HomeDashComponent},
  {path:'dash/add-monument', component:AddMonumentComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class DashboardRoutingModule { }

