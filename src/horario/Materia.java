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
public class Materia {
    private String nombre, grupo, profesor;

    public Materia(String nombre, String grupo, String profesor) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    
    @Override
    public String toString() {
        return "Materia: " + nombre + ", Grupo: " + grupo + ", Profesor: " + 
                profesor;
    }
}
