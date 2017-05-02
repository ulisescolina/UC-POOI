/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;
import modelo.Cuenta;
/**
 *
 * @author ulisss
 */
public class EJ3 {
    public void resolucion()
    {
        Cuenta c = new Cuenta();
        
        c.setId(1122);
        c.setSaldo(20000);
        c.setTasaInteresAnual(4.5);
        
        c.retirar(2500);
        c.depositar(3000);
        
        System.out.println(c.toString());
    }
}
