import { Injectable } from'@angular/core';
import { HttpClient } from '@angular/common/http';
import { Autore } from '../models/autore';
import { Observable } from 'rxjs';

const urlLocalHost = 'http://localhost:8080';
const requestMapping = '/api/autore';
const getMapping = '/get/all';
const postMapping = '/save';

@Injectable({
  providedIn: 'root',
})
export class AutoreService {

  constructor(private http: HttpClient) { }

  getAllAutori(): Observable<Autore[]> {
    return this.http.get<Autore[]>(urlLocalHost + requestMapping + getMapping);
  }

  saveAutore(autore: Autore): Observable<Autore> {
    console.log("Siamo nel service saveAutore");
    console.log(autore);
    return this.http.post<any>(urlLocalHost + requestMapping + postMapping, autore)
  }

}
