/**
 * Products REST API
 * RESTful API for Products
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */import { RecipientApi } from './recipientApi';
import { SenderApi } from './senderApi';


export interface ShipmentApi { 
    recipient?: RecipientApi;
    sender?: SenderApi;
    shipmentId?: number;
}