package test;

import datos.*;
import excepciones.AccesoDatosEx;
import excepciones.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoExcepciones2 {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql();
        datos.simularError(false);
        ejecutar(datos, "listar");
        
        AccesoDatos datos2 = new ImplementacionOracle();
        datos2.simularError(true);
        ejecutar(datos2, "insertar");
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                System.out.println("Error de Lectura");
                ex.printStackTrace(System.out);
            } catch (AccesoDatosEx ex) {
                System.out.println("Error de Acceso Datos");
                ex.printStackTrace(System.out);
            } catch (Exception ex) {
                System.out.println("Error General");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("Procesar finally es opcional, pero siempre se ejecuta");
            }
        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Excepcion de acceso a datos");
                ex.printStackTrace(System.out);
            } finally {
                System.out.println("Procesar finally es opcional, pero siempre se ejecuta");

            }
        } else {
            System.out.println("No se proporciono ninguna accion conocida");
        }
    }

}
