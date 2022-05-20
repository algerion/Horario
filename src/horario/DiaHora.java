/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import enums.Dias;
import enums.Horas;

/**
 *
 * @author USUARIO
 */
public class DiaHora {
    private Dias dia;
    private Horas hora;
    private String aula;
    private Materia materia;

    public DiaHora(Dias dia, Horas hora, String aula, Materia materia) {
        this.dia = dia;
        this.hora = hora;
        this.aula = aula;
        this.materia = materia;
    }

    public Dias getDia() {
        return dia;
    }

    public void setDia(Dias dia) {
        this.dia = dia;
    }

    public Horas getHora() {
        return hora;
    }

    public void setHora(Horas hora) {
        this.hora = hora;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Día: " + dia + ", Hora: " + hora + ", Aula: " + aula + 
                ", " + materia;
    }
    
    
}
