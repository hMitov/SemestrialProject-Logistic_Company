import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {NavHomeComponent} from "./app-header/nav/nav-home/nav-home.component";
import {NavContactUsComponent} from "./app-header/nav/nav-contact-us/nav-contact-us.component";
import {NavOfficesComponent} from "./app-header/nav/nav-offices/nav-offices.component";
import {NavDeliveryServicesComponent} from "./app-header/nav/nav-delivery-services/nav-delivery-services.component";
import {NavAboutUsComponent} from "./app-header/nav/nav-about-us/nav-about-us.component";
import {NavCreateShipmentComponent} from "./app-header/nav/nav-create-shipment/nav-create-shipment.component";
import {NavProfileComponent} from "./app-header/nav/nav-profile/nav-profile.component";

const routes: Routes = [
  {
    path:'',
    redirectTo: '/home',
    pathMatch: 'full'
  },
  {
    path: 'home',
    component: NavHomeComponent
  },
  {
    path: 'about-us',
    component: NavAboutUsComponent
  },
  {
    path: 'services',
    component: NavDeliveryServicesComponent
  },
  {
    path: 'offices',
    component: NavOfficesComponent
  },
  {
    path: 'contact-us',
    component: NavContactUsComponent
  },
  {
    path: 'create-shipment',
    component: NavCreateShipmentComponent
  },
  {
    path: 'profile',
    component: NavProfileComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
