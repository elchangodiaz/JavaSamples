package test;

import ejemploconversionesobjetos.*;


public class PruebaConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;   
        empleado = new Escritor("Roy", 5000, TipoEscritura.CLASICO);
        empleado.obtenerDetalles();
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        Escritor escritor = (Escritor)empleado;
        System.out.println("Tipo Escritura" + escritor.getTipoDeEscrituraEnTexto());
        
        ((Escritor)empleado).obtenerDetalles();
        System.out.println("escritor = " + escritor.obtenerDetalles());
        
        empleado = new Gerente("Laura", 6000, "Sistemas");
        
        System.out.println("Departamento gerente: " + ((Gerente) empleado).getDepartamento());
    }
    
}