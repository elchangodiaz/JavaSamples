public class Persona {
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona(){
        //super();   //llama constructor vacio de clase padre
        this.idPersona = ++contadorPersonas;
    }
    
    public Persona(String nombre, int edad){
        this(); //se llama constructor vacio
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    public int getIdPersona() {
        return idPersona;
    }

//    public void setIdPersona(int idPersona) {
//        this.idPersona = idPersona;
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

//    public static void setContadorPersonas(int contadorPersonas) {
//        Persona.contadorPersonas = contadorPersonas;
//    }
    
    
    
}
