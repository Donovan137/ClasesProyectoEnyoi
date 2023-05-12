public class ClasePersonas {
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    
}

    public void Personas(String nombre, String apellido, int edad, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
    
}

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}