/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Scanner;

/**
 *
 * @author ulisss
 */
public class ListaReproduccion {
    private static final int TAMANIO_ARRAY = 100;
    private static int contadorCanciones;
    private Cancion[] lCanciones = new Cancion[TAMANIO_ARRAY];
    
    public ListaReproduccion()
    {
        ListaReproduccion.contadorCanciones = 0;
    }
    
    public Cancion[] getLCanciones()
    {
        return this.lCanciones;
    }
    
    public void insertar(Cancion nCancion)
    {
        ListaReproduccion.contadorCanciones++;
        lCanciones[ListaReproduccion.contadorCanciones-1] = nCancion;
    }
    
    public Cancion getCancion(int indice)
    {
        Scanner sc = new Scanner(System.in);
        if (indice < 0) {
            System.out.print("\tError: La lista inicia a partir del indice 0.\n");
            System.out.print("\tDesea que se le devuelva el primer elemento? s/n: ");
            switch (sc.nextLine().toUpperCase())
            {
                case "S": 
                    return lCanciones[0];
                case "N":
                    return null;
                default: 
                    System.out.print("\tOpción inválida, se devuelve 'null'\n\n");
                    return null;
            }
        }
        
        if (lCanciones[indice] == null){
            System.out.print("\tNo existe una cancion en el indice especificado.\n\n");
            return null;
        } else {
            return lCanciones[indice];
        }
        
    }
    
    public void reemplazarCancion(Cancion nCancion, int indice)
    {
        if (indice < 0) {
            System.out.println("\tError: ingrese un indice valido (entero entre 0"
                    + " y "+ListaReproduccion.TAMANIO_ARRAY+")\n"
                            + "\tNo se realizará el reemplazo.\n\n");
        } else if (indice > lCanciones.length-1) {
            System.out.print("\tError: la lista de canciones solo soporta hasta"
                    + " el indice "+(lCanciones.length-1)+"\n"
                            + "\tNo se realizará el reemplazo.\n\n");
        } else {
            if (this.lCanciones[indice] == null) {
                System.out.println("\tNo hay cancion en este indice para ser reemplazada\n\n");
            } else {
                this.lCanciones[indice] = nCancion;
            }
        }
    }
    
    public int getCantidadCanciones()
    {
        return ListaReproduccion.contadorCanciones;
    }
    
    public void removerEn(int indice)
    {
        if (indice >= 0) {
            System.arraycopy(this.lCanciones, indice + 1, this.lCanciones, indice, this.lCanciones.length - 1 - indice);
            ListaReproduccion.contadorCanciones--;   
        }
    }
    
    public void insertarEn(Cancion nCancion, int indice)
    {
        if (indice >= 0 && indice <= ListaReproduccion.contadorCanciones) {
            if (this.lCanciones[indice] == null) {
                this.lCanciones[indice] = nCancion;
            } else {
                Utilidades.desplazarElementosListaReproduccion(this.lCanciones, ListaReproduccion.contadorCanciones, indice, 1);
                this.lCanciones[indice] = nCancion;
            }
        }  else if (indice > 0 && indice > ListaReproduccion.contadorCanciones){
            System.out.println("\tNo puede haber un salto de indice, se agrega como ultimo elemento\n\n");
            this.insertar(nCancion);
            return;
        } else if(indice < 0){
            lCanciones[ListaReproduccion.contadorCanciones] = nCancion;
        }
        ListaReproduccion.contadorCanciones++;    
    }
    
    public int encontrarIndice(Cancion cancionRequerida)
    {
        int i;
        for (i=0; i<this.lCanciones.length; i++) {
            if(this.lCanciones[i] == cancionRequerida){
                return i;
            }
        }
        return -1;
    }
    
    public boolean contiene(Cancion cancionRequerida)
    {
        int i;
        for (i=0; i<this.lCanciones.length; i++) {
            if(this.lCanciones[i] == cancionRequerida){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return Utilidades.imprimirArray(this);
    }
}
