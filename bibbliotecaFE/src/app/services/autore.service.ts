import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Autore } from '../models/autore';

const urlLocalHost = 'http://localhost:8080';
const requestMapping = '/api/autore';
const getMapping = '/get/all';

@Injectable({
  providedIn: 'root'
})
export class AutoreService {

  constructor(private http: HttpClient) { }

  getAllAutori(): Observable<Autore[]> {
    return this.http.get<Autore[]>(urlLocalHost + requestMapping + getMapping);
  }
}
