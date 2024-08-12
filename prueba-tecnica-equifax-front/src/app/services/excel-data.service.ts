import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ExcelDataService {

  private apiUrl = 'https://tu-api.com/data';

  constructor(private http: HttpClient) {}

  sendData(data: any) {
    return this.http.post(`${this.apiUrl}`, data);
  }
}
