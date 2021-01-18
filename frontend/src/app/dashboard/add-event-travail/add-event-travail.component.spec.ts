import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEventTravailComponent } from './add-event-travail.component';

describe('AddEventTravailComponent', () => {
  let component: AddEventTravailComponent;
  let fixture: ComponentFixture<AddEventTravailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddEventTravailComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEventTravailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
