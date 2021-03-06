/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author toba_2_6_7
 */
public class Persistencia {
    
    private final EntityManager em;
        

    public Persistencia(EntityManagerFactory emf) {
        this.em = emf.createEntityManager();        
    }
    
    public void iniciarTransaccion() {
        em.getTransaction().begin();
    }
    
    public void confirmarTransaccion() {
        em.getTransaction().commit();
    }

    public void descartarTransaccion() {
        em.getTransaction().rollback();
    }
    
    public void insertar(Object o) {
        this.em.persist(o);
    }
    
    public void modificar(Object o){
        this.em.merge(o);
    }

    public void eliminar(Object o){
        this.em.remove(o);
    }

    public void refrescar(Object o) {
        this.em.refresh(o);
    }
    
    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve un objeto de tipo (T)    
    public <T extends Object> T buscar(Class<T> clase, Object id) {
        return (T) this.em.find(clase, id);
    }    
    
    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve una lista de ese tipo (T)
    public <T extends Object> List<T> buscarTodos (Class<T> clase) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);       
        return em.createQuery(consulta).getResultList();      
    }

    // el parametro de orden a pasar se obtiene del metamodelo generado por EclipseLink
    public <T extends Object, P extends Object> List<T> buscarTodosOrdenadosPor (Class<T> clase, SingularAttribute<T, P> orden) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);
        consulta.orderBy(cb.asc(inicio.get(orden)));
        return em.createQuery(consulta).getResultList();
    }
    
    /*Metodos para el Tecnico*/
    /*
    * Listar a los tecnicos que no esten dados de baja de la base de datos
    */
    public <T extends Object> List<T> buscarTecnicosActivos() {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<modelo.Tecnico> consulta = cb.createQuery(modelo.Tecnico.class);
        Root<modelo.Tecnico> c = consulta.from(modelo.Tecnico.class);
        consulta.where(cb.equal(c.get("activo"), true));
        return (List<T>) em.createQuery(consulta).getResultList();
    }
    
    /*Metodos para los Reclamos*/
    /**
     * Listar los reclamos que estan activos
     */
    public <T extends Object> List<T> buscarReclamosActivos() {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<modelo.Reclamo> consulta = cb.createQuery(modelo.Reclamo.class);
        Root<modelo.Reclamo> c = consulta.from(modelo.Reclamo.class);
        consulta.where(c.get("fechaFin").isNull());
        return (List<T>) em.createQuery(consulta).getResultList();
    }
    
    /**
     * Listar los reclamos que estan activos
     */
    public <T extends Object> List<T> buscarReclamosFinalizados() {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<modelo.Reclamo> consulta = cb.createQuery(modelo.Reclamo.class);
        Root<modelo.Reclamo> c = consulta.from(modelo.Reclamo.class);
        consulta.where(c.get("fechaFin").isNotNull());
        return (List<T>) em.createQuery(consulta).getResultList();
    }
}
