import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UsermaintenancebaseComponent } from './usermaintenancebase.component';

describe('UsermaintenancebaseComponent', () => {
  let component: UsermaintenancebaseComponent;
  let fixture: ComponentFixture<UsermaintenancebaseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UsermaintenancebaseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsermaintenancebaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
