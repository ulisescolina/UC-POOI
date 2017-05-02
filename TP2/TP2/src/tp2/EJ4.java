/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import modelo.Cronometro;
import java.util.Scanner;
/**
 *
 * @author ulisss
 */
public class EJ4 {
    public void resolucion()
    {
        int i; long n;
        System.out.print("Ingrese la cantidad de numeros a imprimir por "
                + "pantalla\n(debe ser un entero, hasta "+ Long.MAX_VALUE +"): ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        Cronometro c = new Cronometro();
        for (i=0 ; i <= n ; i++) {
            System.out.println("\t"+i);
        }
        c.detiene();
        System.out.println("El tiempo transcurrido durante la impresion de los"
                + " numeros hasta el "+ n + " fue: " + c.tiempoTranscurrido() + 
                " Milisegundos");
    }
}
