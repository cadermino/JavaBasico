/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase5.serializacion;

import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Persona implements Serializable{
    
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
        
    @Override
    public String toString(){
        return "Nombre: " + nombre + "; Edad: " + edad;
    }
    
}
