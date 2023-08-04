import { Component } from '@angular/core';
import { from, pluck, toArray } from 'rxjs';

@Component({
  selector: 'app-pluck',
  templateUrl: './pluck.component.html',
  styleUrls: ['./pluck.component.css']
})
export class PluckComponent {

  users=[
    {name: "Snigdha", skill: "Java",
  job:{
    title:'Sales'
  }},
    {name: "Roja", skill: "CSS",
    job:{
      title:'Marketing'
    }},
    {name: "Vivek", skill: "HTML",
    job:{
      title:'Developer'
    }},
    {name: "Tanya", skill: "C++",
    job:{
      title:'Tester'
    }},
  ];
  data: any;
  data2: any;
ngOnInit(){
  from(this.users).pipe(pluck('name'),toArray()).subscribe(res=>{
    this.data=res})
    
    from(this.users).pipe(pluck('job','title'),toArray()).subscribe(res=>{
      this.data2=res})

}
}
