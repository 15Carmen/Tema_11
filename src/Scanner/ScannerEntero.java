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
        int suma = 0;
        int contador = 0;

        try {

            input = new BufferedReader(new FileReader(FILE_NAME));
            sc = new Scanner(input);

            while (sc.hasNextInt()) {
                suma += sc.nextInt();
                input.readLine();
                contador++;
            }

        } catch (IOException e) {
            System.out.println("Error!! " + e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Error cerrando el archivo!" + e);
            }
        }
        System.out.printf("La suma de enteros es %d", suma);
    }
}
