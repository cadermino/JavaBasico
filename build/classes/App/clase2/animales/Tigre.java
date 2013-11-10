/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase2.animales;

/**
 *
 * @author alumno
 */
public class Tigre extends Animal {

    public Tigre(String nombre, int edad) {

        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("GRRRRRRRRRRRRR");
    }
    
    public void hacerRuido(Boolean molestar){
        System.out.println("ibghrtnhtriontyionmtyionjyotnj");
    }

    @Override
    public void comer() {
        System.out.println("Carne");
    }
}
