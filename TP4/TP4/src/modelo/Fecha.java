/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author ulisss
 */
public class Fecha {
    Date f;
    
    public Fecha(){
        this.f = new Date();
    }
    
    public Fecha(int nDia, int nMes, int nAnio) {
        this.f = new Date(nAnio, nMes, nDia);
    }
    
    @Override
    public String toString() {
        String Fecha;
        Fecha = String.valueOf(f.getDay())+"/"+String.valueOf(f.getMonth())+"/"+String.valueOf(f.getYear());
        return Fecha;
    }
}
