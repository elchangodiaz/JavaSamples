
package test;

public class EjemploVarArgs {
    public static void main(String[] args) {
        //imprimimos varios numeros
        imprimirNumeros(15,10,55,63,18,1,9,18);
        
        //parametros variables
        System.out.println("\n");
        variosParametros("Juan", true, 14,2,99,3);
        
    }

    private static void imprimirNumeros(int... numeros) {
        //recorremos el arreglo
        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros[i];
            System.out.println("Numero " + i + ": " + elemento);
        }
    }

    private static void variosParametros(String nombre, boolean bandera, int... numeros) {
        
        System.out.println("Nombre = " + nombre);
        System.out.println("Bandera = " + bandera);
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Elemento = " + numeros[i]);
        }
    }
    
}
