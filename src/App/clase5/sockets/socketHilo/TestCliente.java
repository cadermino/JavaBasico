/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase5.sockets.socketHilo;

/**
 *
 * @author alumno
 */
public class TestCliente {

    public static void main(String[] args) {
        Cliente c = new Cliente("localhost", 2365);
        c.doConectar();
    }
}
