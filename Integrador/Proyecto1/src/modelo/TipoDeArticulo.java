/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
/**
 *
 * @author toba_2_6_7
 */
@Entity
@Table(name="tiposarticulo")
public class TipoDeArticulo implements Serializable{
    /*========================= Atributos de la clase ========================*/
    @Id
    @SequenceGenerator(name="sec_tipo_de_articulo", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_tipo_de_articulo")
    private int id_tipoarticulo;
    private String codigo;
    private String nombre;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    
    /*
        Con esto estamos diciendo que el tipo de articulo va a conocer cuales
        son los articulos que lo implementan por medio del atributo 'articulo'
        que del otro lado de la relacion esta siendo 
    */
    @OneToMany(mappedBy = "tipo")
    private Set<Articulo> articulos;
    
    /*
        Un tipo de articulo conoce cuales son los tecnicos que se encuentran
        especializados en su reparacion
    */
    @ManyToMany(mappedBy="articulosEspecializados")
    private List<Tecnico> tecnicos;
    
    /*
        Un tipo de articulo conoce cuales son las tareas que lo tienen asociado
        a el
    */
    @OneToMany(mappedBy="tipoArticuloAsociado")
    private Set<TareaDefinida> tareasDefinidasAsociadas;
    /*================== Fin Atributos para las relaciones ===================*/

    public TipoDeArticulo() {
        
        
    }
    
    public TipoDeArticulo(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tareasDefinidasAsociadas = new HashSet();
        this.articulos = new HashSet();
    }

    public int getId_tipoarticulo() {
        return id_tipoarticulo;
    }

    public void setId_tipoarticulo(int id_tipoarticulo) {
        this.id_tipoarticulo = id_tipoarticulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    @Override
    public String toString(){
        return "("+this.codigo + ") " + this.nombre;
    }
    
    public void agregarArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }
    
    public void eliminarArticulo(Articulo articulo) {
        this.articulos.remove(articulo);
    }

    public Set<TareaDefinida> getTareasDefinidasAsociadas() {
        return tareasDefinidasAsociadas;
    }

    public void agregarTareaDefinidaAsociada(TareaDefinida TDA) {
        this.tareasDefinidasAsociadas.add(TDA);
    }
    
    public void eliminarTareaDefinidaAsociada(TareaDefinida TDA){
        this.tareasDefinidasAsociadas.remove(TDA);
    }

    public List<Tecnico> getTecnicos() {
        return tecnicos;
    }
    
    public void agregarTecnico(Object t) {
        if (t instanceof EmpleadoJornalero) {
            EmpleadoJornalero EJ = (EmpleadoJornalero) t;
            this.tecnicos.add(EJ);
        } else if (t instanceof EmpleadoMensual) {
            EmpleadoMensual EM = (EmpleadoMensual) t;
            this.tecnicos.add(EM);            
        }
    }
    
    public void quitarTecnico(Object t) {
        if (t instanceof EmpleadoJornalero) {
            EmpleadoJornalero EJ = (EmpleadoJornalero) t;
            this.tecnicos.remove(EJ);
        } else if (t instanceof EmpleadoMensual) {
            EmpleadoMensual EM = (EmpleadoMensual) t;
            this.tecnicos.remove(EM);
        }
    }
    
    
}
