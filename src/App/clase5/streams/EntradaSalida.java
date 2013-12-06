/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase5.streams;

import java.io.File;

/**
 *
 * @author alumno
 */
public class EntradaSalida {

    public static void main(String[] args) {
        //EntradaSalida.veriyFile();
        //EntradaSalida.listarDirectorio();
        EntradaSalida.createDirectory();
    }
    
    public static void createDirectory() {
        
        File dir = new File("d:/javaTecsup");
        if (!dir.isDirectory() && !dir.exists()) {
            dir.mkdir();
        }
        
    }
    
    public static void veriyFile() {
        File f = new File("d:/temario.txt");
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta : " + f.getPath());
        System.out.println("Ruta Absoluta: " + f.getAbsolutePath());
        if (f.exists()) {
            System.out.println("Archivo sí existe!");
            System.out.println((f.canRead()) ? "Sí se puede leer" : "");
            System.out.println((f.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + f.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
        }
    }

    public static void listarDirectorio() {

        File dir = new File("c:\\");

        if (dir.isDirectory() && !dir.exists()) {
            String[] lista = dir.list();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
