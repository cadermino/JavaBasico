/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public class Reina extends Abeja{

    public Reina(String nombreCientifico, int ciclo ) {
        this.setNombreCientifico(nombreCientifico);
        this.setCiclo(ciclo);
    }


    public void procrearAbeja() {
        System.out.println("Reina en proceso de reproduccion");
    }
    public void atacar() {
        System.out.println("Reina manda ataque");
    }
}
