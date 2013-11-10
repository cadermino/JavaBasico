/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.objeto;

/**
 *
 * @author alumno
 */
public class TestObjeto {

    public static void main(String[] arg) {
        Socio s1 = new Socio(302, "David", "Tecsup");
        Socio s2 = new Socio(302, "David", "Tecsup");
        if (s1 == s2) {
            System.out.println("Comprobando referencia");
        }else{
            System.out.println("no es igual");
        }
        if (s1.equals(s2)) {
            System.out.println("Comprobando el valor");
        }
    }
}