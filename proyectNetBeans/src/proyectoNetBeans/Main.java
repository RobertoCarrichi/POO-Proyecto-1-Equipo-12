public class Main{

    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumnitos = new Alumno();
        Asignatura materias = new Asignatura();
        Profesor maestros = new Profesor();
        
        alumnitos.agregarAlumno();
        alumnitos.info();        
        materias.agregarAsignatura();
        materias.printAsignaturas();
        
        maestros.agregarProfesor();
        maestros.imprimirProfesor();
        
    }
    
}