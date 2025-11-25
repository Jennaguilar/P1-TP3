public class TurnoConsulta {
    private Estudiante estudiante;
    private String motivo;
    private String horaLlegada;
    private int duracionEstimada;

    public TurnoConsulta(Estudiante estudiante, String motivo, String horaLlegada, int duracionEstimada){
        this.estudiante = estudiante;
        this.motivo = motivo;
        this.horaLlegada = horaLlegada;
        this.duracionEstimada = duracionEstimada;
    }

    @Override
    public String toString(){
        return "Turno de " + estudiante.getNombre() +
                " | Motivo: " + motivo + 
                " | Llego: " + horaLlegada +
                " | Duracion: " + duracionEstimada + " min ";

        }   

}