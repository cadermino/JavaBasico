/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase4.hilos;

/**
 *
 * @author alumno
 */
public class Hilos {
    
    public static void main(String[] args) {
        //Hilos.testHiloHerencia();
        //Hilos.testHiloInterface();
        //Hilos.testSimpleHilo();
        Hilos.testSimple2Delay();
    }
    
    public static void testHiloHerencia() {
        HiloHerencia testhilo = new HiloHerencia();
        testhilo.start();
    }
    
    public static void testHiloInterface() {
        HiloImplementacion hilo = new HiloImplementacion();
        Thread runner = new Thread(hilo);
        runner.start();
    }
    
    public static void testSimpleHilo() {
        SimpleDelayThread delay = new SimpleDelayThread();
        delay.start();
    }
    
    public static void testSimple2Delay() {
        Simple2DelayThread1 delay = new Simple2DelayThread1("sdhgfrdr", 2000);
        delay.start();
        
    }
}
