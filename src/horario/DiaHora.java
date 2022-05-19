/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

/**
 *
 * @author USUARIO
 */
public class DiaHora {
    private String dia, hora, aula;
    private Materia materia;

    public DiaHora(String dia, String hora, String aula, Materia materia) {
        this.dia = dia;
        this.hora = hora;
        this.aula = aula;
        this.materia = materia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
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
                ", Materia: " + materia;
    }
    
    
}
