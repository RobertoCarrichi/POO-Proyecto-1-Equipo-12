package proyectopooi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesor {
    //Atributo del total de profesores registrados
    static int totalProfesores = 0;
    
    //Atributos de la clase
    String nombre;
    String titulo;
    int anios;
    
    //Lista de objetos de la clase
    ArrayList<Profesor> maestros = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    //Constructor vacio
    public Profesor(){
        
    }
    
    //Constructor con argumentos
    public Profesor(String nombre, String titulo, int anios){
        this.nombre = nombre;
        this.titulo = titulo;
        this.anios = anios;
        
        //Agrega 1 al total de profesores registrados
        totalProfesores += 1;
    }
    
    //Metodo para registrar profesores
    void registrarProfesor(){
        System.out.print("Cantidad de profesores a registrar: ");
        int cant = sc.nextInt();
        
        for(int i = 0; i < cant; i++){
            System.out.print("Nombre del profesor: ");
            sc.nextLine();
            String xnombre = sc.nextLine();
            System.out.print("Titulo del profesor: ");
            String xtitulo = sc.nextLine();
            System.out.print("Tiempo que lleva impartiendo clases (en años): ");
            int xanios = sc.nextInt();
            System.out.println();
            
            //Objeto auxilar para asignar atributos
            Profesor aux = new Profesor(xnombre, xtitulo, xanios);
            
            //Agrega el objeto a la lista
            maestros.add(aux);
        }
    }
    
    //Metodo auxilar para imprimir datos de profesores
    void info(){
        System.out.println("Nombre del profesor: " + this.nombre);
        System.out.println("Titulo del profesor: " + this.titulo);
        System.out.println("Tiempo impartiendo clases del profesor: " + this.anios);
    }
    
    //Metodo que imprime los datos de los profesores registrados
    void imprimirProfesores(){
        System.out.println("Datos de los profesores\n");
        for(Profesor var: maestros){
            var.info();
            System.out.println();
        }
        
        System.out.println("Cantidad de profesores registrados: " + totalProfesores + "\n");
    }
}
