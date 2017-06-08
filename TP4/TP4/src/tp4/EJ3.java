/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;
import modelo.Cuenta;
/**
 *
 * @author ulisss
 */
public class EJ3{
    public void resolucion(){
        Cuenta c = new Cuenta(1234, "Florencia", 1000);
        c.setTasaInteresAnual(5);
        c.depositar(30);
        c.depositar(40);
        c.depositar(50);
        c.retirar(5);
        c.retirar(4);
        c.retirar(2);
        System.out.println(c);
    }
}
