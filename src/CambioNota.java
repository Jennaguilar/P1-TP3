public class CambioNota {
    private String estudianteId;
    private int materiaId;
    private double notaAnterior;
    private double notaNueva;
    private String fecha;



    //constructor
    public CambioNota(String estudianteId, int materiaId, double notaAnterior, double notaNueva, String fecha){
        this.estudianteId = estudianteId;
        this.materiaId = materiaId;
        this.notaAnterior = notaAnterior;
        this.notaNueva = notaNueva;
        this.fecha = fecha;
    }


    // Getters
    public String getEstudianteId(){
        return estudianteId;
    }

    public int getMateriaId(){
        return materiaId;
    }

    public Double getNotaAnterior(){
        return notaAnterior;
    }

    public Double getNotaNueva(){
        return notaNueva;
    }

    public String getFecha(){
        return fecha;
    }



    @Override
    public String toString(){
        return "CambioNota{" +
                "estudianteId='" + estudianteId + '\'' +
                ", materiaId=" + materiaId +
                ", notaAnterior=" + notaAnterior +
                ", notaNueva=" + notaNueva +
                ", fecha='" + fecha + '\'' +
                '}';
    }

}
