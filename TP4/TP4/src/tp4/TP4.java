/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;

import java.util.Scanner;

/**
 *
 * @author ulisss
 */
public class TP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner selEj;
        String seguir, ejSel;
        seguir = "S";
        while ("S".equals(seguir.toUpperCase())) {
            System.out.print("Ingrese un numero valido (1, 2, 3, [6, 7]): ");
            selEj = new Scanner(System.in);
            ejSel = selEj.nextLine();
            switch (ejSel)
            {
                case "1":
                    EJ1 ej1 = new EJ1();
                    ej1.resolucion();
                    break;
                case "2":
                    EJ2 ej2 = new EJ2();
                    ej2.resolucion();
                    break;
                case "3":
                    EJ3 ej3 = new EJ3();
                    ej3.resolucion();
                    break;
                case "6":
                    EJ6 ej6 = new EJ6();
                    ej6.resolucion();
                    break;
                case "7":
                    EJ7 ej7 = new EJ7();
                    ej7.resolucion();
                    break;
                default:
                    System.out.print("Ingrese un numero valido (1, 2, 3, [6, 7]): ");
            }
        }
    }
    
}
