import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddMonumentComponent } from './add-monument.component';

describe('AddMonumentComponent', () => {
  let component: AddMonumentComponent;
  let fixture: ComponentFixture<AddMonumentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddMonumentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddMonumentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
