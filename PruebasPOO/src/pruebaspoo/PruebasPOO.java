/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaspoo;

/**
 *
 * @author Lenovo
 */
public class PruebasPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumnitos = new Alumno();
        Asignatura materias = new Asignatura();
        Profesor maestros = new Profesor();
        
        alumnitos.agregarAlumno();
        alumnitos.imprimirAlumnos();
        
        materias.agregarAsignatura();
        materias.imprimirAsignaturas();
        
        maestros.agregarProfesor();
        maestros.imprimirProfesor();
        
    }
    
}
