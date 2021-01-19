import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContentModule } from './content/content.module';
import {AppBreadcrumbModule, AppHeaderModule, AppSidebarModule} from "@coreui/angular";
import {PerfectScrollbarModule} from "ngx-perfect-scrollbar";
import {DashboardModule} from "./dashboard/dashboard.module";
import {LoginComponent} from "./login/login.component";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ContentModule,
    AppSidebarModule,
    AppBreadcrumbModule,
    AppHeaderModule,
    PerfectScrollbarModule,
    DashboardModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  exports: [

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
