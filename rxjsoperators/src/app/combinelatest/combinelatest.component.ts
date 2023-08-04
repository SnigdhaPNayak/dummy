import { Component } from '@angular/core';
import { Observable,combineLatest } from 'rxjs';

@Component({
  selector: 'app-combinelatest',
  templateUrl: './combinelatest.component.html',
  styleUrls: ['./combinelatest.component.css']
})
export class CombinelatestComponent {
data!:any
  source1$= new Observable((observer)=>{
    let number=0;
    for(let i=1000;i<=20000;i+=1000){
    setTimeout(()=>{
      if(number==12){
        observer.error('error');
      }
      observer.next(number++);
    },i);
  }
  });

  sourec2$=new Observable((observer)=>{
    setTimeout(()=>{
      observer.next(10);
    },5000);
  });

  combinedTimers = combineLatest([this.source1$, this.sourec2$]).subscribe(value =>{
    console.log(value)
    this.data=value
  } );
  



}
