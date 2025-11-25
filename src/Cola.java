// Cola.java

public class Cola {
    private Nodo frente;
    private Nodo fin;
    private ListaEnlazada lista;



    public Cola(){
        this.frente = null;
        this.fin = null;
        this.lista = new ListaEnlazada();
    }


    //Inserta el final de la cola (enqueue)
    public void insertar(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(lista.estaVacia()){
            frente = nuevo;
            fin = nuevo;    
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    // Quitar del frente de la cola (dequeue)
    public Object quitar(){
        if (estaVacia()){
            return null;
        } 
        Object dato = frente.getDato();
        frente = frente.getSiguiente();

        if (frente == null){
            fin = null;
        }
        return dato;
    }


    // Ver el primero SIN quitarlo
    public Object verPrimero(){
        return (estaVacia()) ? null : frente.getDato();
    }

    public boolean estaVacia(){
        return frente == null;
    }

    public int size(){
        int contador = 0;
        Nodo actual = frente;

        while(actual != null){
            contador++;
            actual = actual.getSiguiente();
        
            
        }
                return contador;
    }
}
