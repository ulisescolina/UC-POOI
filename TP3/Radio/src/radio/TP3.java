/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.util.Scanner;

/**
 *
 * @author ulisss
 */
public class TP3 {
    public static void main(String[] args){
        Scanner selEj;
        String seguir, ejSel;
        seguir = "S";
        while ("S".equals(seguir.toUpperCase())) {
            System.out.print("Ingrese el ejercicio que desea ver (1-2): ");
            selEj = new Scanner(System.in);
            ejSel = selEj.nextLine();
            switch (ejSel)
            {
                case "1":
                    EJ1 ej1 = new EJ1();
                    ej1.resolucion();
                    break;
                case "2": 
                    Radio ejRadio = new Radio();
                    ejRadio.resolucion();
                    break;
                default:
                    System.out.println("Ingrese un numero valido (1 o 2)");
            }
        }
    }
}
