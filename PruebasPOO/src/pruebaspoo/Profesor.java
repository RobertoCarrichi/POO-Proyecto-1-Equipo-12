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
public class Profesor {
    Scanner sc = new Scanner(System.in);
    ArrayList<Profesor> maestros = new ArrayList();
    String nombre;
    int edad;
    int cuenta;
    
    void agregarProfesor(){
        System.out.println("Cuantos Profesores deseas agregar");
        int agregar = sc.nextInt();
        for(int i = 0; i<agregar; i++){
            Profesor aux = new Profesor();
            System.out.println("Nombre");
            sc.nextLine();
            aux.nombre = sc.nextLine();
            System.out.println("Edad");
            aux.edad = sc.nextInt();
            System.out.println("Numero de cuenta");
            aux.cuenta = sc.nextInt();
            
            maestros.add(aux);
        }
    }
    
    void imprimirProfesor(){
        for(Profesor var : maestros){
            Profesor ayuda = (Profesor)var;
            System.out.println("Nombre");
            System.out.println(ayuda.nombre);
            System.out.println("Edad");
            System.out.println(ayuda.edad);
            System.out.println("Numero de cuenta");
            System.out.println(ayuda.cuenta);
        }
    }
}
