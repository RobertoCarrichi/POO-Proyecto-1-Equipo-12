import java.util.ArrayList;
import java.util.Scanner;
public class Alumno{
	static int totalAlumnos=0;

	// Atributos de instancia
	private String nombre;
	private String apellidos;
	private int edad;
	private int cuenta;
	private String semestre;
    ArrayList<Alumno> alumnitos = new ArrayList<Alumno>();
	ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
	ArrayList<Grupo> grupos = new ArrayList<Grupo>();
	ArrayList<Profesor> profesores = new ArrayList<Profesor>();

	// Instancias de apoyo
	Scanner sc = new Scanner(System.in);

	// CONSTRUCTORES
		public Alumno(){
		}
		public Alumno(int cuenta,int clave){
			this.cuenta=cuenta;
			this.totalAlumnos+=1;
			// Falta registrarse totalmente ):
		}
		public Alumno(String nombre,String apellidos,short edad,int cuenta,String semestre){
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.edad=edad;
			this.cuenta=cuenta;
			this.semestre=semestre;
			this.totalAlumnos+=1;
		}
	// GETTERS Y SETTERS
		public void set_nombre(String name){
			this.nombre=name;
		}
		public String get_nombre(){
			return this.nombre;
		}
		public void set_edad(short edad){
			this.edad=edad;
		}
		public int get_edad(){
			return this.edad;
		}
	//MÉTODOS

		// INSCRIBIR ALUMNO CON SOLO NÚMERO DE CUENTA Y CLAVE DE GRUPO


		public void agregarAlumno(){
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
		        
		        // alumnitos.add(aux);
		    }
		}
		public void añadir_asignatura(short clase,String nombre,short clave,String profesor){
			
		}
		public void imprimirAsignaturas(){
			for(Asignatura asignatura : asignaturas){
			    asignatura.info();
			}			
		}
			// Método que imprime la información personal de UN estudiante
		public void info(){
			System.out.println("Nombre completo: "+this.nombre+" "+this.apellidos);		
			System.out.println("Edad: "+this.edad);		
			System.out.println("Numero de cuenta: "+this.cuenta);		
			System.out.println("Semestre: "+this.semestre);		
		}
		public void imprimirAlumnos(){
			// Es más eficiente llamar al método que imprima la información del alumno.
		    for(Alumno var : alumnitos){
		        var.info();
		        // Alumno ayuda = (Alumno)var;
		        // System.out.println("Nombre");
		        // System.out.println(ayuda.nombre);
		        // System.out.println("Edad");
		        // System.out.println(ayuda.edad);
		        // System.out.println("Numero de cuenta");
		        // System.out.println(ayuda.cuenta);
		    }
		}
		public void ordenar(){

		}
		// public void print_profes(){
		// 	for(Asignatura clase : clases){
		// 		clase.print_profe();
		// 	}	
		// }
		// public void presentarse(){
		// 	System.out.println("Mi nombre completo es "+this.nombre+" "+this.apellidos+", tengo "+this.edad+" años"+", mi numero de cuenta es: "+this.cuenta+" y curso el "+(this.semestre.toLowerCase())+".");
		// }
}