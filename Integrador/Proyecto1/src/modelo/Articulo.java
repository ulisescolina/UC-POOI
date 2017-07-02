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
@Table(name="articulos")
public class Articulo implements Serializable{
    /*========================= Atributos de la clase ========================*/
    @Id
    @SequenceGenerator(name="sec_articulo", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_articulo")
    private int id_articulo;
    private String nombre;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    @ManyToOne
    private TipoDeArticulo tipo;
    
    /*
        Un articulo conoce la lista de reclamos en las que esta presente
    */
    @OneToMany(mappedBy="articulo")
    private List<Reclamo> reclamos;
    /*================== Fin Atributos para las relaciones ===================*/

    public Articulo() {
        this.nombre = "";
        this.tipo = new TipoDeArticulo();
        this.reclamos = new ArrayList<>();
    }
    
    public Articulo(String nombre, TipoDeArticulo nTA) {
        this.nombre = nombre;
        this.tipo = nTA;
        this.reclamos = new ArrayList<>();
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return this.getNombre();
    }
    
    public void setTipoArticulo (TipoDeArticulo nTipo) {
        this.tipo = nTipo;
    }
    
    public TipoDeArticulo getTipoDeArticulo() {
        return this.tipo;
    }
    
    public List<Reclamo> getReclamos () {
        return this.reclamos;
    }
    
    public void agregarReclamo (Reclamo nReclamo) {
        this.reclamos.add(nReclamo);
    }
    
    public void quitarReclamo (Reclamo reclamo) {
        this.reclamos.remove(reclamo);
    }
}
