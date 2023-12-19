import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Company } from 'src/app/core/interfaces/company';
import { CompanyService } from 'src/app/core/services/company.service';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css'],
})
export class RegisterUserComponent {
  public users: any;
  public userForm: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private userService: CompanyService,
    private router: Router,
    private toastrService: ToastrService
  ) {
    this.userForm = this.formBuilder.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', Validators.required],
    });
  }

  public onSubmit(): void {


    if (this.userForm.valid) {
      const email= this.userForm.get('email')!.value;
      const password = this.userForm.get('password')!.value;
      const name = this.userForm.get('name')!.value;

      const company: Company = {
        companyName: name,
        emailID: email,
        password: password,
      };

      console.log(company);

      this.userService
        .createCompany(company)
        .subscribe((item) => {
          console.log(item)
          this.toastrService.success('User added successfully!');
        });
      this.router.navigate(['/login']);
    } else {
      this.toastrService.warning('User was not added!');
    }
  }
}
