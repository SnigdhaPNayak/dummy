import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PluckComponent } from './pluck/pluck.component';
import { TakeComponent } from './take/take.component';
import { TapComponent } from './tap/tap.component';
import { CombinelatestComponent } from './combinelatest/combinelatest.component';
import { CatchErrorComponent } from './catch-error/catch-error.component';
import { FilterComponent } from './filter/filter.component';
import { RangeComponent } from './range/range.component';
import { IffComponent } from './iff/iff.component';

export const routes: Routes = [
  { path: 'pluck', component: PluckComponent },
  { path: 'take', component: TakeComponent },
  { path: 'tap', component: TapComponent },
  { path: 'combineLatest', component: CombinelatestComponent },
  { path: 'catchError', component: CatchErrorComponent },
  { path: 'filter', component: FilterComponent },
  { path: 'range', component: RangeComponent },
  { path: 'iff', component: IffComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
