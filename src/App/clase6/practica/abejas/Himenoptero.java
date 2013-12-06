/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public abstract class Himenoptero {
    private String nombreCientifico;
    private int ciclo;
    
    public abstract void alimentarse();

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
