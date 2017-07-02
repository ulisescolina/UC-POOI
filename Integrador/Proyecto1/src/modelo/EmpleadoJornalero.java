/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author toba_2_6_7
 */
@Entity
@Table(name="empleadosjornaleros")
public class EmpleadoJornalero extends Tecnico implements Serializable {
    /*========================= Atributos de la clase ========================*/
    private double tarifaPorHora;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    
    /*================== Fin Atributos para las relaciones ===================*/
    
    public EmpleadoJornalero() {
        super();
        this.tarifaPorHora = 0;
    }
    
    public EmpleadoJornalero(String nNombres, String nApellidos, String nDocumentoUnico, double nTarifaPorHora) {
        super(nNombres, nApellidos, nDocumentoUnico);
        this.tarifaPorHora = nTarifaPorHora;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}
