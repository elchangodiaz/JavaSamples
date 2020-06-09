
import java.util.Date;


public class EjemploHerencia {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 5000.00);
        empleado1.setEdad(22);
        empleado1.setGenero('M');
        empleado1.setDireccion("Lomas #13");
        System.out.println(empleado1);
        
        Cliente cliente1 =  new Cliente(new Date(), true);
        cliente1.setNombre("Karla");
        cliente1.setGenero('F');
        cliente1.setEdad(18);
        cliente1.setDireccion("Rastro #13");
        System.out.println(cliente1);
        
    }

}
