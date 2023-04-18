import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {public static void main(String[] args) {
    
    ArrayList<String> list = new ArrayList<String>();
    list.add("hola");
    list.add("Mundo");
    list.add("Lindo");
    list.add("Dia");

    LinkedList<String> lista = new LinkedList<String>(list);

    System.out.println(lista.indexOf("hola"));
    System.out.println(lista.indexOf("Mundo"));
    System.out.println(lista.indexOf("Lindo"));
    System.out.println(lista.indexOf("Dia"));

    
    
    }

}
    

