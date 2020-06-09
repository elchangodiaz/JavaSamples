package coleccionesgenericas;

import java.util.*;

public class ColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList();
        miLista.add("Juan");
        miLista.add("Karla");
        miLista.add("Juan");
        imprimir(miLista);

        Set<String> miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("100");
        imprimir(miSet);

        Map<String, String> miMapa = new HashMap();
        miMapa.put("1", "Juan");
        miMapa.put("2", "Karla");
        miMapa.put("1", "Pedro");
        miMapa.put("3", "Karla");
        imprimir(miMapa.values());
        imprimir(miMapa.keySet());

    }

    private static void imprimir(Collection<String> col) {
        for (String elemento : col) {
            System.out.println("elemento: " + elemento);
        }
        System.out.println("");
    }
}
