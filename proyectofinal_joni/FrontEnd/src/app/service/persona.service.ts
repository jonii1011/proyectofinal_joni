import { HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { TransferState } from '@angular/platform-browser';
import { Observable } from 'rxjs';
import { persona } from '../model/persona.model';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  URL = 'http://localhost:8080/personas/';
  
  constructor(private http: HttpClient) { }

  public getPersona(): Observable<persona> {
   
    return this.http.get<persona>(this.URL + 'traer/perfil');

  }
}