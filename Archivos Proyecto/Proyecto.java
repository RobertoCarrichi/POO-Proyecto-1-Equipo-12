public class Proyecto {

    public static void main(String[] args) {
        //Declaracion de objetos
        Alumno alumnito = new Alumno();
        Asignatura asignaturas = new Asignatura();
        Profesor profesores = new Profesor();
        Grupo grupos = new Grupo();
        
        int opc;
        
        //Menu del programa
        do{
        opc = Menu.opcion();
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
                int o6 = Menu.MostrarElementos();
                
                switch(o6){
                    case 1:
                        System.out.println("Escogiste Ver Grupos\n");
                        grupos.mostrarGrupos();
                        grupos.inscritos();
                        break;
                    case 2:
                        System.out.println("Escogiste Ver Asignaturas\n");
                        asignaturas.mostrarAsignaturas();
                        break;
                    case 3:
                        System.out.println("Escogiste Ver Profesores\n");
                        profesores.imprimirProfesores();
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
        
        System.out.println("Vuelva Pronto :D");
    }
    
}