// HistorialCambios.java
// Esta clase usa una pila para guardar cambios de notas y permite registrar y deshacer el ultimo cambio.
public class HistorialCambios {
    private Pila historial;  // Pila que guarda los cambios de notas


    public HistorialCambios() {
        this.historial = new Pila(); //Inicializa la pila 
    }

    // Registra un nuevo cambio de la pila con (push)
    public void registrarCambio(CambioNota cambio) {
        historial.push(cambio);
    }
    // Deshace el ultimo cambio de la pila con (pop)
    public CambioNota deshacerUltimoCambio() {
        return (CambioNota) historial.pop();
    }
    // Verifica si hay cambios en la pila
    public boolean hayCambios() {
        return !historial.isEmpty();
    }
}
