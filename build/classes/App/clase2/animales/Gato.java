/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase2.animales;

/**
 *
 * @author alumno
 */
public class Gato extends Animal{
    
    public Gato(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
        
    }
    @Override
    public void hacerRuido(){
        System.out.println("MEOW");
    }

    @Override
    public void comer() {
        System.out.println("ratones");
    }
    
}
