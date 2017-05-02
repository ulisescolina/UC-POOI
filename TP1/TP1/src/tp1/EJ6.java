/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import java.util.*;
/**
 *
 * @author ulisss
 */
public class EJ6 {
    public void resolucion()
    {
        int n;

        System.out.print("La cantidad de numeros primos que desea imprimir: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        System.out.print("Se imprimiran los primeros "+n+" numeros primos\n");
        
        this.imprimirNumPrimos(n);
        
    }
    
    /**
     * Realiza las operaciones necesarias para imprimir la cantidad de numeros
     * primos que se le soliciten en su unico argumento
     * 
     * @param n cantidad de numeros primos a imprimir
     */
    
    public void imprimirNumPrimos(int n)
    {
        int j = 1; int cont = 1;
        ArrayList<Integer> nPrimos = new ArrayList<>(n);
        while (cont <= n) {
            if(this.esPrimo(j)){
                // Contador que acumula la cantidad de numeros primos encontrados
                nPrimos.add(j);
                cont++;
            }
            // Incremento el input para probar con el siguiente numero
            j++;
        }
        this.imprimirArray(nPrimos, n);
    }
    
    /**
     * Obtiene un valor entero como argumento y determina si este valor es un
     * numero primo
     * @param n Valor a determinar si es primo
     * @return devuelve un booleano que indica si el valor n es primo o no
     */
    public boolean esPrimo(int n)
    {
        int a=0,i;
        for(i=1;i<=n;i++){
            if(n%i==0){
                a++;
            }
        }
        return a == 2;
    }
    
    /**
     * Obtiene un array como argumento y lo imprime.
     * 
     * @param primos Array de numeros primos que se quieren imprimir
     * @param l tamaño del array @primos
     */
    public void imprimirArray(ArrayList<Integer> primos, int l)
    {
        int elemento, i;
        for (i=0; i<l; i++)
        {
            elemento = primos.get(i);
            System.out.print((i+1)+ "° - " +elemento+"\n");
        }
    }
}
