/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package App.clase3.centros_de_distribucion;

import App.clase2.empresarial.Persona;
import java.util.Date;

/**
 *
 * @author CARLOS
 */
public class Medico extends Persona{

    long numero_licencia;
    Date año_graduado = new Date();

    public void recetar(Receta_medica()){
        System.out.println("recetando..." + Receta_medica());
    }
}
