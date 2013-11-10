/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase2.animales;

/**
 *
 * @author alumno
 */
public class Vicuña extends Animal {
    
    public Vicuña(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("zzzzzzzzzZZZzzZZZ");
    }

    @Override
    public void comer() {
        System.out.println("pasto");
    }
    
}
