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
export class LoginComponent{

  public loginForm: FormGroup;
  public email: string = '';
  public password: string = '';
  public id!: number;
  databasePassword: any;
  myData!: any;

  constructor(
    private formBuilder: FormBuilder,
    private companyService: CompanyService,
    private route: Router,
    private toastrService: ToastrService
  ) {
      this.loginForm = this.formBuilder.group({
      email: ['', [Validators.email]],
      password: [''],
      id: ['']
    });
  }

  ngOnInit(): void {
    localStorage.clear();
  }

  login(): void {
      this.email = this.loginForm.get('email')!.value;
      this.password = this.loginForm.get('password')!.value;
      this.id = this.loginForm.get('id')!.value;
      console.log(this.id)

      this.companyService.getCompany(this.id).subscribe(
        response => {
          this.myData = response;
          console.log(this.myData);
          if(this.password.match(this.myData.password)  && this.email.match(this.myData.email) ) {
            localStorage.setItem('token', "Access");
            this.toastrService.success('Welcome!!');
            this.route.navigate(['/home']);
            }
          },
        error => {
          console.log(error)
          this.toastrService.error('Wrong Credentials!!')
        }
      );
  }

  // login(): void {
  //   this.route.navigate(['home']);
  // }


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

