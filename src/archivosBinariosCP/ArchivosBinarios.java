package archivosBinariosCP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArchivosBinarios {


    public static void main(String[] args) {

        String path="alumnos_1.dat";
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese nombre de Archivo");
        String path_aux=teclado.nextLine();
        if(!path_aux.equals("")){
            path=path_aux;
        }
        añadirDatos(path);
        leerArchivo(path);
        System.exit(0);

    }

    public static void leerArchivo(String path){

        Alumnos al;
        //String NIF, nombre, apellidos;
        //int edad;
        System.out.println("LECTURA ARCHIVO");
        try {
            //FileInputStream archivo = new FileInputStream(path);//abrimos el flujo de entrada
            //ObjectInputStream lectura = new ObjectInputStream(archivo);//usamos el ObjectInputStream para leer objetos del archivo
            File archivo;//inicializamos el objeto de tipo File
            archivo = new File(path);

            FileInputStream fis = new FileInputStream(archivo); //abrimos el flujo de entrada de datos

            if (archivo != null){ //ponemos el condicional para que compruebe si el fichero esta vacio o no
                while (fis.available()>0){
                    ObjectInputStream entrada = new ObjectInputStream(fis); //establecemos la entrada de datos en el objeto
                    al = (Alumnos) entrada.readObject(); //leemos los datos del objeto
                    System.out.println(al.toString()); //imprimimos por pantalla los resultados
                }
                fis.close(); //cerramos el flujo de entrada
            }
            //capturamos las excepciones
        }catch (FileNotFoundException ex) {
            System.err.println("Error, " + ex);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("Error, " + ex);
        }
    }

    public static void añadirDatos(String path){
        String NIF, nombre, apellidos;
        int edad;
        Alumnos al = null;//inicializamos a null el objeto creado
        FileOutputStream fos=null;
        ObjectOutputStream escribir=null;
        //ArrayList<Alumnos> listaAlumnos=new ArrayList<Alumnos>();
        File archivo=new File(path);
        int pos=1;
        try {
            Scanner teclado=new Scanner(System.in);
            //grabar en el archivo en formato binario
            fos=new FileOutputStream(archivo,true);//agrega al final el flag=true
            //grabar el objeto alumnos
            escribir = new ObjectOutputStream(fos);
            do{
                System.out.println("Numero de objetos a guardar "+pos);
                System.out.println("Ingrese NIF");
                NIF=teclado.nextLine();
                System.out.println("Ingrese Nombre");
                nombre=teclado.nextLine();
                System.out.println("Ingrese Apellidos");
                apellidos=teclado.nextLine();
                System.out.println("Ingrese edad");
                //teclado.nextLine();//vacia buffer
                edad=teclado.nextInt();
                teclado.nextLine();//vacia buffer

                al = new Alumnos(nombre,apellidos,edad,NIF);//creamos el objeto
                //listaAlumnos.add(al);
                System.out.println("grabando en el archivo.....");
                escribir.writeObject(al); //escribimos objetos en el archivo
                System.out.println("Se ha grabado el objeto Alumnos "+pos);
                pos++;
            }while(pos<=2);


            System.out.println("Se ha cerrado el archivo!!");
            //capturamos las excepciones
            //capturamos las excepciones
        } catch (IOException ex) {
            System.err.println("Error," + ex);
        }
        finally
        {
            //importante cerrar las instancias FileOutputStream y ObjectOutput Stream
            if (escribir != null)
            {
                try
                {
                    escribir.close();//cerramos el objeto
                }
                catch (IOException e)
                {
                    System.err.println("Error," + e);
                }
            }
            if (fos != null)
            {
                try
                {
                    fos.close();//cerramos el archivo
                }
                catch (IOException e)
                {
                    System.err.println("Error," + e);
                }
            }
        }
    }

}
