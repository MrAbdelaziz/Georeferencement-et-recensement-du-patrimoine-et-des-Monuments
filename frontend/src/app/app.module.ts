import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ContentModule } from './content/content.module';
import {AppBreadcrumbModule, AppHeaderModule, AppSidebarModule} from "@coreui/angular";
import {PerfectScrollbarModule} from "ngx-perfect-scrollbar";
import {DashboardModule} from "./dashboard/dashboard.module";

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
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
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
