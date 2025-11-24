public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String documento;

     public Persona(String nombre, String apellido, int edad, String documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public Persona (){
        
    }

    
    // get y set
    public String getDocumento(){
        return this.documento;
    }

    public void setDocumento(String documento){
        if(documento == null || documento.isEmpty()){
            throw new IllegalArgumentException("");
        }
        this.documento = documento;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        if (nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }


    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        if (apellido == null || apellido.isEmpty()){
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        this.apellido = apellido;
    }
    

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        if (edad <= 16){
            throw new IllegalArgumentException("La edad debe ser mayor a 16 años");
        }
        this.edad = edad;
    }
    
    @Override 
    
    public String toString(){
        return nombre + " " + apellido + " (Edad: " + edad + " DNI: "+ documento + ")";
    }


    @Override
    public boolean equals(Object obj){
   
        if(this == obj) return true;
         if(obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
         return (documento !=null)&&(documento.equals(persona.documento));
    }

    @Override
    //metodo hashcode que returna un numero hash para un dni que sea distinto a null
    public int hashCode(){
        if (documento != null){
            return documento.hashCode();
            //esto nos ayuda a definir un hashcode para cada dni, y asi comparar a personas con equals segun dni
        }else {
            return 0;
        }
    }
}