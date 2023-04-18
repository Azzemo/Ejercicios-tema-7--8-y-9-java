import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main
{
    
    public static String reverse(String str)
    {
        
        if (str == null || str.equals("")) {
            return str;
        }
 
        List<Character> list = new ArrayList<Character>();
 
        for (char c: str.toCharArray()) {
            list.add(c);
        }
 
        Collections.reverse(list);
 
        StringBuilder builder = new StringBuilder(list.size());
        for (Character c: list) {
            builder.append(c);
        }
 
        return builder.toString();
    }
 
    public static void main(String[] args)
    {
        String str = "hola mundo";
 
        str = reverse(str);
 
        System.out.println("el reverso de la cadena de texto es: " + str);
    }
}