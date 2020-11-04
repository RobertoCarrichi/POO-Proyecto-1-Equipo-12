package proyectopooi1;

public class ProyectoPOOI1 {

    public static void main(String[] args) {
        // Presentación
        System.out.println("#################################################################################");
        System.out.println("#               BIENVENIDO AL SIMULADOR DE SISTEMA DE INSCRIPCIONES             #");
        System.out.println("#################################################################################");
        
        
        //Declaracion de objetos
        Alumno alumnito = new Alumno();
        Asignatura asignaturas = new Asignatura();
        Profesor profesores = new Profesor();
        Grupo grupos = new Grupo();
        
        int opc;
        
        // Inicio del programa
        // Termina hasta que el usuario elija la opción SALIR.
        do{
            opc = Menu.opcion(); // Imprime el menú inicial y retorna su elección.
            
            // Se decide como actuar deacuerdo a su elección.
            switch(opc){
                case 1:
                    System.out.println("Escogiste Registrar Alumno\n");
                    alumnito.registrarAlumno();
                    break;
                case 2:
                    System.out.println("Escogiste Registrar Asignatura\n");
                    asignaturas.registrarAsignatura();
                    break;
                case 3:
                    System.out.println("Escogiste Registrar Profesor\n");
                    profesores.registrarProfesor();
                    break;
                case 4:
                    System.out.println("Escogiste Abrir Grupo\n");
                    grupos.abrirGrupo(profesores.maestros, asignaturas.materias);
                    break;
                case 5:
                    System.out.println("Escogiste Inscribir Alumno\n");
                    grupos.inscribirAlumnos(alumnito.alumnitos);
                    break;
                case 6:
                    System.out.println("Escogiste Mostrar Elementos\n");

                    // Se imprimirá un sub-menu con opciones a mostrar y se recuperará la opcion elegida
                    int o6 = Menu.MostrarElementos(); 

                    // Se verificará que opción eligió.
                    switch(o6){
                        case 1:
                            System.out.println("Has elegido ver los grupos abiertos.\n");
                            grupos.mostrarGrupos();
                            grupos.inscritos();
                            break;
                        case 2:
                            System.out.println("Has elegido ver las asignaturas registradas.\n");
                            asignaturas.mostrarAsignaturas();
                            break;
                        case 3:
                            System.out.println("Has elegido ver a los profesores registrados.\n");
                            profesores.mostrarProfesores();
                            break;
                        case 4:
                            System.out.println("Escogiste Ver Alumnos\n");
                            alumnito.imprimirAlumnos();
                            break;
                        default: System.out.println("Valor incorrecto\nIngresa valor de nuevo\n");
                    }
                    break; 
                case 7:
                    break;
                default: System.out.println("Valor incorrecto\nIngresa valor de nuevo\n");
            }
        }while(opc != 7);
        
        System.out.println("Ha elegido salir.");
        System.out.println();
	System.out.println("\t ___________________________________________________");
        System.out.println("\t| Gracias por utilizar el sistema de inscripciones. |");
	System.out.println("\t|                                                   |");
	System.out.println("\t| Colaboradores del proyecto:                       |");
	System.out.println("\t|    -> Carrichi de la Cruz, Roberto Carlos         |");
	System.out.println("\t|    -> Miranda Bueno, Fátima Yolanda               |");
	System.out.println("\t|    -> Páez López, Didier Marcelo                  |");
	System.out.println("\t|                                                   |");
	System.out.println("\t| Estudiantes de la Facultad de Ingeniería, UNAM.   |");
	System.out.println("\t|___________________________________________________|");
	System.out.println();
    }
    
}
