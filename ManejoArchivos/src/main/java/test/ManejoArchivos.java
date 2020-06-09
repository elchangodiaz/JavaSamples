package test;
import static utileria.Archivo.*;

public class ManejoArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "c:\\Cursos\\Java\\pruebaJava\\archivoPruebaJava.txt";
        
        //creamos archivo
        //crearArchivo(nombreArchivo);
        
        //Escribir archivo
        //escribirArchivo(nombreArchivo);
        
        //lectura de acrchivo
        //leerArchivo(nombreArchivo);
        
        //Anexar info a un archivo existente
        anexarArchivo(nombreArchivo);
        leerArchivo(nombreArchivo);
    }
}
