/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.Persistencia;
import modelo.*;

/**
 *
 * @author toba_2_6_7
 */
public class Controlador {
    Persistencia persistencia;    

    public Controlador(Persistencia p) {
        this.persistencia = p;
    }
    
    /*
    *   EPE: Error de Persistencia Eliminar
    *   EPA: Error de Persistencia Agregar
    *   EPM: Error de Persistencia Modificar
    */
    public void mensajeErrorPersistencia(String tm, String pron, String obj, String titulo) {
        switch (tm) {
            case "EPE":
                JOptionPane.showMessageDialog(null, "No es posible eliminar " + pron + obj, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case "EPA":
                JOptionPane.showMessageDialog(null, "No es posible la creacion " + pron + obj, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case "EPM":
                JOptionPane.showMessageDialog(null, "No es posible la modificación " + pron + obj, titulo, JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
    
    /*
    *   MA: Mensaje Advertencia
    *   M: Mensaje
    *   MI: Mensaje de Informacion
    */
    public void mensaje(String tm, String msj, String titulo) {
        switch (tm) {
            case "MA":
                JOptionPane.showMessageDialog(null, msj, titulo, JOptionPane.WARNING_MESSAGE);
                break;
            case "M":
                JOptionPane.showMessageDialog(null, msj, titulo, JOptionPane.DEFAULT_OPTION);
                break;
            case "MI":
                JOptionPane.showMessageDialog(null, msj, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
    
    /*==================== Metodos para TipoDeArticulo =======================*/
    public List listarTiposDeArticulo() {
        return this.persistencia.buscarTodosOrdenadosPor(TipoDeArticulo.class, TipoDeArticulo_.nombre);
    }
    
    public void agregarTipoDeArticulo(String codigo, String nombre){
        this.persistencia.iniciarTransaccion();
        try {
            TipoDeArticulo TDA = new TipoDeArticulo(codigo.toUpperCase(), nombre.toUpperCase());
            this.persistencia.insertar(TDA);
            this.persistencia.confirmarTransaccion();
        } catch (Exception e) {
            this.persistencia.descartarTransaccion();
        }
    }
    
    public int eliminarTipoDeArticulo(TipoDeArticulo TDA) {
        if (TDA.getTareasDefinidasAsociadas().isEmpty() && TDA.getArticulos().isEmpty() && TDA.getTecnicos().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            // si no tiene tareas definidas asociadas
            this.persistencia.eliminar(TDA);
            this.persistencia.confirmarTransaccion();            
            return 0;
        } else {
            return 1;
        }
    }
    
    public void editarTipoDeArticulo(TipoDeArticulo TDA, String codigo, String nombre) {
        if (TDA != null) {
            this.persistencia.iniciarTransaccion();
            try {
                TDA.setNombre(nombre.toUpperCase());
                TDA.setCodigo(codigo.toUpperCase());
                this.persistencia.modificar(TDA);
                this.persistencia.confirmarTransaccion();
            } catch (Exception e){
                this.persistencia.descartarTransaccion();
            }
        }
    }    
    /*================== Fin Metodos para TipoDeArticulo =====================*/
    
    
    
    /*===================== Metodos para TareaDefinida =======================*/
    public List listarTareasDefinidas() {
        return this.persistencia.buscarTodosOrdenadosPor(TareaDefinida.class, TareaDefinida_.nombre);
    }
    
    public void agregarTareaDefinida(String CodigoTareaDefinida, String NombreTareaDefinida, String DescripcionTareaDefinida, TipoDeArticulo tda) {
        this.persistencia.iniciarTransaccion();
        try {
            TareaDefinida TD = new TareaDefinida(CodigoTareaDefinida.toUpperCase(), NombreTareaDefinida.toUpperCase(), DescripcionTareaDefinida.toUpperCase(), tda);
            tda.agregarTareaDefinidaAsociada(TD);
            this.persistencia.modificar(tda);
            this.persistencia.insertar(TD);
            this.persistencia.confirmarTransaccion();
        } catch (Exception e) {
            this.persistencia.descartarTransaccion();
        }
    }
    
    public void editarTareaDefinida (TareaDefinida TD, String CodigoTareaDefinida, String NombreTareaDefinida, String DescripcionTareaDefinida, TipoDeArticulo TDA) {
        if (TD != null) {
            this.persistencia.iniciarTransaccion();
            try {
                TD.setNombre(NombreTareaDefinida.toUpperCase());
                TD.setCodigoUnico(CodigoTareaDefinida.toUpperCase());
                TD.setDescripcion(DescripcionTareaDefinida);
                /*  quito la TareaDefinida del conjunto de tareas que conoce el
                    TipoDeArticulo*/
                if (TD.getTipoArticuloAsociado() != null) {
                    TipoDeArticulo tipoArticuloViejo = TD.getTipoArticuloAsociado();
                    tipoArticuloViejo.eliminarTareaDefinidaAsociada(TD);
                    this.persistencia.modificar(tipoArticuloViejo);
                }
                TD.setTipoArticuloAsociado(TDA);
                TDA.agregarTareaDefinidaAsociada(TD);
                this.persistencia.modificar(TDA);
                this.persistencia.modificar(TD);
                this.persistencia.confirmarTransaccion();
            } catch (Exception e){
                this.persistencia.descartarTransaccion();
            }
        }
    }
    
    public int eliminarTareaDefinida (TareaDefinida td) {
        if (td.getTareas().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            TipoDeArticulo tda = td.getTipoArticuloAsociado();
            tda.eliminarTareaDefinidaAsociada(td);
            td.setTipoArticuloAsociado(null);
            this.persistencia.modificar(tda);
            this.persistencia.eliminar(td);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }
    /*================== Fin Metodos para TareaDefinida ======================*/
    
    
    /*======================= Metodos para Articulo ==========================*/
    public List listarArticulos(){
        return this.persistencia.buscarTodosOrdenadosPor(Articulo.class, Articulo_.nombre);
    }
    
    public void agregarArticulo(String nNombre, TipoDeArticulo TDA){
        this.persistencia.iniciarTransaccion();
        try {
            Articulo a = new Articulo(nNombre, TDA);
            TDA.agregarArticulo(a);
            this.persistencia.modificar(TDA);
            this.persistencia.insertar(a);
            this.persistencia.confirmarTransaccion();
        } catch (Exception e) {
            this.persistencia.descartarTransaccion();
        }
    }
    
    public void editarArticulo(Articulo a, String nNombre, TipoDeArticulo TDA) {
        if (a != null) {
            this.persistencia.iniciarTransaccion();
            try {
                a.setNombre(nNombre);
                if (a.getTipoDeArticulo() != null) {
                    TipoDeArticulo TipoArticuloViejo = a.getTipoDeArticulo();
                    TipoArticuloViejo.eliminarArticulo(a);
                    this.persistencia.modificar(TipoArticuloViejo);
                }
                a.setTipoArticulo(TDA);
                TDA.agregarArticulo(a);
                this.persistencia.modificar(a);
                this.persistencia.modificar(TDA);
                this.persistencia.confirmarTransaccion();
            } catch (Exception e) {
                this.persistencia.descartarTransaccion();
            }
        }
    }
    
    public int eliminarArticulo(Articulo a) {
        if (a.getReclamos().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            TipoDeArticulo tda = a.getTipoDeArticulo();
            tda.eliminarArticulo(a);
            a.setTipoArticulo(null);
            this.persistencia.modificar(tda);
            this.persistencia.eliminar(a);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }
    /*===================== Fin Metodos para Articulo ========================*/
    
    /*======================= Metodos para Reclamo ===========================*/
    public List listarReclamos() {
        return this.persistencia.buscarTodosOrdenadosPor(Reclamo.class, Reclamo_.numero);
    }
    
    public void agregarReclamo(String nDescripcionProblema, Date nFechaEstimadaEntrega, Articulo a) {
        this.persistencia.iniciarTransaccion();
        try {
            Reclamo r = new Reclamo(nDescripcionProblema, nFechaEstimadaEntrega, a);
            a.agregarReclamo(r);
            this.persistencia.modificar(a);
            this.persistencia.insertar(r);
            this.persistencia.confirmarTransaccion();
        } catch (Exception e) {
            this.persistencia.descartarTransaccion();
        }
    }
    
    public void editarReclamo(Reclamo r, String nDescripcionProblema, Date nFechaEstimadaEntrega, Articulo a) {
        if (r != null) {
            this.persistencia.iniciarTransaccion();
            try {
                r.setDescProblema(nDescripcionProblema);
                if (r.getArticulo() != null) {
                    Articulo articuloViejo = r.getArticulo();
                    articuloViejo.quitarReclamo(r);
                    this.persistencia.modificar(articuloViejo);
                }
                a.agregarReclamo(r);
                r.setArticulo(a);
                this.persistencia.modificar(a);
                this.persistencia.modificar(r);
                this.persistencia.confirmarTransaccion();
            } catch (Exception e) {
                this.persistencia.descartarTransaccion();
            }
        }
    }
    
    public int eliminarReclamo(Reclamo r) {
        if (r.getTareas().isEmpty()) {
            this.persistencia.iniciarTransaccion();
            Articulo a = r.getArticulo();
            a.quitarReclamo(r);
            r.setArticulo(null);
            this.persistencia.modificar(a);
            this.persistencia.eliminar(r);
            this.persistencia.confirmarTransaccion();
            return 0;
        } else {
            return 1;
        }
    }
    /*===================== Fin Metodos para Reclamo =========================*/
    
    /*======================= Metodos para Tecnico ===========================*/
    public List listarTecnicos() {
        return this.persistencia.buscarTodosOrdenadosPor(Tecnico.class, Tecnico_.apellidos);
    }
    
    public void agregarTecnico(String nNombres, String nApellidos, String nDocumentoUnico, Class<Tecnico> tipo, Double remuneracion) {
        try {
            if (tipo != null) {
                this.persistencia.iniciarTransaccion();
                if (tipo.getName().toUpperCase() == "EMPLEADOJORNALERO") {
                    EmpleadoJornalero EJ = new EmpleadoJornalero(nNombres, nApellidos, nDocumentoUnico, remuneracion);
                    this.persistencia.insertar(EJ);
                    this.persistencia.confirmarTransaccion();
                } else {
                    EmpleadoJornalero EJ = new EmpleadoJornalero(nNombres, nApellidos, nDocumentoUnico, remuneracion);
                    this.persistencia.insertar(EJ);
                    this.persistencia.confirmarTransaccion();
                }
            }
        }catch (Exception e) {
            this.persistencia.iniciarTransaccion();
        }
    }
    
    public void editarTecnico(Tecnico t, String nNombres, String nApellidos, String nDocumentoUnico, Class<Tecnico> tipo, Double remuneracion) {
        try {
            if (tipo != null) {
                this.persistencia.iniciarTransaccion();
                if (tipo.getName().toUpperCase() == "EMPLEADOJORNALERO") {
                    EmpleadoJornalero EJ = new EmpleadoJornalero(nNombres, nApellidos, nDocumentoUnico, remuneracion);
                    this.persistencia.insertar(EJ);
                    this.persistencia.confirmarTransaccion();
                } else {
                    EmpleadoJornalero EJ = new EmpleadoJornalero(nNombres, nApellidos, nDocumentoUnico, remuneracion);
                    this.persistencia.insertar(EJ);
                    this.persistencia.confirmarTransaccion();
                }
            }
        }catch (Exception e) {
            this.persistencia.iniciarTransaccion();
        }
    } 
    
    public void eliminarTecnico(Tecnico t) {
        
    }
    /*===================== Fin Metodos para Tecnico =========================*/
    
    /*==================== Metodos para TareaARealizar =======================*/
    public List listarTareasARealizar() {
        return this.persistencia.buscarTodosOrdenadosPor(TareaARealizar.class, TareaARealizar_.id_tareaarealizar);
    }
    
    public void agregarTareaARealizar(Reclamo r, TareaDefinida TD, Tecnico T) {
        this.persistencia.iniciarTransaccion();
        try {
            TareaARealizar tar = new TareaARealizar(r, TD,T);
            r.agregarTarea(tar);
            this.persistencia.modificar(r);
            this.persistencia.insertar(tar);
            this.persistencia.confirmarTransaccion();
        } catch (Exception e) {
            this.persistencia.descartarTransaccion();
        }
    }
    
    public void editarTareaARealizar(Reclamo r ,TareaARealizar TAR, TareaDefinida TD, Tecnico T){
        if (r != null && TAR != null) {
            this.persistencia.iniciarTransaccion();
            try {
                TAR.setTareaDefinida(TD);
                TAR.setTecnico(T);
                if (TAR.getReclamo() != null) {
                    Reclamo reclamoViejo = TAR.getReclamo();
                    reclamoViejo.quitarTarea(TAR);
                    this.persistencia.modificar(reclamoViejo);
                }
                r.agregarTarea(TAR);
                
                this.persistencia.modificar(TAR);
                this.persistencia.modificar(r);
                this.persistencia.confirmarTransaccion();
            } catch (Exception e) {
                this.persistencia.descartarTransaccion();
            }
        }
    }
    
    public int eliminarTareaARealizar(TareaARealizar TAR){
        if (TAR.getTiempos().isEmpty()) {
            if (!TAR.isFinalizado()) {
                this.persistencia.iniciarTransaccion();
                Reclamo r = TAR.getReclamo();
                r.quitarTarea(TAR);
                TAR.setReclamo(null);
                this.persistencia.modificar(r);
                this.persistencia.eliminar(TAR);
                this.persistencia.confirmarTransaccion();
                return 0;
            }
            return 2; // Una vez finalizada, la tarea ya no puede ser borrada
        } else {
            return 1;
        }    
    }
    /*================== Fin Metodos para TareaARealizar =====================*/
    
    /*=================== Metodos para TiempoInvertido =======================*/
    /*================= Fin Metodos para TiempoInvertido =====================*/
    
    
    /*======================= Metodos para Agregar ===========================*/
    /*===================== Fin Metodos para Agregar =========================*/
    
    
}
