import { Component } from '@angular/core';
import { Subscription, interval, map, tap, toArray } from 'rxjs';

@Component({
  selector: 'app-tap',
  templateUrl: './tap.component.html',
  styleUrls: ['./tap.component.css']
})
export class TapComponent {




  names=['Snigdha','Tanya','Shreya','Vivek','Divya']
  source=interval(1000);
  
  data!: any;
value:Array<String>=[];
  sub: Subscription=this.source.pipe(
    tap(res=>{
      if(res==4){
      this.sub.unsubscribe()
      }
    }),
  map(res=>this.names[res])
  ).subscribe(res=>{
    this.value.push(res)
    this.data=res
    console.log(res);
  })
 
  

}

