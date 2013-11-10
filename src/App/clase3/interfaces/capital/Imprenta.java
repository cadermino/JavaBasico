/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.interfaces.capital;

/**
 *
 * @author alumno
 */
public class Imprenta {
    public static void main(String[] args) {
        Capitalizable[] obj1 = new Capitalizable[3];
        
        obj1[0] = new Palabra("h o l a  drg ergreg ergerg  ergerg  erger  ");
        obj1[1] = new Oracion("El murcielago rojo");
        obj1[2] = new Palabra("java");
        
        for (int i = 0; i < obj1.length; i++) {
            System.out.println(obj1[i].cambiaMayuscula());
            
        }
        
    }
}
