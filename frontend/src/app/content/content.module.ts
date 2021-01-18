import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { MapComponent } from './map/map.component';
import {ContentComponent} from './content.component';
import {RouterModule} from '@angular/router';
import {ContentRoutingModule} from './content-routing.module';
import { SwiperModule } from 'swiper/angular';
import {AppModule} from "../app.module";
import {HeaderComponent} from "./header/header.component";
import {FooterComponent} from "./footer/footer.component";



@NgModule({
  declarations: [
    HomeComponent,
    MapComponent,
    ContentComponent,
    HeaderComponent,
    FooterComponent],
  exports: [
    ContentComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    ContentRoutingModule,
    SwiperModule,

  ]
})
export class ContentModule { }
