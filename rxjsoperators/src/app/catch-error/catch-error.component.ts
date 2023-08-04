import { Component } from '@angular/core';
import {map, catchError, from } from 'rxjs';

@Component({
  selector: 'app-catch-error',
  templateUrl: './catch-error.component.html',
  styleUrls: ['./catch-error.component.css']
})
export class CatchErrorComponent {

  array = [10, 20, 30, 0, 40];
  result = from(this.array);
data:Array<any>=[];
  result2 = this.result
    .pipe(
      map(n => {
        if (n === 0) {
          throw 'zero';
        }
        return n;
      }),
      catchError(err => 'z')
    )
    .subscribe(x => {console.log(x)
    this.data.push(x)});

}
