package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedQuijote {
    static final String FILE_NAME="quijote.txt";
    static String cadena=null;

    public static void ejecutar(){

        FileWriter outputCaracter=null;
        BufferedWriter output=null;
        try{

            outputCaracter=new FileWriter(FILE_NAME);
            cadena="En un lugar de la Mancha";
            for(int i=0; i<cadena.length(); i++){
                outputCaracter.write(cadena.charAt(i));
            }

            output = new BufferedWriter(new FileWriter(FILE_NAME));
            cadena="de cuyo nombre no quiero acordarme";
            output.newLine();
            output.write(cadena);

        }catch (IOException e){
            System.out.println("Error de escritura!");
        }finally {
            try{
                if (output!=null){
                    output.close();
                }
            }catch(Exception e){
                System.out.println("Error!");
            }
        }
    }
    public static void escribirQuijoteCaracter (){
        FileWriter escribir = null;
        try {
            escribir = new FileWriter(QUIJOTE);
            escribir.write("En un lugar de La Mancha,");
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        } finally {
            try {
                assert escribir != null;
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el flujo de datos.");
            }
        }
    }

    public static void escribirQuijoteLinea () {
        BufferedWriter escribir = null;
        try {
            escribir = new BufferedWriter(new FileWriter(QUIJOTE, true));
            escribir.newLine();
            escribir.write("de cuyo nombre no quiero acordarme");
            escribir.flush();
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        } finally {
            try {
                assert escribir != null;
                escribir.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el flujo de datos.");
            }
        }
    }

    public static void duplicarFichero (){
        BufferedReader lectura = null;
        BufferedWriter escritura = null;
        String copia;
        String archivo = JOptionPane.showInputDialog("Introduzca el nombre del archivo a copiar.");
        try {
            lectura = new BufferedReader(new FileReader(archivo + ".txt"));
            escritura = new BufferedWriter(new FileWriter("copia_de_" + archivo + ".txt",true));
            copia = lectura.readLine();
            while (copia!=null){
                escritura.write(copia);
                escritura.newLine();
                copia = lectura.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida.");
        } finally {
            try {
                if (lectura!=null){
                    lectura.close();
                }
                if (escritura!=null){
                    escritura.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar la comunicación.");
            }
        }
    }
}
