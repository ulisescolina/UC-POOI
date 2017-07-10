/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;
import modelo.Pila;
/**
 *
 * @author ulisss
 */
public class EJ2 {
    private final int MAX_CANT_PILA = 5;
    public void resolucion(){
        Pila p = new Pila();
        int i;
        // Apilo los 5 enteros a la pila
        System.out.println("Apilando los "+MAX_CANT_PILA+" objetos");
        System.out.println("----------------------");
        for (i=0; i<MAX_CANT_PILA; i++){
            p.apilar(i);
            System.out.println("\t"+(i+1)+"* - "+i);
        }
        System.out.println("----------------------");
        
        System.out.println("a) Mostrar el elemento superior de la pila: "+String.valueOf(p.cima())); // Cima() = 4
        System.out.println("b) Invoque al metodo toString --> "+p); // resultado 3 2 1 0
        System.out.println("c) Desapilar un elemento y mostrarlo: "+String.valueOf(p.desapilar())); // Desapilar(): Saca el 4 de la pila y lo muestra
        System.out.println("d) Invocar al metodo toString --> "+p); // resultado 3 2 1 0
        System.out.println();
    }
}
