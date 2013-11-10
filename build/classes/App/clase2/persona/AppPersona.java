/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase2.persona;

/**
 *
 * @author alumno
 */
public class AppPersona {

    public static void main(String[] args) {

        Persona carlos = new Persona("carlos", "calderon", 28);

        /*System.out.println("atributos del obejeto");
         System.out.println("Nombre: "+carlos.getNombres());
         System.out.println("Apellido: "+carlos.getApellidos());
         System.out.println("Edad: "+carlos.getEdad()+" años");*/

        Persona lucho = new Persona();
        lucho.setNombresApellidos("lucho", "dfrh", 20);
        System.out.println("nombre comp: " + lucho.getNombres() + " " + lucho.getApellidos());
        System.out.println("edad: " + lucho.getNombres() + " " + lucho.getApellidos());
    }
}
