package genericos;

public class ClaseGenerica<T> {
    //Definir variable tipo T
    T objeto;
    
    //Constructor que inicializa el tipo a utilizar
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
