import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Company } from 'src/app/core/interfaces/company';
import { CompanyService } from 'src/app/core/services/company.service';

@Component({
  selector: 'app-edit-user',
  templateUrl: './edit-user.component.html',
  styleUrls: ['./edit-user.component.css']
})
export class EditUserComponent {

  form!: FormGroup;

  constructor(private fb: FormBuilder, private companyService: CompanyService) {
    this.form = this.fb.group({
      id: [''],
      email: [''],
      password: [''],
      name: ['']
    });
  }

  updateProfile(): void {
    const id = this.form.get('id')!.value;
    const email = this.form.get('email')!.value;
    const name = this.form.get('name')!.value;
    const password =  this.form.get('password')!.value;

    const company: Company = {
      companyID: id,
      companyName: name,
      emailID: email,
      password: password,
    };
    console.log(company);
    this.companyService.updateCompany(company).subscribe((response) => {
      console.log('Update successful', response);
    },
    (error) => {
      console.error('Update failed', error);
    });
  }
}
