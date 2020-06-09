
public class Persona {

    private int idPersona;
    private String nombre;                //sin static se asocia con un objeto (instancia) 
    private static int contadorPersonas;  //static se asocia con clase y no objetps (instancia)

    public Persona(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;

    }

    public int getIdPersona() {
        return this.idPersona;
    }

//    public void setIdPersona(int idPersona){
//        this.idPersona = idPersona;
//    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersona() {
        return contadorPersonas;
    }

    
    public String toString(){
        return "idPersona: " + idPersona + ", nombre: " + nombre + ", contadorPersonas: " + contadorPersonas;
    }
}
