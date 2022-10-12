import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {AuthService} from "./auth.service";

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  email: string;
  password: string;
  signInForm: FormGroup;

  constructor(private authService: AuthService, private route: ActivatedRoute, private router: Router) {
  }

  ngOnInit() {
    this.signInForm = new FormGroup({
      'email': new FormControl("admin", [Validators.email, Validators.required]),
      'password': new FormControl("admin", Validators.required)
    });
  }

  onClickSubmit(data: any) {
    this.email = data.email;
    this.password = data.password;

    console.log("Login page: " + this.email);
    console.log("Login page: " + this.password);

    /*this.authService.signin(this.email, this.password)
      .subscribe(data => {
        console.log("Is Login Success: " + data);

        if (data) {*/
          this.router.navigate(['../home'],{relativeTo: this.route});
      /*  }
      });*/
  }
}
