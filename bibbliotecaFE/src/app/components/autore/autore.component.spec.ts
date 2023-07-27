import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AutoreComponent } from './autore.component';

describe('AutoreComponent', () => {
  let component: AutoreComponent;
  let fixture: ComponentFixture<AutoreComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AutoreComponent]
    });
    fixture = TestBed.createComponent(AutoreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
