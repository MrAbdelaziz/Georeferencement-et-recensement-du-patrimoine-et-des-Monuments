import { Component, OnInit } from '@angular/core';


// import Swiper core and required components
import SwiperCore, {Navigation, Pagination, Scrollbar, A11y, Autoplay} from 'swiper/core';

// install Swiper components
SwiperCore.use([Navigation, Pagination, Scrollbar, A11y , Autoplay]);


interface Images{
  src: string;
  link: string;
}

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  Section2Images: Images[] = [];

  constructor() { }

  onSwiper(swiper): void {
    console.log(swiper);
  }

  onSlideChange(): void {
    console.log('slide change');
  }

  ngOnInit(): void {
    this.Section2Images.push({ src : 'static/...', link : '/paris/details'});
    this.Section2Images.push({ src : 'static/...', link : '/paris/details'});
    this.Section2Images.push({ src : 'static/...', link : '/paris/details'});
  }

}
