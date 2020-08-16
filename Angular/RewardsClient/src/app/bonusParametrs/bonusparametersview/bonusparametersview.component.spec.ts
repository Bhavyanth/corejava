import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BonusparametersviewComponent } from './bonusparametersview.component';

describe('BonusparametersviewComponent', () => {
  let component: BonusparametersviewComponent;
  let fixture: ComponentFixture<BonusparametersviewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BonusparametersviewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BonusparametersviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
