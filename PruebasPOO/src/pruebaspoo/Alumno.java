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
import java.util.ArrayList;
import java.util.Scanner;
public class Alumno {
    Scanner sc = new Scanner(System.in);
    ArrayList<Alumno> alumnitos = new ArrayList();
    String nombre;
    int edad;
    int cuenta;
    void agregarAlumno(){
        System.out.println("Cuantos alumnos deseas agregar");
        int agregar = sc.nextInt();
        for(int i = 0; i<agregar; i++){
            Alumno aux = new Alumno();
            System.out.println("Nombre");
            sc.nextLine();
            aux.nombre = sc.nextLine();
            System.out.println("Edad");
            aux.edad = sc.nextInt();
            System.out.println("Numero de cuenta");
            aux.cuenta = sc.nextInt();
            
            alumnitos.add(aux);
        }
    }
    
    void imprimirAlumnos(){
        for(Alumno var : alumnitos){
            Alumno ayuda = (Alumno)var;
            System.out.println("Nombre");
            System.out.println(ayuda.nombre);
            System.out.println("Edad");
            System.out.println(ayuda.edad);
            System.out.println("Numero de cuenta");
            System.out.println(ayuda.cuenta);
        }
    }
    
    void ordenar(){
        
    }
}
