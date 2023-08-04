import { Component } from '@angular/core';
import { filter, map, of, toArray } from 'rxjs';

@Component({
  selector: 'app-filter',
  templateUrl: './filter.component.html',
  styleUrls: ['./filter.component.css']
})
export class FilterComponent {

  arr!:any
  array=of(1,2,3,4).pipe(toArray()).subscribe(res=>{
    this.arr=res
  })
  value!:any
  result=of(1,2,3,4)
  .pipe(filter((value)=>value%2==0),map((value)=>{
    return value*10;
  }),toArray()
  ).subscribe((data)=>{
    this.value=data
    console.log(data);
  });

}


