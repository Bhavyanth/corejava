import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BonusparametersaddComponent } from './bonusparametersadd.component';

describe('BonusparametersaddComponent', () => {
  let component: BonusparametersaddComponent;
  let fixture: ComponentFixture<BonusparametersaddComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BonusparametersaddComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BonusparametersaddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
