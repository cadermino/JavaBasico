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
public class SimpleDelayThread extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            
            System.out.println(i);
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException ex) {
                System.out.println("HORROR: " + ex.getMessage());
            }
        }
    }
}
