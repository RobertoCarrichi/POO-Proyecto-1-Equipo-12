import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Grupo {
    //Total de grupos registrados
    static int totalGrupos = 0;
    
    int clave;
    Scanner sc = new Scanner(System.in);
    
    //Listas de las clases utilizadas
    ArrayList<Grupo> grupitos = new ArrayList<>();
    //Tabla con grupo como clave y lista de alumnos como valor
    Hashtable<Integer, ArrayList<Alumno>> lista = new Hashtable<>();
    ArrayList<Asignatura> asignaturas = new ArrayList<>();
    ArrayList<Profesor> profes = new ArrayList<>();
    
    //Constructor Vacio
    public Grupo(){
        
    }
    
    //Constructor con argumentos
    public Grupo(int clave){
        this.clave = clave;
        
        totalGrupos += 1;
    }
    
    //Metodo para abrir un nuevo grupo
    void abrirGrupo(ArrayList<Profesor> profesores, ArrayList<Asignatura> materias){
        
        //Impresion de nombre de los profesores
        System.out.println("Lista de Profesores");
        listaProfesores(profesores);
        
        //impresion de nombres de asignaturas
        System.out.println("Lista de Asignaturas");
        listaAsignaturas(materias);
        
        //Seleccion de Asignatura
        Asignatura seleccionA;
        do{
        System.out.print("Que Asignatura deseas para el grupo?: ");
        String buscar = sc.nextLine();
        seleccionA = asignarA(materias,buscar);
        if(seleccionA.nombre != null)
        System.out.println("Asignatura escogida: " + seleccionA.nombre + "\n");
        else {
            System.out.println("Asignatura invalida, intenta de nuevo");
        }
        }while(seleccionA.nombre == null);//Hace que el nombre seleccionado esté en las opciones
        
        //Seleccion de Profesor
        Profesor seleccionP;
        do{
        System.out.print("Que Profesor deseas para el grupo?: ");
        String buscar = sc.nextLine();
        seleccionP = asignarP(profesores,buscar);
        if(seleccionP.nombre != null)
        System.out.println("Profesor seleccionado: " + seleccionP.nombre + "\n");
        else {
            System.out.println("Profesor invalido, intenta de nuevo");
        }
        }while(seleccionP.nombre == null);//Hace que el profesor seleccionado esté en las opciones
        
        //Asginacion de clave para el grupo
        System.out.print("Clave del grupo: ");
        int xclave = sc.nextInt();
        System.out.println();
        
        //Variable auxiliar
        boolean existe = false;
        
        //Verifica que la clave del grupo no exista ya
        for(int i = 0; i < grupitos.size(); i++){
            Grupo aux = grupitos.get(i);
            if(aux.clave == xclave){
                existe = true;
            }
        }
        
        //Verifica el resultado de la existencia o no
        if(existe == false){
            //Si no existe la clave el grupo, lo crea
            Grupo aux = new Grupo(xclave);
            asignaturas.add(seleccionA);
            profes.add(seleccionP);
            grupitos.add(aux);
            System.out.println();
        }else{
            //En caso que exista la clave del grupo manda el mensaje
            System.out.println("Un grupo con esa clave ya existe");
            System.out.println();
        }
    }
    
    //Impresion de los nombres de todos los profesores
    void listaProfesores(ArrayList<Profesor> profesores){
        for(Profesor var : profesores){
            Profesor ayuda = (Profesor)var;
            System.out.println("Nombre del Profesor: " + ayuda.nombre);
        }
        System.out.println();
    }
    
    //Impresion de nombres de todas las asignaturas
    void listaAsignaturas(ArrayList<Asignatura> materias){
        for(Asignatura var : materias){
            Asignatura ayuda = (Asignatura)var;
            System.out.println("Nombre de la asignatura: " + ayuda.nombre);
        }
        System.out.println();
    }
    
    //Busca la asignatura que el usuario desea
    Asignatura asignarA(ArrayList<Asignatura> materias, String buscar){
        Asignatura aux = new Asignatura();
        for(Asignatura var : materias){
            Asignatura ayuda = (Asignatura)var;
            if(ayuda.nombre.equalsIgnoreCase(buscar)){
                aux = ayuda;
                //En caso de que la asignatura esté regresa el objeto con esos atributos
                return aux;
            }
        }
        //Regresa un objeto con atributos inicializados por defecto
        return aux;
    }
    
    //Busca el profesor que se desea seleccionar
    Profesor asignarP(ArrayList<Profesor> profes, String buscar){
        Profesor aux = new Profesor();
            for(Profesor var : profes){
            Profesor ayuda = (Profesor)var;
            if(ayuda.nombre.equalsIgnoreCase(buscar)){
                //Compara el nombre con todos los nombres de la lista de profesores 
                //en caso de estar regresa los atributos del objeto que contenga el nombre
                aux = ayuda;
                return aux;
            }
            }
            return aux;
    }
    
    //Muestra los datos de los grupos registrados
    void mostrarGrupos(){
        
        //Muestra los nombres de asignatura y de profesor además de la clave del grupo que le pertenece a cada uno
        for(int i = 0; i < grupitos.size(); i++){
            Asignatura asigaux = asignaturas.get(i);
            Profesor profaux = profes.get(i);
            Grupo grupaux = grupitos.get(i);
            
            System.out.println("Nombre de la asignatura: " + asigaux.nombre + "\nNombre del profesor: " + profaux.nombre + "\nClave: " + grupaux.clave);
            
        }
        System.out.println();
    }
    
    //Metodo para inscribir UN solo alumno al grupo que se seleccione
    void inscribirAlumnos(ArrayList<Alumno> alumnitos){
        
        //Muestralos Grupos creados
        System.out.println("Lista de grupos: ");
        imprimirClaves();
        
        //Muestra todos los alumnos registrados
        System.out.println("Lista de Alumnos");
        alumnosRegistrados(alumnitos);
        
        //Hace que forzosamente el grupo este en las opciones
        int resultado=-1;
        do{
        System.out.print("Que grupo quieres seleccionar?: ");
        int opcion = sc.nextInt();
        resultado = selecGrup(opcion);
        if(resultado == -1)
            System.out.println("Grupo incorrecto, prueba otra vez");
        }while(resultado == -1);
        
        //Obtiene los atributos del alumno seleccionado mediante su numero de cuenta
        Alumno seleccionA;
        do{
        System.out.print("Que Alumno deseas inscribir al grupo? Escribe su numero de cuenta: ");
        int buscar = sc.nextInt();
        seleccionA = selecAlu(alumnitos,buscar);
        if(seleccionA.nombre != null)
        System.out.println("Alumno seleccionado: " + seleccionA.nombre + "\n");
        else {
            System.out.println("Alumno invalido, intenta de nuevo");
        }
        }while(seleccionA.nombre == null);
        
        //Agrega el objeto a la lista de alumnos
        ArrayList<Alumno> listaalumnos = new ArrayList<>();
        listaalumnos.add(seleccionA);
        //Lista auxiliar para comparar atributos
        ArrayList<Alumno> auxlist;
        
        //Verifica si la tabla ya contiene la clave del grupo
        if(lista.containsKey(resultado)){
        auxlist = lista.get(resultado);
        if(auxlist.contains(seleccionA)){
            //En caso de que este la clave del grupo, verifica que el alumno no esté inscrito
            //En caso de estarlo imprime en mensaje
            System.out.println("Alumno ya inscrito en el grupo");
        } else{
            //En caso de no estar el alumno, remueve lo agrega a la lista
            //Remueve la clave y su valor anterior, y luego lo agrega con su clave, y la lista actualizada
            auxlist.add(seleccionA);
            lista.remove(resultado);
            lista.put(resultado, auxlist);
        }
        //En caso de que la clave no exista lo agrega directamente
        }else{
            lista.put(resultado,listaalumnos);
        }
        System.out.println();
    }
    
    //Imprime las claves de los grupos que se han registrado
    void imprimirClaves(){
        for(Grupo var : grupitos){
            Grupo ayuda = (Grupo)var;
            System.out.println("Clave Del Grupo: " + ayuda.clave);
        }
        System.out.println();
    }
    
    //Imprime nombre y numero de cuenta de los alumnos registrados
    void alumnosRegistrados(ArrayList<Alumno> alumnitos){
        for(Alumno var : alumnitos){
            Alumno ayuda = (Alumno)var;
            System.out.println("Nombre del Alumno: " + ayuda.nombre);
            System.out.println("Numero de cuenta: " + ayuda.cuenta);
        }
        System.out.println();
    }
    
    //Se escoge el grupo que el usuario haya escogido
    int selecGrup(int selec){
        for(Grupo var : grupitos){
            Grupo aux = (Grupo)var;
            if(aux.clave == selec){
                int resultado = aux.clave;
                return resultado;
            }
        }
        return -1;
    }
    
    //Selecciona los atributos del alumno con el numero de cuenta que el usuario seleccione
    Alumno selecAlu(ArrayList<Alumno> alumnitos, int cuenta){
        Alumno aux = new Alumno();
        for(Alumno var : alumnitos){
            Alumno ayuda = (Alumno)var;
            if(ayuda.cuenta == cuenta){
                //Compara los numeros de cuenta para verificar si el solicitado se encuentra entre las opciones
                aux = ayuda;
                return aux;
            }
        }
        
        return aux;
    }
    
    //Imprime el grupo y los alumnos inscritos en el
    void inscritos(){
        Enumeration<Integer> claves = lista.keys();
        int clave;
        //Lista auxiliar para imprimir a los alumnos inscritos
        ArrayList<Alumno> Valores;
        while(claves.hasMoreElements()){
            clave = claves.nextElement();
            Valores = lista.get(clave);
            System.out.println("Clave del grupo: " + clave);
            System.out.println("Alumnos Inscritos: ");
            //Imprime el nombre y numero de cuenta de los alumnos inscritos en cada grupo
            for(int i = 0; i < Valores.size(); i++){
                Alumno aux = Valores.get(i);
                System.out.println("Nombre: " + aux.nombre + "\nNumero de cuenta: " + aux.cuenta);
                System.out.println();
            }
        }
        System.out.println();
    }
}