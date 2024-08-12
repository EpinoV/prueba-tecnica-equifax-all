import { Component } from '@angular/core';
import { AuthService } from '../../services/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  constructor(private authService: AuthService, private router: Router) {}

  onSubmit() {
    this.authService.login({ email: this.username, password: this.password }).subscribe((response: any) => {
      localStorage.setItem('token', response.access_token);
      this.router.navigate(['/data']);
    }, (error) => {
      console.error('Login failed', error);
    });
  }
}
