/*
* Derechos reservados gorraNegraBlackHat
*/
package prueba;

import com.gm.javadoc.Aritmetica;

/**
 * Clase para probar el concepto de javaDoc
 * @author elcha
 * @version 1.0
 */
public class PruebaJavaDoc {
    /**
     * Metodo que ejecuta la prueba de la clase aritmetica
     * @param args es un arreglo de tipo String de la linea de comandos
     */
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica(3, 5);
        int resultado = aritmetica1.sumar();
        System.out.println("Resultado = " + resultado);
    }
}
