/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import modelo.Ventilador;
/**
 *
 * @author ulisss
 */
public class EJ5 {
    public void resolucion()
    {
        Ventilador v1, v2;
        v1 = new Ventilador();
        v2 = new Ventilador();
        // Ventilador 1
        v1.setVelocidad(v1.RAPIDO);
        v1.setRadio(10);
        v1.setColor("Amarillo");
        v1.setEncendido(true);
        // Ventilador 2
        v2.setVelocidad(v2.MEDIO);
        v2.setRadio(5); // Cabe darse cuenta que esto no hace falta ya que el constructor lo hace
        v2.setColor("Azul"); // Esto tambien es hecho por el constructor
        v2.setEncendido(false);
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}
