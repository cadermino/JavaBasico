/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public abstract class Abeja extends Himenoptero{

    @Override
    public void alimentarse() {
        System.out.println("Alimentandose...");
    }
    public void volar() {
        System.out.println("Volando...");
    }
    
}
