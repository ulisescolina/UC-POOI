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
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;

/**
 *
 * @author toba_2_6_7
 */
@Entity
@Table(name="tiemposinvertidos")
public class TiempoInvertido implements Serializable{
    /*========================= Atributos de la clase ========================*/
    @Id
    @SequenceGenerator(name="sec_tiempo_invertido", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_tiempo_invertido")
    private int id_tiempoinvertido;
    private double horasInvertidas;
    @Temporal(javax.persistence.TemporalType.DATE)
    private final Date fecha;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    /*
        este conoce a la tarea para la cual va a representar un tiempo
    */
    @ManyToOne
    private TareaARealizar tarea;
    /*================== Fin Atributos para las relaciones ===================*/

    public TiempoInvertido() {
        this.horasInvertidas = 0;
        this.fecha = new Date();
    }

    public TiempoInvertido(int id_tiempoinvertido, double horasInvertidas, Date fecha) {
        this.id_tiempoinvertido = id_tiempoinvertido;
        this.horasInvertidas = horasInvertidas;
        this.fecha = new Date();
    }

    public int getId_tiempoinvertido() {
        return id_tiempoinvertido;
    }

    public void setId_tiempoinvertido(int id_tiempoinvertido) {
        this.id_tiempoinvertido = id_tiempoinvertido;
    }

    public double getHorasInvertidas() {
        return horasInvertidas;
    }

    public void setHorasInvertidas(double horasInvertidas) {
        this.horasInvertidas = horasInvertidas;
    }

    public Date getFecha() {
        return fecha;
    }
}
