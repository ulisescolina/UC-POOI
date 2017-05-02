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
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner selEj;
        String seguir, ejSel;
        seguir = "S";
        while ("S".equals(seguir.toUpperCase())) {
            System.out.print("Ingrese el ejercicio que desea ver (1-8): ");
            selEj = new Scanner(System.in);
            ejSel = selEj.nextLine();
            switch (ejSel)
            {
                case "1":
                    System.out.println("El ejercicio 1 fue implementado a modo de ejemplo por el profesor Claudio Biale.");
                    break;
                case "2": 
                    EJ2 ej1 = new EJ2();
                    ej1.resolucion();
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
                case "6":
                    EJ6 ej6 = new EJ6();
                    ej6.resolucion();
                    break;
                case "7":
                    EJ7 ej7 = new EJ7();
                    ej7.resolucion();
                    break;
                case "8":
                    EJ8 ej8 = new EJ8();
                    ej8.resolucion();
                    break;
                default:
                    System.out.println("Ingrese un numero valido (entre 2 y 8)");
            }
            
        }
    }   
}
