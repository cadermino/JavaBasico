/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase6.practica.abejas;

/**
 *
 * @author alumno
 */
public class Colmena {
    public static void main(String[] args) {
        Reina reina1 = new Reina("erubgr", 10);
        System.out.println("nombre cientifico de la reina es: "+reina1.getNombreCientifico());
        System.out.println("reina esta: " ); reina1.alimentarse();
        Obrera obrera1 = new Obrera("egiherg", 16);
    }
}
