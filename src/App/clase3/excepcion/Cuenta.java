/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.excepcion;

/**
 *
 * @author alumno
 */
public class Cuenta {
    
    String nombre;
    double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public double retirarCajero(double montoRetiro) throws SaldoInsuficienteException{
        if (montoRetiro > saldo) {
            
            throw new SaldoInsuficienteException(saldo, montoRetiro);
            
        }
        this.saldo = saldo - montoRetiro;
        return saldo;
    }
}
