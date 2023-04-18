import java.util.Vector;

public class Vektor {
    public static void main(String[] args) {
    Vector<Integer> vector = new Vector(50,15);
    vector.add(0);
    vector.add(1);
    vector.add(2);
    vector.add(3);
    vector.add(4);

    vector.remove(2);
    vector.remove(3);

    for (int i : vector) 
        {System.out.println("valor actual en vector: "+ i);
        }
        //el problema de añadir 1k de datos a un vector defauld es que ira mas lento el codigo.
    }
    
}
