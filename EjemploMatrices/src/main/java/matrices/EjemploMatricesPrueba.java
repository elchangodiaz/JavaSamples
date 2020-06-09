package matrices;

public class EjemploMatricesPrueba {
    
   

    public static void main(String[] args) {
        //1. Declaramos matriz ti[po int
        int edades[][];
        //2. Instanciamos la matriz int    renglon col
        edades = new int[3][2];
        //3. instanciar los valores de matriz
        edades[0][0] = 10;
        edades[0][1] = 20;
        edades[1][0] = 30;
        edades[1][1] = 40;
        edades[2][0] = 50;
        edades[2][1] = 60;
        //4. Imprimir algunos valores
        System.out.println("Matrizz de enteros en indice 0,0 : " + edades[0][0]);
        System.out.println("Matrizz de enteros en indice 2,0 : " + edades[2][0]);
        
        
        //1. Matriz de objetos de tipo Persona
        Persona personas[][] = new Persona[1][2];
        //2. inicializamos algunos valores
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Carla");
        //3. imprimir valores
        System.out.println("\nMatriz persona en el indice 0,0 : " + personas[0][0]);
        System.out.println("Matriz persona en el indice 0, 1 : " + personas[0][1]);
        
        for(int renglon = 0; renglon < personas.length; renglon++){
            for(int columna = 0; columna < personas[renglon].length; columna++)
                System.out.println("\nMatriz personas en el indice " +  renglon + " - "
                        + columna + " " + personas[renglon][columna] );
        }
        
        
    }

}
