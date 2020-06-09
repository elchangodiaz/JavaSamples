
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pilas {

    public static void main(String[] args) {
        //Pila o Stack
        //LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(17);
        //int i = stack.pop();
        //System.out.println("i = " + i);
        stack.push(18);
        stack.push(19);
        stack.push(20);
        System.out.println("stack = " + stack);
        stack.pop();
        System.out.println("stack = " + stack);

        System.out.println("");

        //Cola o Queue
        //FIFO
        Queue<String> queue = new LinkedList<String>();
        queue.add("element0");
        queue.add("element1");
        queue.add("element2");
        queue.add("element3");
        System.out.println("queue = " + queue);
        queue.remove();
        System.out.println("queue = " + queue);

        System.out.println("");

        //array
        String[] vowels = {"a", "e", "i", "o", "u"};
        System.out.println("tercer vocal = " + vowels[2]);

        //Listas
        List<String> list = new ArrayList<>();
        list.add("Juan");
        list.add("Pepe");
        list.add("Toño");
        list.add("Karla");        
        System.out.println("Lista: " + list);
        list.remove(3);
        System.out.println("Lista: " + list);
        

    }

}
