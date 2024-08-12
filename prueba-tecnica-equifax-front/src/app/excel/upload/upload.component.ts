import { Component } from '@angular/core';
import * as XLSX from 'xlsx';
import { ExcelDataService } from '../../services/excel-data.service';

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.css']
})
export class UploadComponent {
  data: any[] = [];

  constructor(private excelDataService: ExcelDataService) {}

  onFileChange(event: any) {
    const target: DataTransfer = <DataTransfer>(event.target);
    if (target.files.length !== 1) throw new Error('No se pueden usar múltiples archivos');

    const reader: FileReader = new FileReader();
    reader.onload = (e: any) => {
      const bstr: string = e.target.result;
      const wb: XLSX.WorkBook = XLSX.read(bstr, { type: 'binary' });

      const wsname: string = wb.SheetNames[0];
      const ws: XLSX.WorkSheet = wb.Sheets[wsname];

      this.data = <any[]>(XLSX.utils.sheet_to_json(ws, { header: 1 }));
      this.processData();
    };
    reader.readAsBinaryString(target.files[0]);
  }

  processData() {
    // Elimina la primera fila si contiene encabezados
    const rows = this.data.slice(1);

    rows.forEach(row => {
      const rowData = {
        id: row[0],
        name: row[1],
        description: row[2],
        // Otros campos según la estructura de tus datos
      };

      this.excelDataService.sendData(rowData).subscribe(response => {
        console.log('Datos enviados correctamente', response);
      }, error => {
        console.error('Error al enviar datos', error);
      });
    });
  }
}
