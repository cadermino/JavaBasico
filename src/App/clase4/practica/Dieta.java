/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase4.practica;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Dieta {
    private Date hora;
    private Animal animal;
    private String tipo;
    private Alimento alimentos[];

    public Dieta(String tipo) {
        this.tipo = tipo;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
