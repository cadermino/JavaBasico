/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase4.practica;

/**
 *
 * @author alumno
 */
public class Aplicar implements Atender{
    private Animal animal;
    @Override
    public String pesar(Animal animal) {
        System.out.println(animal.getNombre()+" pesa: "+animal.getPeso());
        return null;
    }

    @Override
    public String alimentar(Animal animal) {
        System.out.println("alimentando a: "+animal.getNombre());
        return null;
    }


    
}
