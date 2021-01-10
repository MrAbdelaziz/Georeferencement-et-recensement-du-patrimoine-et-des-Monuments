import { Component, OnInit } from '@angular/core';

// import Swiper core and required components
import SwiperCore, { Navigation, Pagination, Scrollbar, A11y } from 'swiper/core';

// install Swiper components
SwiperCore.use([Navigation, Pagination, Scrollbar, A11y]);

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {

  constructor() { }

  onSwiper(swiper): void {
    console.log(swiper);
  }

  onSlideChange(): void {
    console.log('slide change');
  }

  ngOnInit(): void {
  }

}
