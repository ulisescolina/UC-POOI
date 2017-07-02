/*
 * Este proyecto fue creado por el alumno Ulises Colina Ramirez para la cátedra
 * Programación Orientada a Objetos 1, dictada el 2017, como titular se tiene
 * al Lic. Claudio Omar Biale, el proyecto obtenido mediante sorteo es el N*1
 */
package proyecto1;
import GUI.VentanaPrincipal;
import controlador.Controlador;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import persistencia.Persistencia;

/**
 *
 * @author C. R. Ulises, LU: LS00704
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Proyecto1PU");
        Persistencia persistencia = new Persistencia(emf);
        Controlador c = new Controlador(persistencia);
        
        VentanaPrincipal v = new VentanaPrincipal(c);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
    }
    
}
