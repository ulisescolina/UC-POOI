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
public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion(String nTitulo, String nAutor)
    {
        this.titulo = nTitulo;
        this.autor = nAutor;
    }
    
    public void setTitulo(String nTitulo)
    {
        this.titulo = nTitulo;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    public void setAutor(String nAutor)
    {
        this.autor = nAutor;
    }
    
    public String getAutor()
    {
        return this.autor;
    }
    
    @Override
    public String toString()
    {
        String cancion;
        cancion = this.getAutor() +" - "+ this.getTitulo();
        return cancion;
    }
    
    public boolean equals(Cancion unaCancion)
    {
        return this.toString().equals(unaCancion.toString());
    }
}
