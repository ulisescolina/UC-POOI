/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ulisss
 */
public class Utilidades {
    public static double redondear(double valor, int cDecimales) {
        if (cDecimales < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(cDecimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public static double obtenerNumeroAleatorio(double min, double max)
    {
        if (min < max) {
            return Math.random() * (max - min) + min;
        } else {
            System.out.println("Valor minimo mayor que el valor maximo.");
            return -1;
        }
    }
    
    public static String imprimirArray(ListaReproduccion lCanciones)
    {
        int i;
        String ListaCanciones = "";
        for (i=0; i < lCanciones.getCantidadCanciones(); i++) {
            ListaCanciones += "Indice " +i+ ": "+ lCanciones.getCancion(i) + "\n";
        }
        return ListaCanciones;
    }
    
    public static String imprimirArray(Cancion[] lCanciones)
    {
        int i;
        String ListaCanciones = "";
        for (i=0; i < lCanciones.length; i++) {
            ListaCanciones += "Indice " +i+ ": "+ lCanciones[i] + "\n";
        }
        return ListaCanciones;
    }
    
    public static void imprimirArray(Accion[] lAcciones)
    {
        int i; double porcentajeCambio;
        for (i=0; i < lAcciones.length; i++) {
            porcentajeCambio = lAcciones[i].getPorcentajeCambio();
            System.out.println("Para las acciones de ("+lAcciones[i].getSimbolo()+") "+lAcciones[i].getNombre()+":");
            System.out.print("Precio Cierre Previo: "+redondear(lAcciones[i].getPrecioCierrePrevio(),2)+"\nPrecio Actual: "+redondear(lAcciones[i].getPrecioActual(),2)+"\n");
            if (porcentajeCambio < 0) {
                System.out.print("El valor de las acciones CAYÓ,\nporcentaje de "
                        + "cambio es de: "+porcentajeCambio+"%\n\n");
                System.out.print("---------------------------------------------"
                        + "---------------------------------------\n\n");
            } else if (porcentajeCambio > 0) {
                System.out.print("El valor de las acciones SUBIÓ,\nporcentaje de"
                        + "cambio es de: "+porcentajeCambio+"%\n\n");
                System.out.print("---------------------------------------------"
                        + "---------------------------------------\n\n");
            } else {
                System.out.print("El valor de las acciones se mantuvo\n\n");
            }
        }
    }
    
    
}
