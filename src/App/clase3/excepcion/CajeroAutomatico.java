/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.excepcion;

/**
 *
 * @author alumno
 */
public class CajeroAutomatico {
    
    public static void main(String[] args){
        
        try {
              Cuenta carlos = new Cuenta("carlos", 5000);
        
        System.out.println(carlos.retirarCajero(3000));
        System.out.println(carlos.retirarCajero(4000));
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
      
    }
}
                     