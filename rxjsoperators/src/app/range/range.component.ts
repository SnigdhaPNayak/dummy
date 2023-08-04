import { Component } from '@angular/core';
import { range, toArray } from 'rxjs';

@Component({
  selector: 'app-range',
  templateUrl: './range.component.html',
  styleUrls: ['./range.component.css']
})
export class RangeComponent {
    data: any;
    ngOnInit(){
let source$=range(3,10)
source$.pipe(toArray()).subscribe((res)=>{
this.data=res
  console.log(res)
})
}
}
