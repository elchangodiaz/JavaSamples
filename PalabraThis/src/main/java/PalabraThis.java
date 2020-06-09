
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
    }

}

class Persona {
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre; //apunta objeto de clase persona
        System.out.println("Impresion del operador this dentro de la clase persona: " + this);
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this); //referencia al objeto perrsona
    }
    
}

class Imprimir {
    public void imprimir(Persona p){
        System.out.println("Impresion del argumento perosna: " + p);
        
        System.out.println("Impresion del objeto actual this: " + this);
    }
}
