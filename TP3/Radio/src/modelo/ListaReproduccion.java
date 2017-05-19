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
    private Cancion[] Canciones;
    
    public ListaReproduccion()
    {
        ListaReproduccion.contadorCanciones = 0;
        Canciones = new Cancion[1];
    }
    
    public Cancion[] getLCanciones()
    {
        return this.Canciones;
    }
    
    public void insertar(Cancion nCancion)
    {
        if (ListaReproduccion.contadorCanciones < Canciones.length) {
            ListaReproduccion.contadorCanciones++;    
        } else {
            ListaReproduccion.contadorCanciones++;
            this.Canciones = redimensionarArray(this.Canciones);
        }
        this.Canciones[ListaReproduccion.contadorCanciones-1] = nCancion;
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
                    return Canciones[0];
                case "N":
                    return null;
                default: 
                    System.out.print("\tOpción inválida, se devuelve 'null'\n\n");
                    return null;
            }
        }
        
        if (Canciones[indice] == null){
            System.out.print("\tNo existe una cancion en el indice especificado.\n\n");
            return null;
        } else {
            return Canciones[indice];
        }
        
    }
    
    public void reemplazarCancion(Cancion nCancion, int indice)
    {
        if (indice < 0) {
            System.out.println("\tError: ingrese un indice valido (entero entre 0"
                    + " y "+ (ListaReproduccion.contadorCanciones-1) +")\n"
                            + "\tNo se realizará el reemplazo.\n\n");
        } else if (indice > Canciones.length-1) {
            System.out.print("\tError: la lista de canciones solo soporta el reemplazo hasta"
                    + " el indice "+(Canciones.length-1)+"\n"
                            + "\tNo se realizará el reemplazo.\n\n");
        } else {
            if (this.Canciones[indice] == null) {
                System.out.println("\tNo hay cancion en este indice para ser reemplazada\n\n");
            } else {
                this.Canciones[indice] = nCancion;
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
            System.arraycopy(this.Canciones, indice + 1, this.Canciones, indice, this.Canciones.length - 1 - indice);
            ListaReproduccion.contadorCanciones--;   
        }
    }
    
    public void insertarEn(Cancion nCancion, int indice)
    {
        if (indice >= 0 && indice <= ListaReproduccion.contadorCanciones) {
            if (this.Canciones[indice] == null) {
                this.Canciones[indice] = nCancion;
            } else {
                this.Canciones = redimensionarArray(this.Canciones);
                desplazarElementosListaReproduccion(this.Canciones, ListaReproduccion.contadorCanciones, indice, 1);
                this.Canciones[indice] = nCancion;
            }
        }  else if (indice > 0 && indice > ListaReproduccion.contadorCanciones){
            System.out.println("\tNo puede haber un salto de indice, se agrega como ultimo elemento\n\n");
            this.insertar(nCancion);
            return;
        } else if(indice < 0){
            /*  
                Si no redimensiono el array cuando el metodo intenta insertar algo al final
                se sobrepasa el tamaño del array
            */
            this.Canciones = redimensionarArray(this.Canciones);
            Canciones[ListaReproduccion.contadorCanciones] = nCancion;
        }
        ListaReproduccion.contadorCanciones++;    
    }
    
    public int encontrarIndice(Cancion cancionRequerida)
    {
        int i;
        for (i=0; i<this.Canciones.length; i++) {
            if(this.Canciones[i] == cancionRequerida){
                return i;
            }
        }
        return -1;
    }
    
    public boolean contiene(Cancion cancionRequerida)
    {
        int i;
        for (i=0; i<this.Canciones.length; i++) {
            if(this.Canciones[i] == cancionRequerida){
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
    
    /*
        Métodos privados
    */
    private static Cancion[] redimensionarArray(Cancion[] lCanciones)
    {
        Cancion[] lAuxiliar = new Cancion[ListaReproduccion.contadorCanciones+1];
        System.arraycopy(lCanciones, 0, lAuxiliar, 0, lCanciones.length);
        return lAuxiliar;
    }
    
    private static Cancion[] desplazarElementosListaReproduccion(Cancion[] LR, int cCanciones, int despIni, int desp)
    {
        int i;
        for (i=cCanciones; i >= despIni + desp; i--) 
            LR[i] = LR[i-desp];
        for (i=despIni; i < despIni + desp; i++)
            LR[i] = null;
        return LR;
    }
}
