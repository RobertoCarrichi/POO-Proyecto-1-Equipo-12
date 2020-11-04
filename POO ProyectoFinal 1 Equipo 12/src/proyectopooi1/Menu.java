package proyectopooi1;

import java.util.Scanner;

public class Menu {
    
    //Metodo para mostrar las opciones del menu
    static public int opcion(){
        Scanner sc = new Scanner(System.in);
        int opcionmenu = 0;
        System.out.println("Elige con el numero:");
        System.out.println("1) Registrar Alumno");
        System.out.println("2) Registrar Asignatura");
        System.out.println("3) Registrar Profesor");
        System.out.println("4) Abrir Grupo");
        System.out.println("5) Inscribir Alumno");
        System.out.println("6) Mostrar Elementos");
        System.out.println("7) Salir");
        
        opcionmenu = sc.nextInt();
        
        return opcionmenu;
    }
    
    //Metodo para mostrar las opciones cuando se escoge la opcion 6 del primer menu
    static public int MostrarElementos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quieres ver?");
        System.out.println("\t1) Grupos");
        System.out.println("\t2) Asignaturas");
        System.out.println("\t3) Profesores");
        System.out.println("\t4) Alumnos");
        
        int eleccion = sc.nextInt();
        
        return eleccion;
    }
}
