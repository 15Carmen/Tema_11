package Leer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountingVocals {

    private static String FICHERO = "input.txt";
    private static String VOCALES = "aeiou";

    public static void run() {

        FileReader input = null;

        try {

            CharCounter counters = new CharCounter(VOCALES, false);
            input = new FileReader(FICHERO);
            int c= input.read();

            while ( c != -1) {
                counters.countIfTargeted((char) c);
                c= input.read();
            }
            System.out.println(counters);

        } catch (FileNotFoundException ex) {
            System.out.println("Problemas para abrir el archivo " + FICHERO);

        } catch (IOException ex) {
            System.out.println("Problemas para leer el archivo " + FICHERO);

        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                System.out.println("Problemas para cerrar el archivo " + FICHERO);
            }
        }
    }
}



