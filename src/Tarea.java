// Tarea.java

public class Tarea {
    private String descripcion;
    private String materia;
    private String fechaLimite;
    private int prioridad; // 1.Alta, 2.-Media, 3.-Baja


    public Tarea(String descripcion, String materia, String fechaLimite, int prioridad){
        this.descripcion = descripcion;
        this.materia = materia;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
    }

    @Override
    public String toString(){
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", materia='" + materia + '\'' +
                ", fechaLimite='" + fechaLimite + '\'' +
                ", prioridad=" + prioridad +
                '}';
    }
}

// la tarea vamos a guardarla en una pila porque la ultlima tarea agregada sera ka primera en resolverse (LIFO)
