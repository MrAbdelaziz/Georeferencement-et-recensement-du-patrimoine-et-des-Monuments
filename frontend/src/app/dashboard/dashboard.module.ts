import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {DashboardComponent} from "./dashboard.component";
import {RouterModule} from "@angular/router";
import {DashboardRoutingModule} from "./dashboard-routing.module";
import {AppBreadcrumbModule, AppHeaderModule, AppSidebarModule} from "@coreui/angular";
import {PerfectScrollbarModule} from "ngx-perfect-scrollbar";




@NgModule({
  declarations: [DashboardComponent],
  exports: [
   DashboardComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    DashboardRoutingModule,
    AppBreadcrumbModule,
    AppSidebarModule,
    PerfectScrollbarModule,
    AppHeaderModule,
  ]
})
export class DashboardModule { }
