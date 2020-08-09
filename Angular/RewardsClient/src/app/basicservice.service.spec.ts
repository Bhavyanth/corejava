import { TestBed } from '@angular/core/testing';

import { BasicserviceService } from './basicservice.service';

describe('BasicserviceService', () => {
  let service: BasicserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BasicserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
