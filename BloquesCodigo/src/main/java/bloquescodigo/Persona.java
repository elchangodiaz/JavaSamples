package bloquescodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //bloque de inicializacion de codigo static
    static{
        contadorPersonas = 10;
        //No podemos utilizar varianbles no estaticas de3ntro del bloque static
        //idPersona = 2;
        System.out.println("Ejecucion bloque estatico");
    }
       
    {
        //Bloque no estatico se copiua a cada objetoi
        System.out.println("Ejecucion bloque no estatico");
        this.idPersona = ++contadorPersonas;
        
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor vacio");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
}
