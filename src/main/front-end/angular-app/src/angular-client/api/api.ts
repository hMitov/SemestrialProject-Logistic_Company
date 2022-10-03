export * from './clientController.service';
import { ClientControllerService } from './clientController.service';
export * from './shipmentController.service';
import { ShipmentControllerService } from './shipmentController.service';
export const APIS = [ClientControllerService, ShipmentControllerService];
