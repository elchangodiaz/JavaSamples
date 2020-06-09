package test;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Autoboxing (envolvemos tipos primitivos en clases wrapper)
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj);
        
        //Unboxing (extraemos el tipo primitivo del objeto envolvente)
        int entero = enteroObj;
        System.out.println("entero = " + entero);
        
        Float floatObj = 12.2F;
        System.out.println("floatObj = " + floatObj);
        
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);
        System.out.println("entero a partir del float " + floatObj.intValue());
    }    
}
