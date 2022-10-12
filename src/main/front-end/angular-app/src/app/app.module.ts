import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {AppHeaderComponent} from './app-header/app-header.component';
import {NavAboutUsComponent} from './app-header/nav/nav-about-us/nav-about-us.component';
import {NavDeliveryServicesComponent} from './app-header/nav/nav-delivery-services/nav-delivery-services.component';
import {NavOfficesComponent} from './app-header/nav/nav-offices/nav-offices.component';
import {NavContactUsComponent} from './app-header/nav/nav-contact-us/nav-contact-us.component';
import {NavHomeComponent} from './app-header/nav/nav-home/nav-home.component';
import {ReactiveFormsModule} from "@angular/forms";
import {NavCreateShipmentComponent} from './app-header/nav/nav-create-shipment/nav-create-shipment.component';
import {ShipmentSenderComponent} from './app-header/nav/nav-create-shipment/shipment-sender/shipment-sender.component';
import {NavProfileComponent} from './app-header/nav/nav-profile/nav-profile.component';
import {UserDetailsComponent} from './app-header/nav/nav-profile/user-details/user-details.component';
import {
  UserDetailRowComponent
} from './app-header/nav/nav-profile/user-details/user-detail-row/user-detail-row.component';
import {AgGridModule} from "ag-grid-angular";
import {SignInComponent} from './sign/sign-in/sign-in.component';
import {AuthService} from "./sign/sign-in/auth.service";
import {SignUpComponent} from './sign/sign-up/sign-up.component';
import {ShipmentService} from "../angular-client";
import {HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    AppHeaderComponent,
    NavAboutUsComponent,
    NavDeliveryServicesComponent,
    NavOfficesComponent,
    NavContactUsComponent,
    NavHomeComponent,
    NavCreateShipmentComponent,
    ShipmentSenderComponent,
    NavProfileComponent,
    UserDetailsComponent,
    UserDetailRowComponent,
    SignInComponent,
    SignUpComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    AgGridModule,
    HttpClientModule
  ],
  providers: [AuthService, ShipmentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
