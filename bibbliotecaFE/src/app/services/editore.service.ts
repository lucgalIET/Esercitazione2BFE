import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Editore } from '../models/editore';
import { Observable } from 'rxjs';

const urlLocalHost = 'http://localhost:8080';
const requestMapping = '/api/editore';
const getMapping = '/get/all';
const postMapping = '/save';

@Injectable({
  providedIn: 'root'
})
export class EditoreService {
  constructor(private http: HttpClient) { }

  getAllEditore(): Observable<Editore[]> {
    return this.http.get<Editore[]>(urlLocalHost + requestMapping + getMapping);
  }

  saveAutore(editore: Editore ): Observable<Editore> {
    console.log("Siamo nel service saveLibro");
    console.log(editore);
    return this.http.post<any>(urlLocalHost + requestMapping + postMapping, editore)
  }







}
