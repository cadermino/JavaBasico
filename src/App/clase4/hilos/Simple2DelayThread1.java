/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase4.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Simple2DelayThread1 extends Thread{
    private String nombre;
    private long delay;

    public Simple2DelayThread1(String nombre, long delay) {
        this.nombre = nombre;
        this.delay = delay;
    }
    
    
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            
            System.out.println("nombre: " + nombre + " delay: " + delay);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException ex) {
                System.out.println("HORROR: " + ex.getMessage());
            }
        }
    }
}
