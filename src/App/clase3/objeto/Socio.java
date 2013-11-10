/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase3.objeto;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Socio {

    private int codigo;
    private String nombre;
    private String direccion;
// Generar SET y GET

    public Socio(int c, String n, String d) {
        this.codigo = c;
        this.nombre = n;
        this.direccion = d;
    }

    @Override
    public String toString() {
        String cadena = "Codigo : " + this.codigo;
        cadena += "nombre: " + this.nombre;
        cadena += "direccion: " + this.direccion;
        return cadena;
    }

    @Override
    public boolean equals(Object o) {
        Socio s = (Socio) o;
        if (this.codigo == s.codigo
                && this.nombre.equals(s.nombre)
                && this.direccion.equals(s.direccion)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.codigo;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        hash = 73 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}