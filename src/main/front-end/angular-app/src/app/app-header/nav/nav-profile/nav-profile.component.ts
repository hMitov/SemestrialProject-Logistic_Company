import {Component, OnInit, ViewChild} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {Observable} from "rxjs";
import {AgGridAngular} from "ag-grid-angular";
import {CellClickedEvent, ColDef, GridReadyEvent} from "ag-grid-community";

@Component({
  selector: 'app-nav-profile',
  templateUrl: './nav-profile.component.html',
  styleUrls: ['./nav-profile.component.css']
})
export class NavProfileComponent implements OnInit {

  public rowData$!: Observable<any[]>;
  @ViewChild(AgGridAngular) agGrid!: AgGridAngular;


  public columnDefs: ColDef[] = [
    {headerName: '', field: 'make'},
    {field: 'model'},
    {field: 'price'}
  ];

  public defaultColDef: ColDef = {
    sortable: true,
    filter: true,
  };

  constructor() {
  }

  ngOnInit(): void {
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
