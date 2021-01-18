import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConstatsListeAdminComponent } from './constats-liste-admin.component';

describe('ConstatsListeAdminComponent', () => {
  let component: ConstatsListeAdminComponent;
  let fixture: ComponentFixture<ConstatsListeAdminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConstatsListeAdminComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConstatsListeAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
