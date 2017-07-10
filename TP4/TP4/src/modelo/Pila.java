/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author ulisss
 */
public class Pila {
    List<Object> lista = new ArrayList<>();
    
    public Pila(){}
    
    public boolean vacia() {
        return lista.isEmpty();
    }
    
    public int largo (){
        return lista.size();
    }
    
    public Object cima(){
        return lista.get(lista.size()-1);
    }
    
    public void apilar(Object o) {
        lista.add(o);
    }
    
    public Object desapilar(){
        Object objeto = lista.get(lista.size()-1);
        lista.remove(objeto);
        return objeto;
    }
    
    @Override
    public String toString(){
        ListIterator<Object> li;
        String Lista = "Pila: ";
        li = lista.listIterator(lista.size());
        while (li.hasPrevious()) {
            Lista += li.previous() + " ";
        }
        return Lista;
    }
}