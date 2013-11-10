/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.interfaces.posicion;

/**
 *
 * @author alumno
 */
public class Teodolito {
    
    public static void main(String[] args) {
        Position carro = new Auto(20, 30);
        Position carlos = new Persona(400, 300);
        
        
        
        Teodolito.getDistancia(carro, carlos);
        
    }
   
    public static void getDistancia(Position p1, Position p2){
        double longitud = p2.getLongitud() - p1.getLongitud();
        double latitud = p2.getLongitud() - p1.getLongitud();
        
        System.out.println(Math.sqrt(latitud*latitud+longitud*longitud));
    }
    
}
