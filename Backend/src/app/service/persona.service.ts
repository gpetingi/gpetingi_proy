import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {persona} from '../Model/persona.model';

@Injectable({
  providedIn: 'root'
})


export class PersonaService {
  URL = 'http://localhost:8080/personas/';

  headers = new HttpHeaders({
    'Access-Control-Allow-Origin': 'http://localhost:4200',
    'Access-Control-Allow-Headers': 'Access-Control-Allow-Origin'
  });

  constructor(private http: HttpClient) {
  }

  public getPersona(): Observable<persona> {


    return this.http.get<persona>(this.URL + 'traer/perfil', {
      headers: this.headers
    });
  }
}
