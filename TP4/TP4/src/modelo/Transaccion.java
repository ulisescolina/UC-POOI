/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import modelo.Fecha;
import java.util.Date;

/**
 *
 * @author ulisss
 */
public class Transaccion {
    private Fecha fecha;
    private char tipo;
    private double cantidad;
    
    public Transaccion(Fecha nFecha, char nTipo, double nCantidad){
        this.fecha = nFecha;
        this.tipo = nTipo;
        this.cantidad = nCantidad;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        String Transaccion;
        Transaccion = "\t"+this.tipo+"\t|"+this.fecha+"\t|$"+this.cantidad;
        return Transaccion;
    }
}
