import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashMapExample{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream outputStream;
        try (PrintStream outputStream = new PrintStream(System.out);
             InputStream fileInputStream = new FileInputStream("file.txt")) {
            /* Use a hash map as an index-based lookup
*/
            HashMap<String, String> map = new HashMap<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Map.Entry<String, String> entry = (Entry<String, String>) map.entrySet().stream()
                        .collect(Collectors.groupingBy(Map.Entry::getKey, TreeMap::new, Collectors.mapping(Map.Entry::getValue, Collectors.joining())));
                Entry<String, String>[] hola;
                for (Map.Entry<String, String> e : hola) {
                    outputStream.print(e.getKey() + ": " + e.getValue() + "\n");
                }
            }
        } catch (FileNotFoundException ex) {
            outputStream.print("File not found: " + ex.getMessage() + "\n");
        }
        outputStream.print("Demo de código\n");
    }
}
