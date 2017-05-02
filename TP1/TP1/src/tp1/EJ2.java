/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;
import modelo.Circulo;

/**
 *
 * @author ulisss
 */
public class EJ2 {
    public void resolucion()
    {
        double radioIngresado;
        String area, perimetro, diametro, radio, seguir;
        Scanner opcion;
        seguir = "S";
        while ("S".equals(seguir.toUpperCase())) {
            Scanner ingresoPorTeclado;
            System.out.print("Ingrese el radio del circulo: ");
            ingresoPorTeclado = new Scanner(System.in);
            try{
                radioIngresado = Double.parseDouble(ingresoPorTeclado.nextLine());
                Circulo c = new Circulo(radioIngresado);
                area = String.valueOf(c.getArea());
                perimetro = String.valueOf(c.getPerimetro());
                diametro = String.valueOf(c.getDiametro());
                radio = String.valueOf(c.getRadio());
                System.out.print("Definiendo el radio en "+radio+" se tiene lo siguiente:\n\tArea: "+ area+"\n\tPerimetro: " + perimetro + "\n\tDiametro: "+ diametro + "\n");
            } catch(java.lang.NumberFormatException e) {
                System.out.println("Debe ingresar un numero");
            }
            opcion = new Scanner(System.in);
            System.out.println("Hacer otro calculo? (s/n): ");
            seguir = opcion.nextLine();
        }
    }
}
