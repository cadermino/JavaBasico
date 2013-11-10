/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.universo;

import App.clase3.universo.abstractas.Humano;

/**
 *
 * @author alumno
 */
public class Terricola extends Humano{

    @Override
    public void comer() {
        System.out.println("comiendo");
    }

    @Override
    public void comunicarse() {
        System.out.println("comunicandose");
    }

    @Override
    public void sentir() {
        System.out.println("sitiendo");
    }


}
