/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import java.util.Scanner;
/**
 *
 * @author ulisss
 */
public class EJ4 {
    public int resolucion()
    {
        Scanner obtGan;
        double gan, porc, aPagar;
        System.out.print("Ingrese las ganancias obtenidas por la empresa en el periodo fiscal: ");
        obtGan = new Scanner(System.in);
        gan = Double.parseDouble(obtGan.nextLine());
        porc = this.obtenerPorcentajeACobrar(gan);
        aPagar = gan * porc;
        if (porc < 0) {return 1;}
        System.out.println("La empresa debera abonar el "+porc*100+"% de las ganancias.\n\tEl monto detallado es de: $"+aPagar);
        return 0;
    }
    
    public double obtenerPorcentajeACobrar(double ganancias)
    {
       if ( ganancias < 0) {System.out.print("Ingrese algun valor positivo"); return -1;}
       
       if ( ganancias > 0 && ganancias <= 100 ) {
           return 0.1;
       } else if ( ganancias > 100 && ganancias <= 10000 ) {
           return 0.2;
       } else if ( ganancias > 10000 ){
           return 0.3;
       }
       return 0;
    }
}
