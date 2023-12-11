import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
// import { UserService } from '../../../core/services/user.service';
// import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public loginForm: FormGroup;
  private data: any;

  ngOnInit(): void {
    localStorage.clear();
  }

  constructor(
    private formBuilder: FormBuilder,
    // private service: UserService,
    private route: Router,
    // private toastrService: ToastrService
  ) {
      this.loginForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required]],
    });
  }

  // public onSubmit(): void {
  //   this.service.logIn(this.loginForm.value).subscribe(
  //     (res) => {
  //       this.data = res;
  //       if (this.data.status === 'success') {
  //         this.toastrService.success('Welcome');
  //         localStorage.setItem('token', this.data.data.token);
  //           this.route.navigate(['home/main']);
  //       }
  //     },
  //     (err) => {this.toastrService.error('Wrong Credentials!!')}
  //   );
  // }
}

