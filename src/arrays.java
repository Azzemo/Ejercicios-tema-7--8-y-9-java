public class arrays {
    public static void main(String[] args) {
        
        String ArrayNombres[] = {
            "Pepe",
            "Juan",
            "Francisco",
        };
  
        for (int i = 0; i < ArrayNombres.length; i++){
            System.out.println(i);
        }

        int ArrayEnteros[][] = new int[2][4];
        ArrayEnteros[0][0] = 1;
        ArrayEnteros[0][1] = 2;
        ArrayEnteros[0][2] = 3;
        ArrayEnteros[0][3] = 4;

        ArrayEnteros[1][0] = 10;
        ArrayEnteros[1][1] = 20;
        ArrayEnteros[1][2] = 30;
        ArrayEnteros[1][3] = 40;

        for (int i = 0; i < ArrayEnteros.length; i++) {
            System.out.println("Columna: " + i);

            for (int j = 0; j < ArrayEnteros[i].length; j++) {
                System.out.println("valor: " + ArrayEnteros[i][j]);
                
            }
        }

        }
    }

