import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {AuthService} from "../sign-in/auth.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  email: string;
  password: string;
  telephone: string;
  signUpForm: FormGroup;

  constructor(private authService: AuthService, private route: ActivatedRoute, private router: Router) {
  }

  ngOnInit() {
    this.signUpForm = new FormGroup({
      'email': new FormControl("admin", [Validators.email, Validators.required]),
      'password': new FormControl("admin", Validators.required),
      'telephone': new FormControl('', Validators.required)
    });
  }

  onClickSubmit(data: any) {
    this.email = data.email;
    this.password = data.password;
    this.telephone = data.telephone;

    console.log("SignUp page: " + this.email);
    console.log("SignUp page: " + this.password);
    console.log("SignUp page: " + this.telephone);

    this.router.navigate(['../home'], {relativeTo: this.route});
  }

}
