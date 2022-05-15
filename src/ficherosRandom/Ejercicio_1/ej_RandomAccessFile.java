package ficherosRandom.Ejercicio_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ej_RandomAccessFile {

    public static void escribir() {

        try (RandomAccessFile randomAccessFile = new RandomAccessFile("random.dat", "rw")) {
            randomAccessFile.write(1);
            randomAccessFile.write(2);
            randomAccessFile.write(3);
            randomAccessFile.write(4);

            randomAccessFile.writeLong(5);
            randomAccessFile.writeLong(6);
            randomAccessFile.writeLong(7);
            randomAccessFile.writeLong(8);

            randomAccessFile.writeInt(10);
            randomAccessFile.writeInt(20);
            randomAccessFile.writeInt(30);
            randomAccessFile.writeInt(40);

            /*

            //otra forma de hacerlo en un mismo try

            randomAccessFile.seek(0);

            System.out.println(randomAccessFile.read());
            System.out.println(randomAccessFile.read());
            System.out.println(randomAccessFile.read());
            System.out.println(randomAccessFile.read());

            System.out.println(randomAccessFile.readLong());
            System.out.println(randomAccessFile.readLong());
            System.out.println(randomAccessFile.readLong());
            System.out.println(randomAccessFile.readLong());

            System.out.println(randomAccessFile.readInt());
            System.out.println(randomAccessFile.readInt());
            System.out.println(randomAccessFile.readInt());
            System.out.println(randomAccessFile.readInt());
*/
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println("Error!!");
        }

    }

    public static void leer(){
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("random.dat", "rw")){

            System.out.println(randomAccessFile.read());
            System.out.println(randomAccessFile.read());
            System.out.println(randomAccessFile.read());
            System.out.println(randomAccessFile.read());

            System.out.println(randomAccessFile.readLong());
            System.out.println(randomAccessFile.readLong());
            System.out.println(randomAccessFile.readLong());
            System.out.println(randomAccessFile.readLong());

            System.out.println(randomAccessFile.readInt());
            System.out.println(randomAccessFile.readInt());
            System.out.println(randomAccessFile.readInt());
            System.out.println(randomAccessFile.readInt());

        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido encontrar la clase");
        } catch (IOException e) {
            System.out.println("Error!!");;
        }
    }

}
