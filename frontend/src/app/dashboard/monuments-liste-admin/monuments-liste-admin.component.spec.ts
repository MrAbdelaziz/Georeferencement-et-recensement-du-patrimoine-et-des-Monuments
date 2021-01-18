import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MonumentsListeAdminComponent } from './monuments-liste-admin.component';

describe('MonumentsListeAdminComponent', () => {
  let component: MonumentsListeAdminComponent;
  let fixture: ComponentFixture<MonumentsListeAdminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MonumentsListeAdminComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MonumentsListeAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
