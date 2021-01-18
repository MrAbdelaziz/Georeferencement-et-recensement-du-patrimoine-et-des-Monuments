import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {DashboardComponent} from "./dashboard.component";
import {RouterModule} from "@angular/router";
import {DashboardRoutingModule} from "./dashboard-routing.module";
import {AppBreadcrumbModule, AppHeaderModule, AppSidebarModule} from "@coreui/angular";
import {PerfectScrollbarModule} from "ngx-perfect-scrollbar";
import { DashHeaderComponent } from './dash-header/dash-header.component';
import { DashFooterComponent } from './dash-footer/dash-footer.component';
import { HomeDashComponent } from './home-dash/home-dash.component';
import { AddMonumentComponent } from './add-monument/add-monument.component';
import { MonumentsListeAdminComponent } from './monuments-liste-admin/monuments-liste-admin.component';
import { AddConstatComponent } from './add-constat/add-constat.component';
import { AddEventTravailComponent } from './add-event-travail/add-event-travail.component';
import { ConstatsListeAdminComponent } from './constats-liste-admin/constats-liste-admin.component';
import {ReactiveFormsModule} from "@angular/forms";




@NgModule({
  declarations: [
    DashboardComponent,
    DashHeaderComponent,
    DashFooterComponent,
    HomeDashComponent,
    AddMonumentComponent,
    MonumentsListeAdminComponent,
    AddConstatComponent,
    AddEventTravailComponent,
    ConstatsListeAdminComponent
  ],
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
        ReactiveFormsModule,
    ]
})
export class DashboardModule { }
