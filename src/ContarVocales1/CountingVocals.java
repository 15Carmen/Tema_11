package ContarVocales1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountingVocals {

    public static void escribirFichero(String input, String texto) {

        try (FileWriter fich = new FileWriter(input)) {
            // Escribimos el texto en el fichero
            fich.write(texto);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero " + e);
        }
    }
    public static void mostrarFichero(String input) {

        System.out.println("El contenido de " + input + " es: ");
        // Leemos texto del fichero

        try (FileReader fr = new FileReader(input)) {

            int caracter = fr.read();
            int contadorA=0;
            int contadorE=0;
            int contadorI=0;
            int contadorO=0;
            int contadorU=0;
            int contadorTotal=0;


            while (caracter != -1) {
                switch (caracter) {
                    case 'a', 'A' -> {
                        contadorA++;
                        contadorTotal++;
                    }
                    case 'e', 'E' -> {
                        contadorE++;
                        contadorTotal++;
                    }
                    case 'i', 'I' -> {
                        contadorI++;
                        contadorTotal++;
                    }
                    case 'o', 'O' -> {
                        contadorO++;
                        contadorTotal++;
                    }
                    case 'u', 'U' -> {
                        contadorU++;
                        contadorTotal++;
                    }
                }
                System.out.print((char) caracter);
                caracter = fr.read();
            }

            System.out.println();
            System.out.println("La cadena de texto tiene "+contadorTotal +" vocales en total");
            System.out.println("Tiene "+contadorA+" a, "+contadorE+" e, "+contadorI+" i, "+contadorO+" o y "
                    +contadorU+" u.");

        } catch (IOException e) {
            System.out.println("Problema con la lectura/excritura en el fichero " + e);
        }
    }
}



