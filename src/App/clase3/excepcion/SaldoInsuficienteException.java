/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.excepcion;

/**
 *
 * @author alumno
 */
public class SaldoInsuficienteException extends Exception{

    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("en su saldo tiene: "+saldo+" soles."
                +"no puede prestarse "+cuantoDesea+" soles.");
    }
    
    
    
}
