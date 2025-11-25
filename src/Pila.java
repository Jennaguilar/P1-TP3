// Pila.java


public class Pila {
    private ListaEnlazada lista;




    public Pila() {
        this.lista = new ListaEnlazada();

    }


    // push: agrega un elemento a la cima de la pila (iniciando la lista)
    public void push(Object dato) {
        lista.agregarPrimero(dato);
    }


    // pop: elimina y devuelve el elemento en la cima de la pila
    public Object pop() {
        return lista.quitarPrimero();
    }


    // peek: mira la cima sin quitarlo
    public Object peek() {
        return lista.estaVacia() ? null : lista.getCabeza().getDato();
    }

    public boolean isEmpty() {
        return lista.estaVacia();
    }

    public int size() {
        return lista.contarElementos();
    }

}
