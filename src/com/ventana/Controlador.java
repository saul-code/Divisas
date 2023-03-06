package com.ventana;

public class Controlador {

   Double divisa1;
   Double divisa2;
   Controlador(double divisa1,double divisa2){
      this.divisa1 = divisa1;
      this.divisa2 = divisa2;
   }

   //Método que convierte dolar a peso
   public static double dolarApeso(double a){
      return a*18.80;
   }

}
