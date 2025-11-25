// solicitudInscripcion,java
// Pedido de un estudiante para inscribirse a una materia

public class SolicitudInscripcion {
    private Estudiante estudiante; // quien solicita
    private Materia materia;        // a que materia se inscribe 
    private String fechaSolicitud;
    private String estado; // pendiente, aprobada, rechazada

    public SolicitudInscripcion(Estudiante estudiante, Materia materia, String fechaSolicitud) {
        this.estudiante = estudiante;
        this.materia = materia;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = "pendiente";
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Materia getMateria(){
        return materia;
    }

    public String getFechaSolicitud(){
         return fechaSolicitud; 
        }

    public String getEstado(){
         return estado; 
        }

    public void setEstado(String estado){
         this.estado = estado; 
        }

    @Override
    public String toString() {
        return "SolicitudInscripcion [Estudiante=" + estudiante.getNombre() +
               ", Materia=" + materia.getNombre() +
               ", Fecha=" + fechaSolicitud +
               ", Estado=" + estado + "]";
    }
}




