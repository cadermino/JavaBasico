/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.excepcion;

/**
 *
 * @author alumno
 */
public class Excepcion {

    public static void main(String[] args) {
        Excepcion.testExcepcion3();
    }

    public static void testExcepcion() {


        try {
            int dividendo = 10;
            int divisor = 0;
            int resultado = dividendo / divisor;
        } catch (Exception e) {
            System.out.println("hubo un error " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void testExcepcion2() {

        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 10);
        int[] z = new int[5];
        try {
            System.out.println("y/x gives " + (y / x));
            System.out.println("y is " + y + " z[y] is " + z[y]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Subscript problem " + e);
        } finally {
            System.out.println("Terminando la ejecución del método");
        }
        System.out.println("Continúa la ejecución del método....");
    }

    public static void testExcepcion3() {

        try {
            int[] numeros = null;

            for (int i = 0; i < 11; i++) {
                int j = numeros[i];
            }
        } catch (NullPointerException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
