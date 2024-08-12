import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './public/login/login.component';
import { DataComponent } from './private/data/data.component';
import { AuthGuard } from './guards/auth.guard';
import { UploadComponent } from './excel/upload/upload.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'data', component: DataComponent, canActivate: [AuthGuard] },
  { path: 'upload-excel', component: UploadComponent, canActivate: [AuthGuard] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
