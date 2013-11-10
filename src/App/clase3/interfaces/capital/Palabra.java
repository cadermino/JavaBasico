/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.interfaces.capital;

/**
 *
 * @author alumno
 */
public class Palabra implements Capitalizable {

    String texto;

    Palabra(String n) {
        texto = n.replaceAll(" ", "");
    }
//metodos de Interfase
    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
}
