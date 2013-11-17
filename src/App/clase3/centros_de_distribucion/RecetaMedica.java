/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App.clase3.centros_de_distribucion;

import java.util.Date;

/**
 *
 * @author CARLOS
 */
public class RecetaMedica {
    public Date fecha_emision = new Date();
    public Date fecha_vencimiento = new Date();
    public int cantidad;
    public String nombre;
  
    Medico m = new Medico();

    public RecetaMedica(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Medico getM() {
        return m;
    }

    public void setM(Medico m) {
        this.m = m;
    }
    
    
}
