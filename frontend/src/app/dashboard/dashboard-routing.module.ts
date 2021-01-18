import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DashboardComponent} from "./dashboard.component";
import {HomeDashComponent} from "./home-dash/home-dash.component";

const routes: Routes = [
  {path:'dash', component:DashboardComponent},
  {path:'dash/h', component:HomeDashComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class DashboardRoutingModule { }

