/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase2.animales;

/**
 *
 * @author alumno
 */
public class Zoologico {
    public static void main(String[] args) {
        Tigre diego = new Tigre("Diego", 20);
        diego.hacerRuido();
        diego.hacerRuido(true);
        diego.comer();
        
        Gato pus = new Gato("Pus", 10);
        pus.hacerRuido();
        pus.comer();
        
        Vicuña vicky = new Vicuña("Vicky", 15);
        vicky.hacerRuido();
        vicky.comer();
    }
    
}
