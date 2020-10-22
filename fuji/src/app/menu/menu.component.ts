import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})

export class MenuComponent implements OnInit {
  
  search: string;
  appareilStatus: string = 'éteint';
 
  

  constructor() {}

  ngOnInit(): void {
  }

 

}
