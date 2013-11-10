/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.interfaces.capital;

/**
 *
 * @author alumno
 */
public class Oracion implements Capitalizable {

    String texto;

    Oracion(String n) {
        this.texto = n;
    }

    public String agregaPalabra(String t) {
        texto = texto.concat(" " + t);
        return texto;
    }

    @Override
    public String cambiaMayuscula() {
        return texto.toUpperCase();
    }

    @Override
    public String cambiaMinuscula() {
        return texto.toLowerCase();
    }
}
