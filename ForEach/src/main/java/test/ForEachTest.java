package test;

import entidad.Persona;

public class ForEachTest {
    public static void main(String[] args) {
        int edades[] = {20,15,41,502};
        for(int edad : edades){
            System.out.println("edad = " + edad);
        }
        System.out.println("");
    
        Persona personas[] = {new Persona("Juan"), new Persona("Gabriela")};
        for(Persona persona : personas){
            System.out.println("Persona= " + persona);
        }    
    
    }
}
