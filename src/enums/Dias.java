/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Angel
 */
public enum Dias {
    LUNES("Lunes"), 
    MARTES("Martes"), 
    MIERCOLES("Miércoles"), 
    JUEVES("Jueves"), 
    VIERNES("Viernes");
    
    private String dia;
    
    private Dias(String dia){
        this.dia = dia;
    }
    
    @Override
    public String toString(){
        return dia;
    }
}
