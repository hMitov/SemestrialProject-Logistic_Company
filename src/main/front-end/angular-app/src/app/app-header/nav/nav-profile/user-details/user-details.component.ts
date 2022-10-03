import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {
  userForm: FormGroup;
  rowNames: string[] = ['First Name', 'Last Name', 'Email', 'Telephone', 'Address'];
  rowControls: string[] = [];

  constructor() {
  }

  ngOnInit(): void {
    this.userForm = new FormGroup({
      'firstName': new FormControl('Ivan', Validators.required),
      'lastName': new FormControl('Zlatkov', Validators.required),
      'email': new FormControl('vankara@abv.bg', Validators.required),
      'telephone': new FormControl('0987654321', Validators.required),
      'address': new FormControl('man livadi', Validators.required)
    });
    this.iterate(this.userForm);
    console.log(this.rowControls);
  }

  iterate(form: FormGroup) {
    Object.keys(this.userForm.controls).forEach((key: string) => {
      const abstractControl = this.userForm.get(key);
      if (abstractControl instanceof FormGroup) {
        this.iterate(abstractControl);
      } else {
        this.rowControls.push(key);
      }
    });
  }


}
