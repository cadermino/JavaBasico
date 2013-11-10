/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.universo.abstractas;

/**
 *
 * @author alumno
 */
public abstract class SerVivo {
    private String nombre;
    public abstract void comer();
    public abstract void comunicarse();
    public abstract void sentir();
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
