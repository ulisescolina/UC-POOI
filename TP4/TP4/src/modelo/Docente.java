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
public class Docente extends Empleado{
    private String cargo;
    
    public Docente (String nNombre, String nDireccion, String nNumTelefono, String nDirEmail, double nSalario, Date nFechaContrato, String nCargo){
        super(nNombre, nDireccion, nNumTelefono, nDirEmail, nSalario, nFechaContrato);
        this.cargo = nCargo;
    }
    
    @Override
    public String toString() {
        String Docente;
        Docente = "Nombre: "+this.nombre+", Cargo: "+this.cargo+"\nSalario: "+this.salario+", Fecha de Contrato: "+this.fechaContrato+"\nDireccion: "+this.direccion+"\nNumero de Telefono: "+this.numTelefono+"\nDireccion Email: "+this.dirEmail;
        return Docente;
    }
}
