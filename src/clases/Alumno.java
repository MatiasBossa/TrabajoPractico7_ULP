/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.TreeSet;

/**
 *
 * @author matia
 */
public class Alumno{
    
    private int lejajo;
    private String apellido;
    private String nombre;
    private TreeSet<Materia> materias = new TreeSet<>();
 

    public Alumno(int lejajo, String apellido, String nombre) {
        this.lejajo = lejajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        if(materias.add(m)){
            System.out.println("La materia se agrego con exito!");
        }else{
            System.out.println("UPPS! Hubo un error al agregar la materia");
        }
    } 
    
    public int cantidadMaterias(){
        return materias.size();
    }

    public int getLejajo() {
        return lejajo;
    }

    public void setLejajo(int lejajo) {
        this.lejajo = lejajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(TreeSet<Materia> materias) {
        this.materias = materias;
    }
      
}
