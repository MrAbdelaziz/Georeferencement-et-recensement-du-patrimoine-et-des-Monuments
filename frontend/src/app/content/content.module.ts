import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { MapComponent } from './map/map.component';
import {ContentComponent} from './content.component';
import {RouterModule} from '@angular/router';
import {ContentRoutingModule} from './content-routing.module';
import { SwiperModule } from 'swiper/angular';



@NgModule({
  declarations: [HomeComponent, MapComponent, ContentComponent],
  exports: [
    ContentComponent
  ],
  imports: [
    CommonModule,
    RouterModule,
    ContentRoutingModule,
    SwiperModule
  ]
})
export class ContentModule { }
