// GestorInscripciones.java
// Maneja una COLA de solicitudes en orden FIFO(First in First out)

public class GestorInscripciones {
    private Cola solicitudesPendientes; // Cola de SolicitudInscripcion

    // Constructor
    public GestorInscripciones() {
        this.solicitudesPendientes = new Cola();
    }

    // Agregar solicitud (enqueue)
    public void agregarSolicitud(SolicitudInscripcion solicitud) {
        solicitudesPendientes.insertar(solicitud);
    }

    // procesar la solicitud (dequeue)
    public SolicitudInscripcion procesarSiguienteSolicitud() {
        if (solicitudesPendientes.estaVacia()){
            System.out.println("No hay solicitudes pendientes...");
            return null;
        }
        return (SolicitudInscripcion) solicitudesPendientes.quitar();
    }

    // VER SIN QUITAR 
    public SolicitudInscripcion verSiguienteSolicitud() {
        return (SolicitudInscripcion) solicitudesPendientes.verPrimero();
    }


    // contar los elementos en la cola
    public int contarSolicitudesPendientes(){
        return solicitudesPendientes.size();
    }
}
