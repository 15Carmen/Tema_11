package Scanner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerLOL {


    public static void run() {

        String FILE_NAME = "scanner.txt";
        Scanner sc=null;
        BufferedReader input = null;
        double suma=0;

        try {

            input = new BufferedReader(new FileReader(FILE_NAME));
            sc = new Scanner(input);

            while (sc.hasNextDouble()) {
                suma += sc.nextDouble();
                input.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error!! " + e);
        } finally {
           try {
               input.close();
           }catch (IOException e){
               System.out.println("Error cerrando el archivo!" + e);
           }
        }
        System.out.printf("La suma es %.3f", suma);
    }
}
