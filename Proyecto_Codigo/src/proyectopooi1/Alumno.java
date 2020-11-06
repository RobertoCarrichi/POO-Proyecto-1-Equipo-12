package proyectopooi1;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    //Variable de la clase que muestra el total de alumnos registrados
    static int totalAlumnos = 0;
    
    //Atributos de la clase
    String nombre;
    int cuenta;
    String semestre;
    
    //Uso de utilerias
    Scanner sc = new Scanner(System.in);
    //Lista de objetos
    ArrayList<Alumno> alumnitos = new ArrayList<>();
    
    //Constructor Vacio
    public Alumno(){
        
    }
    
    //Constructor con los datos como argumento
    public Alumno(String nombre, int cuenta, String semestre){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.semestre = semestre;
        
        //Aumenta 1 por cada objeto de la clase que se agregue
        totalAlumnos += 1;
    }
    
    //Metodo que registra la cantidad deseada de alumnos
    void registrarAlumno(){
        System.out.print("Cantidad de alumnos a registrar: ");
        int agregar = sc.nextInt();
        
        //Peticion de datos al usuario
        for(int i = 0; i < agregar; i++){
            
            System.out.print("Nombre: ");
            sc.nextLine();
            String xnombre = sc.nextLine();
            System.out.print("Semestre: ");
            String xsemestre = sc.nextLine();
            System.out.print("Num de Cuenta: ");
            int xcuenta = sc.nextInt();
            System.out.println();
            
            //Creacion de un objeto auxilar
            Alumno aux = new Alumno(xnombre, xcuenta, xsemestre);
            
            //Agrega el objeto auxilar a la lista de objetos
            alumnitos.add(aux);
        }
    }
    
    //Metodo que imprime los atributos del objeto
    void info(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cuenta: " + this.cuenta);
        System.out.println("Semestre: " + this.semestre);
    }
    
    //Metodo que imprime datos de los alumnos
    void imprimirAlumnos(){
        System.out.println("Datos de los alumnos:\n");
        for(Alumno var : alumnitos){
            var.info();
            System.out.println();
        }
        
        System.out.println("Total de alumnos registrados: " + totalAlumnos + "\n");
    }
}
