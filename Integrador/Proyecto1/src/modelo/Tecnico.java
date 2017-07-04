/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author toba_2_6_7
 */
@Entity
@Table(name="tecnicos")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_empleado")
public abstract class Tecnico implements Serializable {
    /*========================= Atributos de la clase ========================*/
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_tecnico;
    private final String nombres;
    private final String apellidos;
    private final String documentoUnico;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    /*
        Un tecnico conoce la lista de articulos en los que puede trabajar
    */
    @ManyToMany
    private Set<TipoDeArticulo> articulosEspecializados;
    
    /*
        Un tecnico conoce la lista de tareas que tiene que realizar
    */
    @OneToMany(mappedBy="tecnico")
    private List<TareaARealizar> tareas;
    
    /*================== Fin Atributos para las relaciones ===================*/
    
    protected Tecnico () {
        this.nombres = "";
        this.apellidos = "";
        this.documentoUnico = "";
        this.articulosEspecializados = new HashSet();
        this.tareas = new ArrayList<>();
    }
    
    protected Tecnico(String nNombres, String nApellidos, String nDocumentoUnico) {
        this.nombres = nNombres;
        this.apellidos = nApellidos;
        this.documentoUnico = nDocumentoUnico;
        this.articulosEspecializados = new HashSet();
        this.tareas = new ArrayList<>();
    }
}
