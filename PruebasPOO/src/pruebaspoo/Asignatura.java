/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaspoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Asignatura {
    Scanner sc = new Scanner(System.in);
    ArrayList<Asignatura> materias = new ArrayList();
    String nombre;
    int clave;
    int creditos;
    
    void agregarAsignatura(){
        System.out.println("Cuantas asignaturas deseas agregar");
        int agregar = sc.nextInt();
        for(int i = 0; i<agregar; i++){
            Asignatura aux = new Asignatura();
            System.out.println("Nombre");
            sc.nextLine();
            aux.nombre = sc.nextLine();
            System.out.println("Clave");
            aux.clave = sc.nextInt();
            System.out.println("Creditos");
            aux.creditos = sc.nextInt();
            
            materias.add(aux);
        }
    }
    
    void imprimirAsignaturas(){
        for(Asignatura var : materias){
            Asignatura ayuda = (Asignatura)var;
            System.out.println("Nombre");
            System.out.println(ayuda.nombre);
            System.out.println("Clave");
            System.out.println(ayuda.clave);
            System.out.println("Creditos");
            System.out.println(ayuda.creditos);
        }
    }
}
