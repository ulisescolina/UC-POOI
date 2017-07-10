/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author ulisss
 */
public class Cuenta {
    private int id;
    private double saldo;
    private double tasaInteresAnual;
    private Date fechaCreacion;
    
    private String nombre;
    private ArrayList<Transaccion> transacciones = new ArrayList<>(); 
    
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
    
    public Cuenta(int nId, String nNombre, double nSaldo){
        this.id = nId;
        this.saldo = nSaldo;
        this.nombre = nNombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
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
            transacciones.add(new Transaccion(new Fecha(1,1,2017), 'R', cRetirar));
            System.out.print("Se ha efectuado el retiro de $"+cRetirar+"\n");
        }
    }
    
    public void depositar(double cDepositar)
    {
        this.saldo += cDepositar;
        transacciones.add(new Transaccion(new Fecha(1,1,2017), 'D', cDepositar));
        System.out.print("Se ha efectuado el deposito de $"+cDepositar+"\n");
    }
    
    @Override
    public String toString()
    {
        String Cabecera, Transacciones;
        Cabecera = imprimirCabecera(this.getId(), this.getNombre() ,redondear(this.getInteresMensual(),2), redondear(this.getSaldo(),2));
        Transacciones = imprimirTransacciones(this.transacciones);
        return Cabecera+Transacciones;
    }
    
    
    /* Métodos estáticos */
    private static double redondear(double valor, int cDecimales) {
        if (cDecimales < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(cDecimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    private static String imprimirCabecera(int id, String titular, double tasaInteres, double saldo )
    {
        String Cabecera;
        Cabecera = "\n\n\tDetalles de la cuenta: "+id+"\n\n\tTitular: "+titular+"\n\tTasa de Interés: "+tasaInteres+"\n\tSaldo: $"+saldo;
        return Cabecera;
    } 
    
    private static String imprimirTransacciones(ArrayList<Transaccion> t)
    {
        String lTransacciones, Titulo;
        Titulo = "\n\n\tListado de Transacciones\n\t-------------------------------\n"
                   + "\tTipo\t|Fecha\t\t|Monto\n\t-------------------------------\n";
        lTransacciones = "";
        Iterator<Transaccion> it;
        it = t.iterator();
        while (it.hasNext()) {
            lTransacciones += it.next().toString()+"\n";
        }
        return Titulo+lTransacciones;
    }
}
