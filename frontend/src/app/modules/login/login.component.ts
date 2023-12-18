import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { CompanyService } from 'src/app/core/services/company.service';
import { ToastrService } from 'ngx-toastr';
import { Company } from 'src/app/core/interfaces/company';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  public loginForm: FormGroup;
  private data: any;
  public email: string = '';
  public password: string = '';

  ngOnInit(): void {
    localStorage.clear();
  }

  constructor(
    private formBuilder: FormBuilder,
    private companyService: CompanyService,
    private route: Router,
    private toastrService: ToastrService
  ) {
      this.loginForm = this.formBuilder.group({
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required]],
    });
  }

  login(): void {
      // this.email = this.loginForm.get('email')!.value;
      // this.password = this.loginForm.get('password')!.value;

      // this.companyService.login(this.email, this.password).subscribe(
      //   response => {
      //     this.toastrService.success('Welcome!!');
      //     this.route.navigate(['home']);
      //   },
      //   error => {
      //     this.toastrService.error('Wrong Credentials!!')
      //   }
      // );
      this.companyService.getAllCompanies().subscribe(
        response => {
          this.data = response;
          this.toastrService.success(this.data);
          this.route.navigate(['home']);
        },
        error => {
            this.data = error;
            console.log(this.data);
        }
      )
  }


  // public onSubmit(): void {
  //   this.companyService.getCompanyEmail(this.loginForm.value).subscribe(
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

