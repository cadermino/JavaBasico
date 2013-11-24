/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase5.sockets.socketInfinito;

import App.clase5.sockets.socketBasico.*;

/**
 *
 * @author alumno
 */
public class TestCliente {

    public static void main(String[] args) {
        Cliente c = new Cliente("192.168.14.11", 2365);
        c.doConectar();
    }
}
