/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase4.hilos;

/**
 *
 * @author alumno
 */
public class HiloHerencia extends Thread{
    
    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}
