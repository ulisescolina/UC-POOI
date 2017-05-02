/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ulisss
 */
public class Cuenta {
    private int id;
    private double saldo;
    private double tasaInteresAnual;
    private Date fechaCreacion;
    
    public Cuenta()
    {
        this.id = 0;
        this.saldo = 0;
        this.tasaInteresAnual = 0;
        this.fechaCreacion = new Date();
    }
    
    public Cuenta(int nId, int nSaldoInicial)
    {
        this.id = nId;
        this.saldo = nSaldoInicial;
        this.tasaInteresAnual = 0;
        this.fechaCreacion = new Date();
    }
    
    public Date getFechaCreacion()
    {
        return this.fechaCreacion;
    }
    
    public void setId(int nId)
    {
        this.id = nId;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setSaldo(double nSaldo)
    {
        this.saldo = nSaldo;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void setTasaInteresAnual(double nTIA)
    {
        this.tasaInteresAnual = nTIA;
    }
    
    public double getTasaInteresAnual()
    {
        return this.tasaInteresAnual / 100;
    }
    
    public double getTasaInteresMensual()
    {
        return this.getTasaInteresAnual() / 12;
    }
    
    public double getInteresMensual()
    {
        return this.saldo * this.getTasaInteresMensual();
    }
    
    public void retirar(double cRetirar)
    {
        if (cRetirar > this.saldo) {
            System.out.print("No tiene suficiente dinero para retirar"+"\n");
        } else {
            this.saldo -= cRetirar;
            System.out.print("Se ha efectuado el retiro de $"+cRetirar+"\n");
        }
    }
    
    public void depositar(double cDepositar)
    {
        this.saldo += cDepositar;
        System.out.print("Se ha efectuado el deposito de $"+cDepositar+"\n");
    }
    
    @Override
    public String toString()
    {
        String resultado;
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        resultado = "id: "+this.getId()+", Saldo: "+this.getSaldo()+", Interes mensual: "+this.getInteresMensual()+", Fecha de creacion de cuenta: "+ df.format(this.getFechaCreacion());
        return resultado;
    }
}
