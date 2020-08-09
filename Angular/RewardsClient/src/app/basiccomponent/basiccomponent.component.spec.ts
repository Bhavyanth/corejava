import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasiccomponentComponent } from './basiccomponent.component';

describe('BasiccomponentComponent', () => {
  let component: BasiccomponentComponent;
  let fixture: ComponentFixture<BasiccomponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasiccomponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasiccomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
