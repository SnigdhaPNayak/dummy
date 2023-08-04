import { Component } from '@angular/core';
import { iif, of } from 'rxjs';

@Component({
  selector: 'app-iff',
  templateUrl: './iff.component.html',
  styleUrls: ['./iff.component.css']
})
export class IffComponent {
 auth=true;
 obs$=iif(()=> this.auth, of(['Snigdha','Tanya']),of(1,2,3,4))
 .subscribe((res)=>{
 console.log(res)
 })

}
