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

  Section1Images: string[];
  Section2Images: Images[] = [];
  slider: string;

  constructor() {
    this.Section2Images.push({ src : 'assets/img/new-york.jpg', link : 'https://google.com', title: 'New York', description : 'Américaa'});
    this.Section2Images.push({ src : 'assets/img/new-york.jpg', link : 'https://google.com', title: 'Paris', description : 'La ville des lumières'});
    this.Section2Images.push({ src : 'assets/img/new-york.jpg', link : 'https://google.com', title: 'Rabat', description : 'hay karima'});
    this.Section2Images.push({ src : 'assets/img/new-york.jpg', link : 'https://google.com', title: 'New York', description : 'Américaa'});
    this.Section2Images.push({ src : 'assets/img/new-york.jpg', link : 'https://google.com', title: 'Paris', description : 'La ville des lumières'});
    this.Section2Images.push({ src : 'assets/img/new-york.jpg', link : 'https://google.com', title: 'Rabat', description : 'hay karima'});
    this.Section2Images.push({ src : 'assets/img/new-york.jpg', link : 'https://google.com', title: 'New York', description : 'Américaa'});
    this.Section2Images.push({ src : 'assets/img/new-york.jpg', link : 'https://google.com', title: 'New York', description : 'Américaa'});

    this.Section1Images = ['/assets/img/slide1.jpg', '/assets/img/slide2.jpg', '/assets/img/slide3.jpeg'];

    setInterval(() => {
      this.slider = this.Section1Images[Math.floor(Math.random() * this.Section1Images.length)];
    }, 3 * 1000);

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
