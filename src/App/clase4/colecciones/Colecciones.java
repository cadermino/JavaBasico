/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase4.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author alumno
 */
public class Colecciones {

    public static void main(String args[]) {
        //Colecciones.ejemploEstudiantes();
        //Colecciones.ejemploLinkedList();
        //Colecciones.ejemploHashSet();
        Colecciones.ejemploHashMap();
    }

    public static void ejemploEstudiantes() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");
// ArrayList
        List<Estudiante> c = new ArrayList<Estudiante>();
        c.add(e1);
        c.add(e2);
        c.add(e3);
        Collections.sort(c);
        for (Estudiante e : c) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }
    }

    public static void ejemploLinkedList() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");
// LinkedList
        LinkedList<Estudiante> pila = new LinkedList<Estudiante>();
        pila.addFirst(e1);
        pila.addFirst(e2);
        pila.addFirst(e3);
        ListIterator<Estudiante> ite = pila.listIterator();
        while (ite.hasNext()) {
            Estudiante e = (Estudiante) pila.poll();
            System.out.println(e.getNombres());
        }
        System.out.println(pila.size());
    }

    public static void ejemploHashSet() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");
// HashSet
        HashSet<Estudiante> set = new HashSet<Estudiante>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e1);
        for (Estudiante e : set) {
            System.out.println(e.getNombres() + " " + e.getApellidos());
        }
    }

    public static void ejemploHashMap() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata");
        Estudiante e2 = new Estudiante("Benjamin", "Ayasta");
        Estudiante e3 = new Estudiante("Carlos", "Lopez");
// HashMap
        HashMap<Integer, Estudiante> mapa = new HashMap<Integer, Estudiante>();
        mapa.put(100525, e1);
        mapa.put(100526, e2);
        mapa.put(100527, e3);
        Estudiante e = mapa.get(100526);
        System.out.println(e.getNombres());
        Collection<Estudiante> co = mapa.values();
        for (Estudiante es : co) {
            System.out.println(es.getNombres());
        }
    }
}
