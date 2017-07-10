/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
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
    
    public String getNombre() {
        return this.nombres;
    }
    
    public void setNombre(String nNombre) {
        this.nombres = nNombre;
    }
    
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String nApellidos) {
        this.apellidos = nApellidos;
    }
    
    public String getDocumentoUnico() {
        return this.documentoUnico;
    }
    
    public void setDocumentoUnico (String nDU) {
        this.documentoUnico = nDU;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
    
    @Override
    public String toString()  {
        return "(" + this.documentoUnico +") "+ this.apellidos + ", "+this.nombres;
    }
    
    /*Implementacion metodos abstractos de la superclase*/
    @Override
    public void bajaTecnico() {
        this.activo = false;
    }
    
    @Override
    public void agregarArticuloEspecializado(TipoDeArticulo TDA){
        this.articulosEspecializados.add(TDA);
    }
    
    @Override
    public void quitarArticuloEspecializado(TipoDeArticulo TDA) {
        this.articulosEspecializados.remove(TDA);
    }
    
    @Override
    public Set getArticulosEspecializados() {
        return this.articulosEspecializados;
    }
    
    @Override
    public void agregarTarea(TareaARealizar TAR) {
        this.tareas.add(TAR);
    }
    
    @Override
    public void quitarTarea(TareaARealizar TAR) {
        this.tareas.remove(TAR);
    }
    
    @Override
    public List getTareas() {
        return this.tareas;
    }
    
    
}
