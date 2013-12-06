/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public class Obrera extends Abeja{
    
    public Obrera(String nombreCientifico, int ciclo ) {
        this.setNombreCientifico(nombreCientifico);
        this.setCiclo(ciclo);
    }
    public void hacerMiel() {
        System.out.println("Haciendo miel...");
    }
}
