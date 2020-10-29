import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RolesmaintenanceComponent } from './rolesmaintenance.component';

describe('RolesmaintenanceComponent', () => {
  let component: RolesmaintenanceComponent;
  let fixture: ComponentFixture<RolesmaintenanceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RolesmaintenanceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RolesmaintenanceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
