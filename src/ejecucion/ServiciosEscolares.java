/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

import enums.Dias;
import enums.Horas;
import horario.Horario;
import horario.Materia;

/**
 *
 * @author USUARIO
 */
public class ServiciosEscolares {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Horario h = new Horario();
        Materia poo = new Materia("Programación Orientada a Objetos", "2SF", "Angel Bravo");
        Materia pf = new Materia("Programación Funcional", "2SF", "Profesor 2");
        h.setDiaHora(Dias.LUNES, Horas.SIETE, "A6", poo);
        h.setDiaHora(Dias.LUNES, Horas.SIETE, "A3", pf);
        h.setDiaHora(Dias.LUNES, Horas.OCHO, "A3", pf);
        h.setDiaHora(Dias.MARTES, Horas.SIETE, "A6", poo);
        System.out.println(h);
    }
    
}
