import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UsermaintenanceComponent } from './usermaintenance.component';

describe('UsermaintenanceComponent', () => {
  let component: UsermaintenanceComponent;
  let fixture: ComponentFixture<UsermaintenanceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UsermaintenanceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsermaintenanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
