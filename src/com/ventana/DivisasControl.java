package com.ventana;

import static com.ventana.DivisasControl.Divisas.*;
import static com.ventana.DivisasControl.Divisas.DOLAR;

public class DivisasControl {
   public enum Divisas{
      DOLAR(1,18.03,0.94,0.72,5.16),
      PESO(0.055,1,0.052,0.046,0.28),
      EURO(1.06,19.17,1,0.88,5.49),
      LIBRA(1.19,21.56,1.12,1,6.17),
      REAL(0.19,3.57,0.18,0.16,1);

      double dlr,mxn,eue,gbp,brl;

      Divisas(double dolar, double peso, double euro, double libra, double real){
         dlr = dolar;
         mxn = peso;
         eue = euro;
         gbp = libra;
         brl = real;
      }

   }
   Double divisa1;
   Double divisa2;
   DivisasControl(double divisa1, double divisa2){
      this.divisa1 = divisa1;
      this.divisa2 = divisa2;
   }

   /**
    * Metodo que convierte dolar a peso o peso a dolar.
    * @param a dolar
    * @param b peso
    * @param sentido true si es de dolar a peso, false si es de peso a dolar
    * @return resultado de la conversion
    */
   public static double dolarPeso(double a,double b,boolean sentido){
      if(sentido){
         return a*18.80;
      }else {
         return b/18.80;
      }
   }

   public static double convierte(Divisas a, Divisas b, double cantidad){
      switch (a){
         case DOLAR:
            return cantidad*b.dlr;
         case PESO:
            return cantidad*b.mxn;
         case EURO:
            return cantidad*b.eue;
         case LIBRA:
            return cantidad*b.gbp;
         case REAL:
            return cantidad*b.brl;
         default:
            return 0;
      }
   }

}
