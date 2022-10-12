import {Component, OnInit, ViewChild} from '@angular/core';
import {AgGridAngular} from "ag-grid-angular";
import {CellClickedEvent, ColDef, GridReadyEvent} from "ag-grid-community";
import {ShipmentApi, ShipmentService} from "../../../../angular-client";

@Component({
  selector: 'app-nav-profile',
  templateUrl: './nav-profile.component.html',
  styleUrls: ['./nav-profile.component.css']
})
export class NavProfileComponent implements OnInit {

  public rowData: ShipmentApi[];
  @ViewChild(AgGridAngular) agGrid: AgGridAngular;


  public columnDefs: ColDef[] = [
    {headerName: 'ShipmentId', field: 'shipmentId'},
    {headerName: 'Sender', field: 'sender'},
    {headerName: 'Recipient', field: 'recipient'},
  ];

  public defaultColDef: ColDef = {
    editable: false,
    sortable: true,
    resizable: true,
    flex: 1,
    minWidth: 100,
  };

  constructor(private shipmentService: ShipmentService) {
  }

  ngOnInit(): void {
    this.shipmentService.getAllShipments().subscribe(
      (shipments: ShipmentApi[]) => {
        this.rowData = shipments;
      }
    )
    // this.rowData = [
    //   {
    //     ArtNo: "100",
    //     Provider: "IPhone 11",
    //     ProviderArtNo: "1Yu",
    //     Brand: "Apple",
    //     Price: 7810.23,
    //     BuyAccount: "123",
    //   },
    //   {
    //     ArtNo: "101",
    //     Provider: "Samsung galaxy",
    //     ProviderArtNo: "1Yu",
    //     Brand: "Samsung",
    //     Price: 2310.23,
    //     BuyAccount: "123",
    //   },
    //   {
    //     ArtNo: "102",
    //     Provider: "Iphone 11 Pro",
    //     ProviderArtNo: "1Yu",
    //     Brand: "Apple",
    //     Price: 7810.23,
    //     BuyAccount: "123",
    //   },
    //   {
    //     ArtNo: "103",
    //     Provider: "Intex",
    //     ProviderArtNo: "1Yu",
    //     Brand: "Intex",
    //     Price: 5810.23,
    //     BuyAccount: "123",
    //   },
    //   {
    //     ArtNo: "100",
    //     Provider: "IPhone 11",
    //     ProviderArtNo: "1Yu",
    //     Brand: "Apple",
    //     Price: 7810.23,
    //     BuyAccount: "123",
    //   },
    //   {
    //     ArtNo: "101",
    //     Provider: "Samsung galaxy",
    //     ProviderArtNo: "1Yu",
    //     Brand: "Samsung",
    //     Price: 2310.23,
    //     BuyAccount: "123",
    //   },
    //   {
    //     ArtNo: "102",
    //     Provider: "Iphone 11 Pro",
    //     ProviderArtNo: "1Yu",
    //     Brand: "Apple",
    //     Price: 7810.23,
    //     BuyAccount: "123",
    //   },
    //   {
    //     ArtNo: "103",
    //     Provider: "Intex",
    //     ProviderArtNo: "1Yu",
    //     Brand: "Intex",
    //     Price: 5810.23,
    //     BuyAccount: "123",
    //   }
    // ];
  }


  onGridReady(params: GridReadyEvent) {

  }

  onCellClicked(e: CellClickedEvent): void {
    console.log('cellClicked', e);
  }

  clearSelection(): void {
    this.agGrid.api.deselectAll();
  }


}
