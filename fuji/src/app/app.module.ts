import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { FormsModule } from '@angular/forms';
import { CarouselTopComponent } from './carousel-top/carousel-top.component';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    CarouselTopComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
