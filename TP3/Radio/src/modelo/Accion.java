/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ulisss
 */
public class Accion {
    private String simbolo;
    private String nombre;
    private double precioCierrePrevio;
    private double precioActual;
    
    /**
    * Constructores
     * @param sim
     * @param nom
    */
    public Accion(String sim, String nom)
    {
        this.simbolo = sim;
        this.nombre = nom;
        this.precioCierrePrevio = 0;
        this.precioActual = 0;
    }
    
    /**
     * Metodos de acceso y modificacion
     */
    public void setSimbolo(String nSimbolo)
    {
        this.simbolo = nSimbolo;
    }
    
    public String getSimbolo()
    {
        return this.simbolo;
    }
    
    public void setNombre(String nNombre)
    {
        this.nombre = nNombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setPrecioCierrePrevio(double nPCP)
    {
        this.precioCierrePrevio = nPCP;
    }
    
    public double getPrecioCierrePrevio()
    {
        return this.precioCierrePrevio;
    }
    
    public void setPrecioActual(double nPA)
    {
        this.precioActual = nPA;
    }
    
    public double getPrecioActual()
    {
        return this.precioActual;
    }
    
    public double getPorcentajeCambio()
    {
        double porCambio, pActual, pCierrPrevio, diferencia;
        porCambio = 0; pActual = this.getPrecioActual(); pCierrPrevio = this.getPrecioCierrePrevio(); diferencia = 0;
        diferencia = pActual - pCierrPrevio;
        porCambio = (diferencia*100)/pCierrPrevio;
        return Utilidades.redondear(porCambio, 2);
    }
}
