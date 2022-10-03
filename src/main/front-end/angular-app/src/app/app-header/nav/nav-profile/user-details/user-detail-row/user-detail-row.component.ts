import {Component, Input, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormControlDirective, FormGroup, FormGroupDirective} from "@angular/forms";

@Component({
  selector: 'app-user-detail-row',
  templateUrl: './user-detail-row.component.html',
  styleUrls: ['./user-detail-row.component.css']
})
export class UserDetailRowComponent implements OnInit {
  ableForUpdate: boolean = false;
  @Input() parentControlKey: string;
  @Input() parentControlHeader: string;
  parentFormControlName: FormControl;

  constructor(private parentForm: FormGroupDirective) {
  }

  ngOnInit(): void {
    this.parentFormControlName = this.parentForm.control.get(this.parentControlKey) as FormControl;
    console.log(this.parentControlKey);
    console.log(this.parentFormControlName);
  }

  updateControl() {
    this.ableForUpdate = !this.ableForUpdate;
  }

}
