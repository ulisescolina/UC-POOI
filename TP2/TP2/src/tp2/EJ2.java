/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import modelo.Accion;
import java.util.Scanner;
/**
 *
 * @author ulisss
 */
public class EJ2 {
    public void resolucion()
    {
        double porcentajeCambio, PA, PCP;
        Scanner sc = new Scanner(System.in);
        Accion a = new Accion("ORCL", "Oracle Corporation");
        System.out.print("Por favor utilice el '.' (punto) para separar decimales.\n");
        System.out.print("Ingrese el Precio de Cierre Previo para ("+ a.getSimbolo() +") "+ a.getNombre() +": ");
        try {
            PCP = Double.parseDouble(sc.nextLine());
            a.setPrecioCierrePrevio(PCP);
        } catch (java.lang.NumberFormatException e){
            System.out.print("Uno de los caracteres es invalido, intente separar los decimales con un '.' (PUNTO)\n");
            return;
        }
        
        System.out.print("Ingrese el Precio Actual para ("+ a.getSimbolo() +") "+ a.getNombre() +": ");
        try {
            PA = Double.parseDouble(sc.nextLine());
            a.setPrecioActual(PA);
        } catch (java.lang.NumberFormatException e){
            System.out.print("Uno de los caracteres es invalido, intente separar los decimales con un '.' (PUNTO)\n");
            return;
        }
        
        porcentajeCambio = a.getPorcentajeCambio();
        
        if (porcentajeCambio < 0) {
            System.out.print("El valor de las acciones cayo, porcentaje de "
                    + "cambio es de: "+porcentajeCambio+"%\n");
        } else if (porcentajeCambio > 0) {
            System.out.print("El valor de las acciones subio, porcentaje de"
                    + "cambio es de: "+porcentajeCambio+"%\n");
        } else {
            System.out.print("El valor de las acciones se mantuvo\n");
        }
    }
}
