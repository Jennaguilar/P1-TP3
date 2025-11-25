public class Estudiante extends Persona implements MiembroUniversidad{
String carrera;
double promedio;
private ListaEnlazada materias;
private Pila tareasPendientes;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, double promedio, Materia materias []){
        super(nombre, apellido, edad, documento);    
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new ListaEnlazada(); // siempre inicializa la lista
        
    }

    public Estudiante(){
        this.materias = new ListaEnlazada();
    }

    //Metodos Getters y Setters//

    public String getCarrera(){
        return this.carrera;
    }

    public void setCarrera(String carrera){
        if(carrera == null || carrera.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.carrera = carrera;
    }

    public double getPromedio(){
        return this.edad;
    }

    public void setPromedio(double promedio){
        if (promedio < 1 || promedio > 10){
            throw new IllegalArgumentException("El promedio debe ser de entre 1 y 10");
        }
        this.promedio = promedio;
    }


    public ListaEnlazada getMaterias(){
        return this.materias;
    }

     public void setMaterias(ListaEnlazada materias){
        this.materias = materias;
    }


    @Override
    public String obtenerRol(){
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta(){
        return toString();
    }

     public void agregarMateria(Materia m) {
        this.materias.agregarPrimero(m);
    }

// Método que suma recursivamente todas las calificaciones de la lista
public double calcularSumaRecursiva(Nodo actual) {

    // Caso base: si el nodo es nulo, llegamos al final de la lista
    if (actual == null) {
        return 0; 
    }

    // Hacemos casting del dato (Object) a Materia para poder usar getCalificacion()
    Materia materiaActual = (Materia) actual.getDato();

    // Paso recursivo:
    // Calificación de la materia actual + suma del resto de los nodos
    return materiaActual.getCalificacion() + calcularSumaRecursiva(actual.getSiguiente());
}



// Método que calcula el promedio usando la suma recursiva
public double calcularPromedioRecursivo() {

    // Contamos cuántas materias hay en la lista
    int cantidad = materias.contarElementos();

    // Si la lista está vacía, el promedio debe ser 0
    if (cantidad == 0) return 0;

    // Llamo al método recursivo empezando desde la cabeza de la lista
    double sumaTotal = calcularSumaRecursiva(materias.getCabeza());

    // Guardo el promedio en el atributo
    this.promedio = sumaTotal / cantidad;

    // Devuelvo el promedio
    return sumaTotal / cantidad;
}



// Método iterativo que recorre la lista para calcular el promedio
public double calcularPromedioIterativo() {

    // Obtenemos cuántas materias hay en la lista
    int cantidad = materias.contarElementos();

    // Si está vacía, retorno 0 para evitar división por cero
    if (cantidad == 0) return 0;

    double suma = 0;

    // Empezamos desde la cabeza de la lista
    Nodo actual = materias.getCabeza();

    // Recorremos la lista completa
    while (actual != null) {

        // Convertimos el dato del nodo a Materia
        Materia materiaActual = (Materia) actual.getDato();

        // Sumamos la calificación
        suma += materiaActual.getCalificacion();

        // Pasamos al siguiente nodo
        actual = actual.getSiguiente();
    }

    // Finalmente devolvemos el promedio
    return suma / cantidad;
}
    // Agrega una nueva tarea a la pila
    public void agregarTarea(Tarea tarea) {
        tareasPendientes.push(tarea);
    }

    // Devuelve la próxima tarea SIN sacarla de la pila
    public Tarea verProximaTarea() {
        return (Tarea) tareasPendientes.peek();
    }

    // Retira la última tarea agregada (la de mayor prioridad temporal)
    public Tarea completarUltimaTarea() {
        return (Tarea) tareasPendientes.pop();
    }

    /*
    
    push() ⇒ agrega arriba de la pila

    peek() ⇒ mira la próxima tarea pero no la elimina

    pop() ⇒ completa y elimina la última tarea agregada
        
    */



    @Override
    public String toString(){
        return super.toString() + "- Carrera:"+ carrera + "- Promedio: "+ promedio;
    }

    

}