/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecucion;

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
        h.setDiaHora("Lunes", "07:00-08:00", "A6", new Materia("Programación Orientada a Objetos", "2SF", "Angel Bravo"));
        h.setDiaHora("Lunes", "07:00-08:00", "A3", new Materia("Programación Funcional", "2SF", "Profesor 2"));
        System.out.println(h);
    }
    
}
