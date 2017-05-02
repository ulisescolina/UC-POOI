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
public class Ventilador {
    public final int LENTO = 1;
    public final int MEDIO = 2;
    public final int RAPIDO = 3;
    private int velocidad;
    private boolean encendido;
    private float radio;
    private String color;
    
    public Ventilador()
    {
        this.velocidad = this.LENTO;
        this.encendido = false;
        this.radio = 5;
        this.color = "Azul";
    }
    
    public void setVelocidad(int nVelocidad)
    {
        this.velocidad = nVelocidad;
    }
    
    public int getVelocidad()
    {
        return this.velocidad;
    }
    
    public void setEncendido (boolean bEncendido)
    {
        this.encendido = bEncendido;
    }
    
    public boolean getEncendido()
    {
        return this.encendido;
    }
    
    public void setRadio(float nRadio)
    {
        this.radio = nRadio;
    }
    
    public float getRadio()
    {
        return this.radio;
    }
    
    public void setColor(String nColor)
    {
        this.color = nColor;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    @Override
    public String toString()
    {
        String cadenaRespuesta = "";
        if (this.getEncendido()) {
            cadenaRespuesta = "Velocidad: "+this.getVelocidad()+", Color: "+this.getColor()+", Radio: "+this.getRadio();
        } else {
            cadenaRespuesta = "Color: "+this.getColor()+", Radio: "+this.getRadio()+", El ventilador esta apagado";
        }
        return cadenaRespuesta;
    }
}
