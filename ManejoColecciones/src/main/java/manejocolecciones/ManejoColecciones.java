package manejocolecciones;

import java.util.*;

public class ManejoColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("a1");
        miLista.add(2);
        miLista.add(3);
        //elemento repetido
        miLista.add(3);
        
        imprimir(miLista);      
        
        Set miSet = new HashSet();
        miSet.add("a");
        miSet.add(200);
        miSet.add("300");
        miSet.add("300");
        
        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("V1", 1);
        miMapa.put("V2", "Karla");
        miMapa.put(1, 3);
        //elemento duplicado sustituye al valor
        miMapa.put("V2", "Karlaaa");
        //imprimir llaves
        imprimir(miMapa.keySet());
        // imprimir elementos
        imprimir(miMapa.values());
        //imprimir ambos
        imprimir(miMapa.entrySet());
        System.out.println(miMapa.get("V1"));
        
    }
    
    private static void imprimir(Collection coleccion){
        for(Object elemento: coleccion){
            System.out.println("elemento: " + elemento);
        }
    }
    
}
