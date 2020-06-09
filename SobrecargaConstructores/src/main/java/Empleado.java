public class Empleado extends Persona{
    
    private double sueldo;
    
    
    public Empleado(String nombre, int edad) {
        super(nombre, edad);
    }
    
    public Empleado(String nombre, int edad, double sueldo){
        this(nombre, edad);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " Empleado{" + "sueldo=" + sueldo + '}';
    }
    
    
    
}
