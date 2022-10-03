import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'nav-create-shipment',
  templateUrl: './nav-create-shipment.component.html',
  styleUrls: ['./nav-create-shipment.component.css']
})
export class NavCreateShipmentComponent implements OnInit {
  createShipment: FormGroup;

  constructor() {
  }

  ngOnInit(): void {
    this.createShipment = new FormGroup({
      'senderInfo': new FormGroup({
        'firstName': new FormControl('', Validators.required),
        'lastName': new FormControl('', Validators.required),
        'country': new FormControl('', Validators.required),
        'city': new FormControl('', Validators.required),
        'telephone': new FormControl('', Validators.required),
        'email': new FormControl('', [Validators.required, Validators.email]),
        'officeOrAddress': new FormControl('', Validators.required),
        'officeOrAddressLocation': new FormControl('', Validators.required),
      })
    });
  }

  onSubmit() {
    console.log(this.createShipment);
  }

}
