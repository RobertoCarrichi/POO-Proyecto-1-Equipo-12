package proyectopooi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Asignatura {
    //Atributo de total de asignaturas registradas
    static int totalAsignaturas;
    
    //Atributos de los objetos de la clase
    String nombre;
    int creditos;
    int horas;
    
    //Lista de objetos de la clase
    ArrayList<Asignatura> materias = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    //Constructor Vacio
    public Asignatura(){
        
    }
    
    //Constructor que recibe argumentos
    public Asignatura(String nombre, int creditos, int horas){
        this.nombre = nombre;
        this.creditos = creditos;
        this.horas = horas;
        
        totalAsignaturas += 1;
    }
    
    //Metodo que registra datos de una asginatura
    void registrarAsignatura(){
        System.out.print("Cantidad de Asignaturas a registrar: ");
        int cant = sc.nextInt();
        
        for(int i = 0; i < cant; i++){
            System.out.print("Nombre de Asignatura: ");
            sc.nextLine();
            String xnombre = sc.nextLine();
            System.out.print("Creditos de la Asignatura: ");
            int xcreditos = sc.nextInt();
            System.out.print("Horas a la semana de la Asignatura: ");
            int xhoras = sc.nextInt();
            System.out.println();
            
            //Auxilar para agregar datos a la lista
            Asignatura aux = new Asignatura(xnombre, xcreditos, xhoras);
            
            //Agrega un objeto a la lista
            materias.add(aux);
        }
    }
    
    //Metodo que ayuda a imprimir los atributos asignados
    void info(){
        System.out.println("Nombre de la Asignatura: " + this.nombre);
        System.out.println("Creditos de la Asignatura: " + this.creditos);
        System.out.println("Horas a la semana de la Asignatura: " + this.horas);
    }
    
    //Metodo que imprime los datos que se han registrado
    void mostrarAsignaturas(){
        System.out.println("Datos de las asignaturas:\n");
        for(Asignatura var : materias){
            var.info();
            System.out.println();
        }
        
        System.out.println("Total de asignaturas registradas: " + totalAsignaturas + "\n");
    }
}
