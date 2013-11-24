/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase5.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author alumno
 */
public class LecturaEscritura {
    
    public static void main(String[] args) {
        //LecturaEscritura.escribirArchivo();
        //LecturaEscritura.leerArchivo();
        EjemploStream archivo = new EjemploStream("d://javaTecsup/test.txt");
        archivo.actualizarDatos();
        
    }

    public static void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("d://javaTecsup/test.txt");
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("Es una lineaaa");
            bw.newLine();
            bw.write("Es otra lineaaa");
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leerArchivo() {
        FileReader fr = null;
        BufferedReader br = null;
        String sInput = null;
        try {
            fr = new FileReader("d://javaTecsup/test.txt");
            br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
