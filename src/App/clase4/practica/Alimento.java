/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package App.clase4.practica;


/**
 *
 * @author alumno
 */
public class Alimento {
    private String nombre;
    private String tipo;
    private String unidad_medida;
    private int costo;
    private String valor_nutricional;
    private Nutrientes[] nutrientes;
    private String descripcion;

    public Alimento(String nombre, String tipo, String unidad_medida, int costo, String valor_nutricional, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.unidad_medida = unidad_medida;
        this.costo = costo;
        this.valor_nutricional = valor_nutricional;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getValor_nutricional() {
        return valor_nutricional;
    }

    public void setValor_nutricional(String valor_nutricional) {
        this.valor_nutricional = valor_nutricional;
    }

    public Nutrientes[] getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(Nutrientes[] nutrientes) {
        this.nutrientes = nutrientes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
