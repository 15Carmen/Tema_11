package archivosBinarios;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class tablaEnteros {

    static final String FILE_NAME = "datos.dat";
    static final String FILE_NAME2 = "datos2.dat";
    static final String FILE_NAME3 = "datos3.dat";
    static Integer[] tabla = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static List<Integer> listaEnteros = new ArrayList<>();

    public static void rellenar() {
        Collections.addAll(listaEnteros, tabla);
    }

    public static void escribir() {

        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            for (int i = 0; i < tabla.length; i++) {
                escribir.write(tabla[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error al crear el fichero");
        } catch (IOException e) {
            System.out.println("Error al crear el objeto");
        }

        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(FILE_NAME2))) {

            escribir.writeObject(listaEnteros);

        } catch (FileNotFoundException e) {
            System.out.println("Error al crear el fichero");
        } catch (IOException e) {
            System.out.println("Error al crear el objeto");
        }

        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(FILE_NAME3))) {

            escribir.writeObject(tabla);

        } catch (FileNotFoundException e) {
            System.out.println("Error al crear el fichero");
        } catch (IOException e) {
            System.out.println("Error al crear el objeto");
        }

    }


    public static void leer() {

        try (ObjectInputStream leer = new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            tabla= (Integer[]) leer.readObject();
            //System.out.println(Arrays.toString((Integer[]) leer.readObject()));
            //System.out.println(leer.readObject());

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el fichero");
        } catch (IOException e) {
            System.out.println("Error al leer el objeto");
        }

        try (ObjectInputStream leer = new ObjectInputStream(new FileInputStream(FILE_NAME2))) {

            //tabla= (Integer[]) leer.readObject();
            //System.out.println(Arrays.toString((Integer[]) leer.readObject()));
            System.out.println(leer.readObject());

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el fichero");
        } catch (IOException e) {
            System.out.println("Error al leer el objeto");
        }

        try (ObjectInputStream leer = new ObjectInputStream(new FileInputStream(FILE_NAME3))) {

            //tabla= (Integer[]) leer.readObject();
            System.out.println(Arrays.toString((Integer[]) leer.readObject()));
            //System.out.println(leer.readObject());

        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el fichero");
        } catch (IOException e) {
            System.out.println("Error al leer el objeto");
        }

    }


}

