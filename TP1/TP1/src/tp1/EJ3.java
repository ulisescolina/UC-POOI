/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import java.math.*;
import java.util.Scanner;

/**
 *
 * @author ulisss
 */
public class EJ3 {
    public void resolucion() 
    {
        double valMin, valMax;
        double[] valorAleatorio;
        Scanner vm, vM;
        
        System.out.print("Ingrese el valor minimo para los numeros aleatorios: ");
        vm = new Scanner(System.in);
        valMin = Double.parseDouble(vm.nextLine());
        
        System.out.print("Ingrese el valor maximo para los numeros aleatorios: ");
        vM = new Scanner(System.in);
        valMax = Double.parseDouble(vM.nextLine());
        
        valorAleatorio = new double[2];
        valorAleatorio[0] = obtenerNumeroAleatorio(valMin, valMax);
        valorAleatorio[1] = obtenerNumeroAleatorio(valMin, valMax);
        
        if (valorAleatorio[0] != -1 && valorAleatorio[1] != -1){
            System.out.print("Los dos numeros seleccionados son los siguientes: "+ valorAleatorio[0] + ", " +valorAleatorio[1] +"\n");
        }
        
    }
     /**
     *
     * @param min
     * @param max
     * @return
     */
    public static double obtenerNumeroAleatorio(double min, double max)
    {
        if (min < max) {
            return Math.random() * (max - min) + min;
        } else {
            System.out.println("Valor minimo mayor que el valor maximo.");
            return -1;
        }
    }   
}