package arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {
        //1.- Declarar variable de tipo arreglo

        int edades[];

        //2.- instanciar arreglo int
        edades = new int[3];

        //3.- inicializamos valores del arreglo
        edades[0] = 30;
        edades[1] = 40;
        edades[2] = 22;

        System.out.println("arreglo enteros indice 0 : " + edades[0]);
        System.out.println("arreglo enteros indice 1 : " + edades[1]);
        System.out.println("arreglo enteros indice 2 : " + edades[2] + "\n");
        
        
        //1.- declarar e instanciar variable tipo persona
        Persona personas[] = new Persona[4];
        // 2.- inicializamos valores
        personas[0] = new Persona("Juan");
        personas[2] = new Persona("Karla");
        //3.- imprmimimos
        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 2: " + personas[2]);
        System.out.println("Arreglo personas indice 3: " + personas[3] + "\n");
        
        // notacion simplificada
        
        String nombres[] = {"Sara", "Laura", "Karen", "Jose"};
        
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Arreglo string indice " + i + ": " + nombres[i]);
        }

    }

}
