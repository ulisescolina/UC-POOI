/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author ulisss
 */
public class NoDocente extends Empleado{
    private String titulo;
    
    public NoDocente (String nNombre, String nDireccion, String nNumTelefono, String nDirEmail, double nSalario, Date nFechaContrato, String nTitulo){
        super(nNombre, nDireccion, nNumTelefono, nDirEmail, nSalario, nFechaContrato);
        this.titulo = nTitulo;
    }
    
    @Override
    public String toString (){
        String noDocente;
        noDocente = "Nombre: "+this.nombre+", Titulo: "+this.titulo+"\nSalario: "+this.salario+", Fecha de Contrato: "+this.fechaContrato+"\nDireccion: "+this.direccion+"\nNumero de Telefono: "+this.numTelefono+"\nDireccion Email: "+this.dirEmail;
        return noDocente;
    }
}
