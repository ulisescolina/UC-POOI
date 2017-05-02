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
public class EJ5 {
    public void resolucion()
    {
        Scanner obtDia;
        String dia;
        
        System.out.print("Ingrese un numero que represente a un dia de semana (del 1 al 7): ");
        obtDia = new Scanner(System.in);
        dia = obtDia.nextLine();
        
        switch (dia)
        {
            case "1": 
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.print("El dia "+dia+" NO PERTENECE al fin de semana.");
                break;
            case "6":
            case "7":
                System.out.print("El dia "+dia+" PERTENECE al fin de semana.");
                break;
            default:
                System.out.print("Ingrese un numero valido. (entre 1 y 7)");
                break;
        }
    }
}
