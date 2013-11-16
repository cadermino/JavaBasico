/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase4.practica;

/**
 *
 * @author alumno
 */
public class Nutrientes {
    public String nombre;
    public String unidad_medida;
    public String estado;

    public Nutrientes(String nombre, String unidad_medida, String estado) {
        this.nombre = nombre;
        this.unidad_medida = unidad_medida;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
