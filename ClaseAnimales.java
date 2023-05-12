public class ClaseAnimales {
    
    private String nombre;
    private String genero;
    private String raza;

    public void Animales(String nombre, String genero, String raza) {
        this.nombre = nombre;
        this.genero = genero;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}

