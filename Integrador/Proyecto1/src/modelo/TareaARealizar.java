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
@Table(name="tareasrealizar")
public class TareaARealizar implements Serializable{
    /*========================= Atributos de la clase ========================*/
    @Id
    @SequenceGenerator(name="sec_tarea_a_realizar", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sec_tarea_a_realizar")
    private int id_tareaarealizar;
    private boolean finalizado;
    /*====================== Fin Atributos de la clase =======================*/
    
    /*==================== Atributos para las relaciones =====================*/
    /*
        Una tarea a realizar estara asociado a un reclamo en particular
    */
    @ManyToOne
    private Reclamo reclamo;
    
    /*
        Una tarea a realizar debe conocer los tiempos que se han invertido en ella
    */
    @OneToMany(mappedBy="tarea")
    private List<TiempoInvertido> tiempos;
    
    /*
        Una tarea a realiar va a conocer cual es la tarea que tiene definida 
        que tiene asociada
    */
    @ManyToOne
    private TareaDefinida tareaDefinida;
    
    /*
        Conoce que tecnico tiene la responsabilidad de tratar con ella
    */
    @ManyToOne
    private Tecnico tecnico;
    /*================== Fin Atributos para las relaciones ===================*/

    public TareaARealizar(){
        this.finalizado = false;
        this.tiempos = new ArrayList<>();
    }
    
    public TareaARealizar(Reclamo r, TareaDefinida td) {
        this.finalizado = false;
        this.tiempos = new ArrayList<>();
        this.tareaDefinida = td;
        this.reclamo = r;
    }

    public int getId_tareaarealizar() {
        return id_tareaarealizar;
    }

    public void setId_tareaarealizar(int id_tareaarealizar) {
        this.id_tareaarealizar = id_tareaarealizar;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    @Override
    public String toString() {
        return this.tareaDefinida.getNombre();
    }
    
    public void setReclamo(Reclamo r){
        this.reclamo = r;
    }
    
    public void setTareaDefinida(TareaDefinida td){
        this.tareaDefinida = td;
    }
    
    public void agregarTiempoInvertido(TiempoInvertido TI){
        this.tiempos.add(TI);
    }
    
    public void quitarTiempoInvertido(TiempoInvertido TI) {
        this.tiempos.remove(TI);
    }
}
