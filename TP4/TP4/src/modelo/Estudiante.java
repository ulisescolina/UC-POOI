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
public class Estudiante extends Persona{
    private String situacionDeClase;
  
    public Estudiante(String nNombre, String nDireccion, String nNumTelefono, String nDirEmail, String nSituacionDeClase){
        super(nNombre, nDireccion, nNumTelefono, nDirEmail);
        this.situacionDeClase = nSituacionDeClase;
    }
    
    @Override
    public String toString(){
        String Estudiante;
        Estudiante = "Nombre: "+this.nombre+", Situacion de Clase: "+this.situacionDeClase+"\nDireccion: "+this.direccion+"\nNumero de Telefono: "+this.numTelefono+"\nDireccion Email: "+this.dirEmail;
        return Estudiante;
    }
}
