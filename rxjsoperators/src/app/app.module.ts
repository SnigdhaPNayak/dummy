import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PluckComponent } from './pluck/pluck.component';
import { TakeComponent } from './take/take.component';
import { TapComponent } from './tap/tap.component';
import { CombinelatestComponent } from './combinelatest/combinelatest.component';
import { CatchErrorComponent } from './catch-error/catch-error.component';
import { FilterComponent } from './filter/filter.component';
import { RangeComponent } from './range/range.component';
import { IffComponent } from './iff/iff.component';

@NgModule({
  declarations: [
    AppComponent,
    PluckComponent,
    TakeComponent,
    TapComponent,
    CombinelatestComponent,
    CatchErrorComponent,
    FilterComponent,
    RangeComponent,
    IffComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
