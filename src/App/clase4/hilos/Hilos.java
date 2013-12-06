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
        //Hilos.testSimple2Delay();
        //Hilos.testPrioridad();
        Hilos.testEjercicio();
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
        
        long delay1 = (long)(Math.random()*2000);
        Simple2DelayThread1 delay = new Simple2DelayThread1("sdhgfrdr", delay1);
        delay.start();
        
    }
    
    public static void testPrioridad() {
        Simple2DelayThread1 thread1 = new Simple2DelayThread1("carlos", 0);
        Simple2DelayThread1 thread2 = new Simple2DelayThread1("dyubgu", 0);
        
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        
        thread2.start();
        thread1.start();
    }
    public static void testEjercicio() {
        
        ProcesosHilo proceso = new ProcesosHilo();
        proceso.start();
    }
}
