import { Component, OnInit } from '@angular/core';


// import Swiper core and required components
import SwiperCore, {Navigation, Pagination, Scrollbar, A11y, Autoplay} from 'swiper/core';

// install Swiper components
SwiperCore.use([Navigation, Pagination, Scrollbar, A11y , Autoplay]);


interface Images{
  src: string;
  link: string;
  title: string;
  description: string;
}

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  Section2Images: Images[] = [];

  constructor() {
    this.Section2Images.push({ src : 'https://d19m59y37dris4.cloudfront.net/directory/1-5/img/photo/new-york.jpg', link : 'https://google.com', title: "New York", description :"Américaa"});
    this.Section2Images.push({ src : 'https://d19m59y37dris4.cloudfront.net/directory/1-5/img/photo/new-york.jpg', link : 'https://google.com', title: "Paris",description :"La ville des lumières"});
    this.Section2Images.push({ src : 'https://d19m59y37dris4.cloudfront.net/directory/1-5/img/photo/new-york.jpg', link : 'https://google.com', title: "Rabat",description :"hay karima"});
  }

  onSwiper(swiper): void {
    console.log(swiper);
  }

  onSlideChange(): void {
    console.log('slide change');
  }

  ngOnInit(): void {

  }

}
