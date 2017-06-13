/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp4;
import modelo.*;
import java.util.Date;

/**
 *
 * @author ulisss
 */
public class EJ1 {
    
    public void resolucion() {
        Date fecha;
        // Estudiante
        Estudiante e = new Estudiante("Ulises Ramirez", "Pellegrini 269", "12345678", "ulir19@gmail.com", "Cuarto Anio");
        System.out.println(e);
        System.out.println();
        
        // Docente
        fecha = new Date(2005, 1, 1);
        Docente d = new Docente("Claudio Biale", "Una direccion correcta", "12346543", "example@a.com", 10000.00, fecha, "Titular");
        System.out.println(d);
        System.out.println();
        
        // No Docente
        fecha = new Date(2005, 1, 1);
        NoDocente nd = new NoDocente("Ulises Ramirez", "Pellegrini 269", "12345678", "ulir19@gmail.com", 0, fecha, "Analista en Sistemas de Computacion");
        System.out.println(nd);
        System.out.println();
    }
}
