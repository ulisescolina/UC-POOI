/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
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
@Table(name="empleadosmensuales")
@DiscriminatorValue("empleadomensual")
public class EmpleadoMensual extends Tecnico implements Serializable {
    /*========================= Atributos de la clase ========================*/
    private double sueldoMensual;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    /*================== Fin Atributos para las relaciones ===================*/
    public EmpleadoMensual() {
        super();
        this.sueldoMensual = 0;
    }
    
    public EmpleadoMensual(String nNombres, String nApellidos, String nDocumentoUnico, double nSueldoMensual) {
        super(nNombres, nApellidos, nDocumentoUnico);
        this.sueldoMensual = nSueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
    
    
}
