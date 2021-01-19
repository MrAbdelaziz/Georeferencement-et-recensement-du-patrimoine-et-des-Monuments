import { Component, OnInit } from '@angular/core';
import { FormGroup ,FormBuilder, Validators} from '@angular/forms';
import { HttpClient } from '@angular/common/http';



export interface Monument{
name:string;
dateCreatetion:string;
adresse:string;
altitude: number;
longitude: number;
typeMonu:string;
region:string;
  status:string;

}


@Component({
  selector: 'app-add-monument',
  templateUrl: './add-monument.component.html',
  styleUrls: ['./add-monument.component.css']
})

export class AddMonumentComponent implements OnInit {
  monumentForm: FormGroup;
  error: string | undefined;
  success: string;
  isPassed: boolean = false;
  id: number;


  constructor(private formBuilder: FormBuilder, private httpClient: HttpClient) {
    this.createForm();
  }

  ngOnInit(): void {

  }


  newMonument() {

    console.log("monument form", this.monumentForm.value);
    const monument= this.httpClient.post('', this.monumentForm.value);

    monument.subscribe(
      (monument: Monument) => {
        console.log("monument", monument);
        this.isPassed = true;
        this.success = "monument crée avec succès";
      },
      error => {
        console.log("error", error);
        this.isPassed = false;
        this.error = error.error.message;
      }
    );
  }

  private createForm() {
    this.monumentForm = this.formBuilder.group({
      id: "",
      name:['', Validators.required],
      dateCreatetion:['', Validators.required],
      adresse:['', Validators.required],
      altitude:['', Validators.required],
      longitude:['', Validators.required],
      typeMonu:['', Validators.required],
      region:['', Validators.required],
      status:"en attente"

    });
  }}
