/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase5.sockets.socketHilo;

import App.clase5.sockets.socketBasico.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author alumno
 */
public class Cliente {

    private String host;
    private int port;

    public Cliente(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);
            // Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            // COMUNICACION 1
            String msg = in.readLine();
            System.out.println(msg);
            out.println("s");
            out.println(157);
            out.println(10);
            // COMUNICACION 2 lee y muestra que operacion es
            msg = in.readLine();
            System.out.println(msg);
            // COMUNICACION 3 lee el resultado
            msg = in.readLine();
            System.out.println(msg);
            msg = in.readLine();
            System.out.println(msg);
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}
