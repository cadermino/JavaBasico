/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase2.estatico;

/**
 *
 * @author alumno
 */
public class AppEstatico {

    public static void main(String[] args) {

        AppEstatico.atributoEstatico();
        AppEstatico.metodoEstatico();
    }

    public static void atributoEstatico() {
        System.out.println(Estatico.contador);

        Estatico estaUno = new Estatico();
        Estatico estaDos = new Estatico();
        Estatico estaTres = new Estatico();

        System.out.println(Estatico.contador);


    }

    public static void metodoEstatico() {

        System.out.println(Estatico.dolaraEuro(10d));
    }
}
