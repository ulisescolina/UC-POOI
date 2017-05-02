/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 *
 * @author ulisss
 */
public class EJ8 {
    public void resolucion()
    {
        String nMes, nomMes;
        nMes = this.generarEnteroAleatorio();
        nomMes = this.devolverMes(nMes);
        System.out.print("El numero generado fue "+nMes+", pertenece al mes: "+nomMes+"\n");
    }
    
    public String devolverMes(String nroMes)
    {
        switch (nroMes)
        {
            case "1": return "Enero";
            case "2": return "Febrero";
            case "3": return "Marzo";
            case "4": return "Abril";
            case "5": return "Mayo";
            case "6": return "Junio";
            case "7": return "Julio";
            case "8": return "Agosto";
            case "9": return "Septiembre";
            case "10": return "Octubre";
            case "11": return "Noviembre";
            case "12": return "Diciembre";
            default: return "Numero de mes invalido";
        }
    }
    
    public String generarEnteroAleatorio()
    {
        double max, min, resultado;
        max = 12; min = 1;
        resultado = Math.random() * (max - min) + min;
        DecimalFormat df = new DecimalFormat("#");
        df.setRoundingMode(RoundingMode.CEILING);
        return df.format(resultado);
    }
}
