package ClaseFile;

import java.io.File;
import java.util.Scanner;

    /*
    Ejercicio 1.- En este programa, vamos a pedir el nombre de un fichero o de un directorio. El
programa comprobará si el fichero o el directorio existe físicamente o no y mostrará las
propiedades del fichero o el directorio:

• el nombre del fichero o directorio
• la ruta con la que se creó el objeto File.
• la ruta absoluta asociada al objeto File.
• el directorio padre de File
• si el fichero o directorio existe o no
• Si existe, indicará si:
• Es de escritura:
• Es de lectura:
• Es un directorio:
• Tamaño en bytes del fichero o directorio
     */

public class Ejercicio1 {

    public static Scanner sc = new Scanner(System.in);
    public static String fileName =""; //debemos pedir el nombre se fichero
    public static File fichero=null;

    public static void existeFichero(){

        System.out.println("Introduzca el nombre del fichero que desea crear");
        fileName =sc.nextLine();

        fichero=new File(fileName);

        //Usamos los metodos de la clase File para completar los puntos requeridos del ejercicio

        System.out.println("¿Cuál es la ruta con la que se creó el objeto File?");
        System.out.println(fichero.getPath());

        System.out.println("¿Cuál es la ruta absoluta asociada al objeto File?");
        System.out.println(fichero.getAbsolutePath());

        System.out.println("¿Cuál es el directorio padre de File?");
        System.out.println(fichero.getParent());

        System.out.println("¿El fichero existe?");
            if (!fichero.exists())
                System.out.println("No existe");
            else{
                System.out.println("Sí existe");
                System.out.println("Entonces, ¿de qué tipo es?");
                if (fichero.canRead() && fichero.canWrite()){
                    System.out.println("Es de lectura y escritura");
                }else if (fichero.canWrite()) {
                    System.out.println("Es de escritura");
                }else if (fichero.canRead()){
                    System.out.println("Es de lectura");
                }else if (fichero.isDirectory()){
                    System.out.println("Es un directorio");
                }
            }
        System.out.println("¿Qué tamaño tiene el fichero en bytes?");
        System.out.println(fichero.length());

    }

}
