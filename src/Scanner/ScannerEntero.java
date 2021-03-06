package Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEntero {

    public static void run2() {

        String FILE_NAME = "scannerEntero.txt";
        Scanner sc = null;
        BufferedReader input = null;
        String registro=null;
        int suma = 0;
        int contador = 0;

        try {

            input = new BufferedReader(new FileReader(FILE_NAME));
            registro=input.readLine();
            sc = new Scanner(registro);

            while (sc.hasNext()) {
                if (sc.hasNextInt()){
                    suma += sc.nextInt();
                }
                registro = input.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error!! " + e);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrando el archivo!" + e);
            }
        }
        System.out.printf("La suma de enteros es %d", suma);
    }
}
