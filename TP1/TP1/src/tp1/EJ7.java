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
public class EJ7 {
    public void resolucion()
    {
        Scanner sc;
        sc = new Scanner(System.in);
        double distanciaRecorrer, KilometrosPorLitro, precioLitro, costoTotal;
        
        System.out.print("Ingrese la distancia a recorrer: ");
        distanciaRecorrer = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese la cantidad de kilometros recorridos por litro: ");
        KilometrosPorLitro = Double.parseDouble(sc.nextLine());
        
        System.out.print("Ingrese el costo del litro de combustible: ");
        precioLitro = Double.parseDouble(sc.nextLine());
        
        costoTotal = this.calcularCostoViaje(distanciaRecorrer, KilometrosPorLitro, precioLitro);
        System.out.print("El costo es: "+costoTotal+"\n");
    }
    
    public double calcularCostoViaje(double dRecorrer, double kLitro, double pLitro)
    {
        double costoTotal;
        costoTotal = (dRecorrer/kLitro) * pLitro;
        return costoTotal;
    }
}
