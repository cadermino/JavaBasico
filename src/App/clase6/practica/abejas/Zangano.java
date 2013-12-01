/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public class Zangano extends Abeja{

    public Zangano(String nombreCientifico, int ciclo ) {
        this.setNombreCientifico(nombreCientifico);
        this.setCiclo(ciclo);
    }
    
    public void aparearse() {
        System.out.println("Zangano buscando abeja reina para aparearse");
    }
}
