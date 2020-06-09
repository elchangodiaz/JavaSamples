
package test;

import ejemplosobreescritura.Empleado;
import ejemplosobreescritura.Gerente;

public class EjemploSobreescritura {
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 1000);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        Gerente gerente = new Gerente("Karlla", 2000, "Finanzas");
        System.out.println("Gerente = " + gerente.obtenerDetalles());
        
    }
    
}
