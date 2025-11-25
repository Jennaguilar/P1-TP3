public class App {
    public static void main(String[] args) throws Exception {
        Universidad uni = new Universidad("UNViMe", "Villa Mercedes");

        Profesor profesor1 = new Profesor("Maria", "Gomez", 45, "30111222", "Programacion", 20);
        Personal personal1 = new Personal("Carla", "Cancina", 35, "35777666", "Administracion", "Secretaria", "2020-11-15");
        
       // calificaciones de 0 a 10
       Materia materia1 = new Materia(1,"Programacion 1", "PROG1", 4, 4, profesor1);
       Materia materia2 = new Materia(2,"Matematica 1", "MAT1", 4, 10, profesor1);  
       Materia materia3 = new Materia(3 , "Bases de Datos", "BD1", 4, 8.0, profesor1);



        Estudiante estudiante1 = new Estudiante("Mario", "Perez", 23, "44333222", "Programador Universitario", 0 , null);
        Estudiante estudiante2 = new Estudiante("Rocio", "Gomez", 22, "39994444", "Computacion", 0 , null);
        Estudiante estudiante3 = new Estudiante("Ana", "Torres", 19, "48555444", "Bioingenieria",0 , null);
        Estudiante estudiante4 = new Estudiante("Ramiro", "Paredes", 20, "47343111", "Ingenieria en sistemas", 0, null);


        estudiante1.agregarMateria(materia1);
        estudiante1.agregarMateria(materia2);
        estudiante4.agregarMateria(materia3);


        double promedioAlex = estudiante1.calcularPromedioRecursivo();
        System.out.println("Promedio recursivo de Alex: " + promedioAlex);

        uni.agregarMiembro(estudiante1);
        uni.agregarMiembro(profesor1);
        uni.agregarMiembro(estudiante2);
        uni.agregarMiembro(estudiante3);
        uni.agregarMiembro(personal1);
        uni.agregarMiembro(estudiante4);

        System.out.println("LISTADO DE MIEMBROS : \n");
        uni.listarMiembros();

        
        System.out.println("\nOrdenando Estudiantes por Apellido...");

        Estudiante[] estudiantesParaOrdenar = uni.getSoloEstudiantes();

        
         uni.ordenarEstudiantesPorApellido(estudiantesParaOrdenar);
        System.out.println("lista ordenada de estudiantes:\n");
        for (Estudiante e : estudiantesParaOrdenar) {
            System.out.println(e.getApellido() + ", "+ e.getNombre());
        }


        System.out.println("\n--Busqueda por documento---\n");
        Persona encontrada = uni.buscarPorDocumento("44333222");
        if(encontrada != null){
            System.out.println("Persona encontrada: " + encontrada);
        }else {
            System.out.println("No se encontró la persona con ese documento.");
        }

        System.out.println("\n Busqueda Binaria por Apellido: 'Gomez' ");
        Estudiante clave = uni.busquedaBinariaEstudiantes(estudiantesParaOrdenar, "Gomez");
        if(clave != null){
            System.out.println("Estudiante encontrad@: " + clave.getNombre());
        } else {
            System.out.println("No se encontró el estudiante con ese apellido.");
        }

         
    


    // HISTORAL DE CAMBIOS

    System.out.println("\n --------- Historial de cambios -------");
    HistorialCambios historial = new HistorialCambios();

    historial.registrarCambio(new CambioNota("42788510", 1,4,7, "2025-05-15"));
    historial.registrarCambio(new CambioNota("46885732", 3,6,9, "2025-06-20"));

    while(historial.hayCambios()){
        System.out.println("Deshaciendo Cambio: " + historial.deshacerUltimoCambio());
    }
    // TAREA ESTUDIANTE PILA 
    System.out.println("\n--- TAREAS DEL ESTUDIANTE ---");

    estudiante1.agregarTarea(new Tarea("TP Programacion", "Prog1", "2025-11-20", 1));
    estudiante2.agregarTarea(new Tarea("Resumen BD", "BD1", "2025-11-18", 2));

    System.out.println("Proxima: " + estudiante1.verProximaTarea());
    System.out.println("Completando: " + estudiante2.completarUltimaTarea());




    // TURNOS PROFESOR COLA
    System.out.println("\n--- TURNOS DE CONSULTA ---");

    profesor1.agregarEstudianteACola(new TurnoConsulta(estudiante1, "Examen", "10:00", 15));
    profesor1.agregarEstudianteACola(new TurnoConsulta(estudiante3, "TP", "10:10", 10));

    System.out.println("Siguiente: " + profesor1.verSiguienteEnCola());
    System.out.println("Atendiendo: " + profesor1.atenderSiguienteEstudiante());



    // INSCRIPCIONES COLA
    System.out.println("\n--- GESTOR DE INSCRIPCIONES ---");

    GestorInscripciones gestor = new GestorInscripciones();

    gestor.agregarSolicitud(new SolicitudInscripcion(estudiante1, materia3, "2024-11-06"));
    gestor.agregarSolicitud(new SolicitudInscripcion(estudiante3, materia2, "2024-11-07"));

    while(gestor.contarSolicitudesPendientes() > 0){
        System.out.println("Procesando: " + gestor.procesarSiguienteSolicitud());
    }
    }

    }
    
