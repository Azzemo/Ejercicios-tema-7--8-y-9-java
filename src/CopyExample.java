import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) throws IOException {
        String sourceFile = "C:/Users/Mohax/Desktop/Menu Azzemo/Documentos/OPENBOOTCAMP AZZEMOD/Projectos Java/Ejercicios tema 7,8 y 9 java/Ejercicios tema 7, 8 y 9 java/F1/holamundo.txt";
        String destinationFile = "C:/Users/Mohax/Desktop/Menu Azzemo/Documentos/OPENBOOTCAMP AZZEMOD/Projectos Java/Ejercicios tema 7,8 y 9 java/Ejercicios tema 7, 8 y 9 java/F2";
        copyFile(sourceFile, destinationFile);
    }

    public static void copyFile(String sourceFile, String destinationFile) throws IOException {
        try {
            File f1 = new File(sourceFile);
            File f2 = new File(destinationFile);
            FileInputStream in = new FileInputStream(f1);
            FileOutputStream out = new FileOutputStream(f2);
            try {
                copyStream(in, out);
            }
            finally {
                in.close();
                out.close();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copyStream(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[1024];
        int numBytes = 0;
        while ((numBytes = in.read(buffer)) >= 0) {
            out.write(buffer, 0, numBytes);
        }
    }
}

