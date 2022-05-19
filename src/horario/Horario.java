/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Horario {
    private ArrayList <DiaHora> horas;

    public Horario() {
        this.horas = new ArrayList<>();
    }

    public String getDiaHora(String dia, String hora) {
        for(DiaHora dh : horas)
            if(dh.getDia().equals(dia) && dh.getHora().equals(hora))
                return horas.toString();
        return "";
    }

    public void setDiaHora(String dia, String hora, String aula, Materia materia) {
        if(getDiaHora(dia, hora).equals(""))
            horas.add(new DiaHora(dia, hora, aula, materia));
    }

    @Override
    public String toString() {
        String lista = "";
        for(DiaHora dh : horas)
            lista += dh + "\n";
        
        return lista;
    }
}
