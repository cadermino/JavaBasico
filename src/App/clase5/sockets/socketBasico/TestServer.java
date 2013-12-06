/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase5.sockets.socketBasico;

/**
 *
 * @author alumno
 */
public class TestServer {

    public static void main(String[] args) {
        Servidor s = new Servidor(2365);
        s.ejecutar();
    }
}
