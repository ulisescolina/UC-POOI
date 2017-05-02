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
public class Cronometro {
    private Date horaInicio;
    private Date horaFinal;
    
    public Cronometro()
    {
        this.horaInicio = new Date();
    }
    
    public Date getHoraInicio()
    {
        return this.horaInicio;
    }
    
    public Date getHoraFinal()
    {
        return this.horaFinal;
    }
    
    public void comienza()
    {
        this.horaInicio = new Date();
    }
    
    public void detiene()
    {
        this.horaFinal = new Date();
    }
    
    public Long tiempoTranscurrido()
    {
        long in = this.getHoraInicio().getTime();
        long fin = this.getHoraFinal().getTime();
        Long diferencia = fin - in;
        return diferencia;
    }
    
    
}
