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
public enum Horas {
    SIETE       ("07:00 - 08:00"), 
    OCHO        ("08:00 - 09:00"), 
    NUEVE       ("09:00 - 10:00"), 
    DIEZ        ("10:00 - 11:00"), 
    ONCE        ("11:00 - 12:00"), 
    DOCE        ("12:00 - 13:00"), 
    TRECE       ("13:00 - 14:00"), 
    CATORCE     ("14:00 - 15:00"), 
    QUINCE      ("15:00 - 16:00"), 
    DIECISEIS   ("16:00 - 17:00"), 
    DIECISIETE  ("17:00 - 18:00"), 
    DIECIOCHO   ("18:00 - 19:00"), 
    DIECINUEVE  ("19:00 - 20:00"), 
    VEINTE      ("20:00 - 21:00");
    
    private String hora;
    
    private Horas(String hora){
        this.hora = hora;
    }
    
    @Override
    public String toString(){
        return hora;
    }
}
