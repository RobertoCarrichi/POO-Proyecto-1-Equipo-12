import java.util.ArrayList;
import java.util.Scanner;
// 
// ¿AGREGAMOS UNA LISTA ESTÁTICA DE TODOS LOS PROFESORES REGISTRADOS POR SI LAS PIDE EL USUARIO?
// 
public class Profesor{
	static int totalProfesores=0;

	// Atributos de instancia
	private String nombre;
	private int edad;
	private int cuenta;
	private String lugarEgreso;

	ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>(); // Asignturas que imparte el profesor
	ArrayList<Grupo> grupos = new ArrayList<Grupo>(); // Grupos que imparte el profesor.

    ArrayList<Profesor> maestros = new ArrayList();

    // Instancias de apoyo
    Scanner sc = new Scanner(System.in);

	// CONSTUCTORES
		public Profesor(){
			this.totalProfesores+=1;
		}
		public Profesor(String nombre){
			this.nombre=nombre;
			this.totalProfesores+=1;
		}
		public Profesor(String nombre,int cuenta){
			this.nombre=nombre;
			this.cuenta=cuenta;
			this.totalProfesores+=1;
		}
		public Profesor(String nombre,int cuenta,String egreso){
			this.nombre=nombre;
			this.cuenta=cuenta;
			this.lugarEgreso=egreso;
			this.totalProfesores+=1;
		}

	// GETTERS Y SETTERS
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		public String getNombre(){
			return this.nombre;
		}
		public void setEdad(int edad){
			this.edad=edad;
		}
		public String getEdad(){
			return this.nombre;
		}
		public void setEgreso(String lugarEgreso){
			this.lugarEgreso=lugarEgreso;
		}
		public String getEgreso(){
			return this.lugarEgreso;
		}
		public int getTotal(){
			return this.totalProfesores;
		}
			// 
			// ¿Cómo saber a que asignatura se refiere si están en un arreglo?
			//  
		public String get_asignatura(){
			// return this.asignatura.getNombre();
			return "Aun no reparamos esto :c";
		}
	// MÉTODOS
			// En dado caso que más de un alumno escoja al mismo profesor pero en diferente grupo.
		public void addGrupo(){

		}
			// En el caso que sea el mismo profesor pero imparte una asignatura diferente.
		public void addAsignatura(String nombre,short clave){
			Asignatura asignatura = new Asignatura(nombre,clave,this.nombre);
			this.asignaturas.add(asignatura);
		}
		public void print(){
			System.out.println("Nombre del profesor/a: "+this.nombre);
			if(this.lugarEgreso!=null){
				System.out.println("Lugar de egreso del profesor: "+this.lugarEgreso);
			}
			// 
			// ¿Cómo podríamos imprimir la asignatura correcta si está en un arreglo?
			// 
			// System.out.println("Asignatura que imparte: "+this.asignatura.get_nombre());
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
		        System.out.println("Lugar de egreso: ");
		        aux.lugarEgreso = sc.nextLine();
		        maestros.add(aux);
		    }
		}
}