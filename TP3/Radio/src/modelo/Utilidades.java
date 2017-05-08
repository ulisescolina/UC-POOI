/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author ulisss
 */
public class Utilidades {
    public static double redondear(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public static Cancion[] desplazarElementosListaReproduccion(Cancion[] LR, int cCanciones, int despIni, int desp)
    {
        int i;
        for (i=cCanciones; i >= despIni + desp; i--) 
            LR[i] = LR[i-desp];
        for (i=despIni; i < despIni + desp; i++)
            LR[i] = null;
        return LR;
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
            if (porcentajeCambio < 0) {
                System.out.print("El valor de las acciones cayo, porcentaje de "
                        + "cambio es de: "+porcentajeCambio+"%\n\n");
                System.out.print("---------------------------------------------"
                        + "---------------------------------------\n\n");
            } else if (porcentajeCambio > 0) {
                System.out.print("El valor de las acciones subio, porcentaje de"
                        + "cambio es de: "+porcentajeCambio+"%\n\n");
                System.out.print("---------------------------------------------"
                        + "---------------------------------------\n\n");
            } else {
                System.out.print("El valor de las acciones se mantuvo\n\n");
            }
        }
    }
}
