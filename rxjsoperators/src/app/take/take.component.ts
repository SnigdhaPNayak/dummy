import { Component } from '@angular/core';
import { interval, take, toArray, from, takeLast, takeUntil, timer } from 'rxjs';

@Component({
  selector: 'app-take',
  templateUrl: './take.component.html',
  styleUrls: ['./take.component.css']
})
export class TakeComponent {
data1!: any;
data2!:any;

names=['Snigdha','Tanya','Shreya','Vivek','Divya']
  name1!: any;
  name2!: any;
ngOnInit(){

  from(this.names).pipe(take(3),toArray()).subscribe(res=>{
    this.name1=res
   })

 from(this.names).pipe(takeLast(2),toArray()).subscribe(res=>{
  this.name2=res
 })
  const source=interval(1000).pipe(
    take(5),toArray()
   
  )

  source.subscribe(res=>{
    // console.log(res)
     this.data1=res
   })

   const source2=interval(1000).pipe(
    takeUntil(timer(5000)),toArray()
   
  )

source2.subscribe(res=>{
  this.data2=res
})

 

  


}
}
