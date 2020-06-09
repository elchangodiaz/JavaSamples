
package com.gm.mundopc;

public class Orden {
    
    private final int idOrden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10; 
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        
        if(contadorComputadoras < MAX_COMPUTADORAS) 
            computadoras[contadorComputadoras++] = computadora;
        else
            System.out.println("Se supero el numero de computadoras");
    }
    
    public void mostrarOrden(){
        System.out.println("IdOrden : " + idOrden);
        System.out.println("Computadoras de la orden: " + idOrden + ": ");
        for(int i = 0; i < contadorComputadoras; i++){
            System.out.println("Computadora : " + computadoras[i]);
        }   
    }

}
