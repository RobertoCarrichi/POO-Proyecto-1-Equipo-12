import java.util.ArrayList;
import java.util.Scanner;

// 
// ¿AGREGAMOS UNA LISTA ESTÁTICA DE LAS ASIGNATURAS REGISTRADAS POR SI LAS PIDE EL USUARIO?
// 

public class Asignatura{
	static int totalAsignaturas=0;

	// Atributos de instancia
	private String nombre;
	private int clave;
	private int creditos;
	Profesor profesor = new Profesor();
	ArrayList<Grupo> grupos = new ArrayList<Grupo>(); // Grupos que imparten esta asignatura.
    ArrayList<Asignatura> materias = new ArrayList();

	// Instancias de apoyo
    Scanner sc = new Scanner(System.in);

	// CONSTUCTORES
		public Asignatura(){
		}
		// 
		// Podríamos hacer un constructor con solo el nombre y la clave
		// en el caso que el usuario no se sepa el nombre
		// pero se tendríamos que acceder a un arreglo que tenga TODOS los profesores hasta ese momento,
		// ya encontrando al profesor podemos asignarle un nombre.
		// 
		public Asignatura(String nombre,short clave){
			this.nombre=nombre;
			this.clave=clave;
			
			// De alguna forma debemos encontrar el nombre del profesor y para poder asignarle un profe al grupo y la asignatura.
			// setNombre(profesor);
			
			this.totalAsignaturas+=1;
		}		
		public Asignatura(String nombre,short clave,String profesor){
			this.nombre=nombre;
			this.clave=clave;
			this.profesor.setNombre(profesor);
			this.totalAsignaturas+=1;
		}

	// GETTERS Y SETTERS
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		public String getNombre(){
			return this.nombre;
		}
		public void setClave(short clave){
			this.clave=clave;
		}
		public int getClave(){
			return this.clave;
		}
		public int getTotal(){
			return this.totalAsignaturas;
		}

	// MÉTODOS
		// 
		// ¿Sería mejor que este método se encuentre en la clase Alumno?
		// Para que se añada directamente a la lista que tiene asignada cada alumno.
		// 
		public void agregarAsignatura(){
			System.out.println("Cuantas asignaturas deseas agregar?");
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
		public void info(){
			System.out.println("Nombre: "+this.nombre);
			System.out.println("Clave: "+this.clave);
			System.out.println("Creditos: "+this.creditos);
			System.out.printf("Profesor que imparte la clase: "+this.profesor.getNombre());
			System.out.println();
		}
		public void printAsignaturas(){
			System.out.println("##### ASIGNATURAS #####");
			// Puede ser más eficiente llamar al método que imprime la información de cada asignatura.
			for(Asignatura var : materias){
				var.info();
			    // Asignatura ayuda = (Asignatura)var;
			    // System.out.println("Nombre");
			    // System.out.println(ayuda.nombre);
			    // System.out.println("Clave");
			    // System.out.println(ayuda.clave);
			    // System.out.println("Creditos");
			    // System.out.println(ayuda.creditos);
			}
		}
}