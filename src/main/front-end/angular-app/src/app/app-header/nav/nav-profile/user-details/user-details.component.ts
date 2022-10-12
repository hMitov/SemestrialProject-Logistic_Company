import {Component, OnInit, ViewChild} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CellClickedEvent, ColDef, GridReadyEvent} from 'ag-grid-community';
import {Observable} from 'rxjs';
import {AgGridAngular} from "ag-grid-angular";

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {
  userForm: FormGroup;
  rowNames: string[] = ['First Name', 'Last Name', 'Email', 'Telephone', 'Address'];
  rowControls: string[] = [];
  public rowData$!: Observable<any[]>;
  @ViewChild(AgGridAngular) agGrid!: AgGridAngular;


  public columnDefs: ColDef[] = [
    {field: 'make'},
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
    this.userForm = new FormGroup({
      'firstName': new FormControl('Ivan', Validators.required),
      'lastName': new FormControl('Zlatkov', Validators.required),
      'email': new FormControl('vankara@abv.bg', Validators.required),
      'telephone': new FormControl('0987654321', Validators.required),
      'address': new FormControl('man livadi', Validators.required)
    });
    this.iterate(this.userForm);
    console.log(this.rowControls);
  }

  iterate(form: FormGroup) {
    Object.keys(this.userForm.controls).forEach((key: string) => {
      const abstractControl = this.userForm.get(key);
      if (abstractControl instanceof FormGroup) {
        this.iterate(abstractControl);
      } else {
        this.rowControls.push(key);
      }
    });
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
