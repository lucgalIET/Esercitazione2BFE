import { TestBed } from '@angular/core/testing';

import { AutoreService } from './autore.service';

describe('AutoreService', () => {
  let service: AutoreService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AutoreService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
