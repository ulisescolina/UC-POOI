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
abstract public class Empleado extends Persona{
    double salario;
    Date fechaContrato;
    
    public Empleado(String nNombre, String nDireccion, String nNumTelefono, String nDirEmail, double nSalario, Date nFechaContrato) {
        super(nNombre, nDireccion, nNumTelefono, nDirEmail);
        this.salario = nSalario;
        this.fechaContrato = nFechaContrato;
    }
    
    
}
