/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import java.util.Scanner;


/**
 *
 * @author ulisss
 */
public class TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner selEj;
        String seguir, ejSel;
        seguir = "S";
        while ("S".equals(seguir.toUpperCase())) {
            System.out.print("Ingrese el ejercicio que desea ver (1-5): ");
            selEj = new Scanner(System.in);
            ejSel = selEj.nextLine();
            switch (ejSel)
            {
                case "1":
                    System.out.println("El ejercicio 1 fue explicado en el documento (.odf) adjunto.");
                    break;
                case "2": 
                    EJ2 ej2 = new EJ2();
                    ej2.resolucion();
                    break;
                case "3": 
                    EJ3 ej3 = new EJ3();
                    ej3.resolucion();
                    break;
                case "4": 
                    EJ4 ej4 = new EJ4();
                    ej4.resolucion();
                    break;
                case "5": 
                    EJ5 ej5 = new EJ5();
                    ej5.resolucion();
                    break;
                default:
                    System.out.println("Ingrese un numero valido (entre 1 y 5)");
            }
            
        }
   }
    
}
