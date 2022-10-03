import {Component, Input, OnInit} from '@angular/core';
import {FormGroup, FormGroupDirective} from "@angular/forms";

@Component({
  selector: 'app-shipment-sender',
  templateUrl: './shipment-sender.component.html',
  styleUrls: ['./shipment-sender.component.css']
})
export class ShipmentSenderComponent implements OnInit {
  @Input() formGroupName: string
  form: FormGroup;

  constructor(private parentForm : FormGroupDirective) {}


  ngOnInit(): void {
    this.form = this.parentForm.control.get(this.formGroupName) as FormGroup;
  }

}
