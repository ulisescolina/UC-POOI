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
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;

/**
 *
 * @author toba_2_6_7
 */
@Entity
@Table(name="reclamos")
public class Reclamo implements Serializable{
    /*========================= Atributos de la clase ========================*/
    @Id
    @SequenceGenerator(name="sec_reclamos", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_reclamos")
    private int numero; /*este sera la clave principal*/
    private String descProblema;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaEntrada;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaEstimEntrega;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaFin;
    private boolean editable;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    /*
        Conoce al articulo sobre el cual es el reclamo
    */
    @ManyToOne
    private Articulo articulo;
    
    /*
        Un reclamo conoce las tareas a realizar para que este este completo
    */
    @OneToMany(mappedBy="reclamo")
    private Set<TareaARealizar> tareas;
    /*================== Fin Atributos para las relaciones ===================*/

    public Reclamo() {
        this.descProblema = "";
        this.fechaEntrada = new Date();
        this.editable = true;
        this.fechaFin = null;
        this.fechaEstimEntrega = null;
        this.tareas = new HashSet<>();
    }
    
    public Reclamo(String descProblema, Date fechaEstimEntrega, Articulo nArticulo) {
        this.descProblema = descProblema;
        this.fechaEntrada = new Date();
        this.fechaEstimEntrega = fechaEstimEntrega;
        this.editable = true;
        this.fechaFin = null;
        this.articulo = nArticulo;
        this.tareas = new HashSet<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getDescProblema() {
        return descProblema;
    }

    public void setDescProblema(String descProblema) {
        this.descProblema = descProblema;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public Date getFechaEstimEntrega() {
        return fechaEstimEntrega;
    }

    public void setFechaEstimEntrega(Date fechaEstimEntrega) {
        this.fechaEstimEntrega = fechaEstimEntrega;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
    
    
    @Override
    public String toString(){
        return "("+String.valueOf(this.numero) + ") " + this.descProblema;
    }
    
    public void setArticulo(Articulo nArticulo){
        this.articulo = nArticulo;
    }
    
    public Articulo getArticulo(){
        return this.articulo;
    }
    
    public Set getTareas() {
        return this.tareas;
    }
    
    public void agregarTarea(TareaARealizar nTAR){
        this.tareas.add(nTAR);
    }
    
    public void quitarTarea(TareaARealizar TAR) {
        this.tareas.remove(TAR);
    }
}
