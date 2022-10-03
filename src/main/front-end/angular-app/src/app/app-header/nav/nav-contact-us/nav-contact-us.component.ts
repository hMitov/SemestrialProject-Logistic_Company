import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'nav-contact-us',
  templateUrl: './nav-contact-us.component.html',
  styleUrls: ['./nav-contact-us.component.css']
})
export class NavContactUsComponent implements OnInit {
  contactForm: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    this.contactForm = new FormGroup({
      'firstName': new FormControl(null, Validators.required),
      'lastName': new FormControl(null, Validators.required),
      'email': new FormControl(null, [Validators.required, Validators.email]),
      'regarding': new FormControl(null, Validators.required),
      'message': new FormControl(null, Validators.required)
    });
  }

  onSubmit() {
    console.log(this.contactForm);
  }

}
