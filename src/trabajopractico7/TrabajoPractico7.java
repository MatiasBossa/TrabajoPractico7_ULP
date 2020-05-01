/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico7;

import clases.Alumno;
import clases.Materia;

/**
 *
 * @author matia
 */
public class TrabajoPractico7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia ingles = new Materia(1,"Ingles 1", 1);
        Materia matematicas = new Materia(2,"Matematicas", 1);
        Materia laboratorio = new Materia(3,"Laboratorio 1", 1);
        Alumno a = new Alumno(1001,"Lopez", "Martin");
        Alumno a2 = new Alumno(1002,"Martinez", "Brenda");
        
        a.agregarMateria(ingles);
        a.agregarMateria(matematicas);
        a.agregarMateria(laboratorio);
        
        System.out.println("");
        
        a2.agregarMateria(ingles);
        a2.agregarMateria(matematicas);
        a2.agregarMateria(laboratorio);
        a2.agregarMateria(laboratorio);
        
        System.out.println("");
        
        System.out.println(a.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
        
    }
    
}
