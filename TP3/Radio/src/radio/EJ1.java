/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

import java.util.Scanner;
import modelo.Accion;
import modelo.Utilidades;

/**
 *
 * @author ulisss
 */
public class EJ1 {
    private static final int MAX_CANT_ACCIONES_A_CREAR = 10;
    public void resolucion() {
        int i;
        Accion[] lAcciones = new Accion[EJ1.MAX_CANT_ACCIONES_A_CREAR];
        System.out.print("Creando las "+EJ1.MAX_CANT_ACCIONES_A_CREAR+" acciones y asignando los Precios de Cierre Previo y el Actuales aleatoriamente.\n");
                System.out.println("---------------------------------------------"
                        + "---------------------------------------------------\n");
        for (i=0; i < lAcciones.length;i++) {
            double porcentajeCambio, PA, PCP;
            Scanner sc = new Scanner(System.in);
            Accion a = new Accion("SIMBOLO"+i , "Accion"+i);
            PCP = Utilidades.obtenerNumeroAleatorio(0, 100);
            a.setPrecioCierrePrevio(PCP);
            PA = Utilidades.obtenerNumeroAleatorio(0, 100);
            a.setPrecioActual(PA);
            lAcciones[i] = a;
        }
        
        Utilidades.imprimirArray(lAcciones);
        
    }
}
