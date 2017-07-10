/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ulisss
 */
public abstract class Persona {
    String nombre;
    String direccion;
    String numTelefono;
    String dirEmail;
    
    public Persona(){}
    
    public Persona(String nNombre, String nDireccion, String nNumTelefono, String nDirEmail){
        this.nombre = nNombre;
        this.direccion = nDireccion;
        this.numTelefono = nNumTelefono;
        this.dirEmail = nDirEmail;
    }
    
    @Override
    abstract public String toString();
}
