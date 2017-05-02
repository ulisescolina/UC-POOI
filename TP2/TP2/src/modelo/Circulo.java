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
public class Circulo {
    private static int cantInstanciasCirtulo;
    private double radio;
    
    public Circulo()
    {
        this.radio = 0;
        cantInstanciasCirtulo++;
    }
    
    public Circulo(double Radio)
    {
        this.radio = Radio;
        cantInstanciasCirtulo++;
    }
    
    public static int getCantInstanciasCirculo()
    {
        return cantInstanciasCirtulo;
    }
    
    /**
     *
     * @param nRadio
     */
    public void setRadio(double nRadio)
    {
        this.radio = nRadio;
    }
    
    public Double getRadio()
    {
        return this.radio;
    }
    
    public Double getArea()
    {
        return Math.PI * Math.pow(this.radio, 2);
        
    }
    
    public Double getPerimetro()
    {
        return 2 * Math.PI * this.radio;
    }
    
    public Double getDiametro()
    {
        return 2 * this.radio;
    }    
}
