/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elcha
 */
public class PruebaPersonas {
    
    public static void main(String[] args) {
        
        //creacion de un objeto de tipo persona
        
        //definicion de variable tipo persona
        Persona persona1;
        
        //instanciar (creando objetos de la clase persona)
        persona1 = new Persona();
        
        //accedemos al obbjeto persona y llamamos al metodo desplegarNombres
        persona1.desplegarNombres();
        
        persona1.nombre = "Juanito";
        persona1.apellido = "Perez";
        
        persona1.desplegarNombres();
        
        Persona persona2 = new Persona();
        
        persona2.nombre = "chango";
        persona2.apellido = "Diaz";
        
        System.out.println("");
        persona2.desplegarNombres();
        
        
        
    }
    
}
