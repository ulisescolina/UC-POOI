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
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author toba_2_6_7
 */
@Entity
@Table(name="tareasdefinidas")
public class TareaDefinida implements Serializable{
    /*========================= Atributos de la clase ========================*/
    @Id
    @SequenceGenerator(name="sec_tarea_definida", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_tarea_definida")
    private int id_tareadefinida;
    private String codigoUnico;
    private String nombre;
    private String descripcion;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    /*
        La tarea definida conoce cual es el tipo de articulo que tiene asociado
    */
    @ManyToOne
    private TipoDeArticulo tipoArticuloAsociado;
    
    /*
        La tarea definida conoce la lista de tareas a realizar en las que esta
        presente
    */
    @OneToMany(mappedBy="tareaDefinida")
    private List<TareaARealizar> tareas;
    
    /*================== Fin Atributos para las relaciones ===================*/

    public TareaDefinida() {
        this.nombre = "Nombre no Definido";
        this.descripcion = "Descripción no Definida";
    }
    
    public TareaDefinida(String codigo, String nombre, String descripcion) {
        this.codigoUnico = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoArticuloAsociado = null;
    }
    
    public TareaDefinida(String codigo, String nombre, String descripcion, TipoDeArticulo ta) {
        this.codigoUnico = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoArticuloAsociado = ta;
    }
    
    public int getId_tareadefinida () {
        return this.id_tareadefinida;
    }
    
    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return "("+this.codigoUnico+") "+this.nombre;
    }
    public TipoDeArticulo getTipoArticuloAsociado() {
        return tipoArticuloAsociado;
    }

    public void setTipoArticuloAsociado(TipoDeArticulo tipoArticuloAsociado) {
        this.tipoArticuloAsociado = tipoArticuloAsociado;
    }

    public List<TareaARealizar> getTareas() {
        return tareas;
    }

    public void agregarTarea(TareaARealizar tarea) {
        this.tareas.add(tarea);
    }
    
    
    
    
}
