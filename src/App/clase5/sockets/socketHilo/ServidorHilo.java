/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase5.sockets.socketHilo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author alumno
 */
public class ServidorHilo extends Thread {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            // Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));
            // COMUNICACION 1
            out.println("SERVIDOR:  bienvenido(a) a la calculadora java, que operacion desea realizar?");
            // COMUNICACION 2
            String operacion = in.readLine();
            Double ope1 = Double.parseDouble(in.readLine());
            Double ope2 = Double.parseDouble(in.readLine());
            if (operacion.equals("s")) {
                out.println("suma");
                out.println(ope1+ope2);
            }else if(operacion.equals("r")){
                out.println("resta");
                out.println(ope1-ope2);
            }else if(operacion.equals("m")){
                out.println("multiplicacion");
                out.println(ope1*ope2);
            }else if(operacion.equals("d")){
                out.println("division");
                if (ope2 == 0) {
                    out.println("no se puede dividir entre cero");
                }else{
                    
                    out.println(ope1/ope2);
                }
            }
            in.close();
            out.close();
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
