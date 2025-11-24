public class Nodo {
    //atributos
    Object dato;  // Guarda el valor del nodo (puede ser Estudiante, Profesor, Materia, etc.)
    Nodo siguiente;  // Apunta al siguiente nodo de la lista

    // Constructores
    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }


    
    public Nodo(Object dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    //get y set

      public Object getDato() {
        return this.dato;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
}
