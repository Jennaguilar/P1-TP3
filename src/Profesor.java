public class Profesor extends Persona implements MiembroUniversidad{
    String especialidad;
    ListaEnlazada materiasAsignadas;
    int añosExperiencia;
    private Cola colaConsultas = new Cola();

    public Profesor(String nombre, String apellido, int edad,String documento, String especialidad, int añosExperiencia){
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
        this.materiasAsignadas = new ListaEnlazada();
    }

    public String getEspecialidad(){
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad){
        if (especialidad == null || especialidad.isEmpty()){
            throw new IllegalArgumentException("La especialidad no puede estar vacía");
       }
        this.especialidad = especialidad;
    }
 
    public int getAñosExperiencia(){
        return this.añosExperiencia;
    }

   
    public void setAñosExperiencia(int añosExperiencia){
        if (añosExperiencia < 0){
            throw new IllegalArgumentException("Los años de experiencia deben ser mayor a 0");
        }
        this.añosExperiencia = añosExperiencia;
    }

    public void AsignarMateria(Materia materia){
        
        this.materiasAsignadas.agregarPrimero(materia);
    } 

    // Agrega estudiante a la cola de consultas
    public void agregarEstudianteACola(TurnoConsulta turno) {
        colaConsultas.insertar(turno);
    }

    // Atiende al primer estudiante que llegó
    public TurnoConsulta atenderSiguienteEstudiante() {
        return (TurnoConsulta) colaConsultas.quitar();
    }

    // Devuelve el próximo en cola sin quitarlo
    public TurnoConsulta verSiguienteEnCola() {
        return (TurnoConsulta) colaConsultas.verPrimero();
    }

    /*
    insertar() ⇒ encola al final
    quitar() ⇒ atiende al primero que llego
    verPrimero() ⇒ mira quién sigue sin atender todavia
    
    
    */



    @Override
    public String obtenerRol(){
        return "Profesor";
    }

    @Override
    public String obtenerInformacionCompleta(){
        return toString();
    }
  
    @Override
    public String toString() {
        return super.toString() + " - Especialidad: "+ especialidad +" - Experiencia "+ añosExperiencia + " años";
    }
}