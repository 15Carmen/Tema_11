package ficherosRandom.Ejercicio_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //creamos un arrayList donde vamos a almacenar la información de los perros
        List<Perretes> listaPerretes = new ArrayList<>();

        //añadimos la información al arrayList
        listaPerretes.add(new Perretes(1, "Choco", true, "rubio", 4, "corgui"));
        listaPerretes.add(new Perretes(2, "Thor", true, "negro", 3, "pastor aleman"));
        listaPerretes.add(new Perretes(3, "Moraima", false, "blanco", 4, "podenco bodeguero"));

        //esta información vamos a introducirla en un archivo random
        //Usamos un try con condición para crear el fichero random para así no tener que cerrarlo al final
        //con un finally


        try (RandomAccessFile raf = new RandomAccessFile("perretes.dat", "rw")) {
            //para introducir los datos en el fichero random usamos un for each
            for (Perretes perretes : listaPerretes) {

                raf.writeInt(perretes.getId()); //4 bytes

                StringBuffer sb = new StringBuffer(perretes.getNombre());
                sb.setLength(10); //20 bytes
                raf.writeChars(sb.toString());

                raf.writeBoolean(perretes.isConChapa()); //2 byte

                StringBuffer stringBuffer = new StringBuffer(perretes.getColor());
                stringBuffer.setLength(10); //20 bytes
                raf.writeChars(stringBuffer.toString());

                raf.writeInt(perretes.edad); //4 bytes

                StringBuffer stringBuffer2 = new StringBuffer(perretes.getRaza());
                stringBuffer2.setLength(20); //40 bytes
                raf.writeChars(stringBuffer2.toString());

                // 4+20+1+20+4+40 = 89 bytes cada registro
            }

            //Ponemos el puntero al principio del archivo
            raf.seek(0);

            //primer perrete
            System.out.println(raf.readInt());

            String nombre = "";
            for (int i = 0; i < 10; i++) {
                nombre += raf.readChar();
            }
            System.out.println(nombre);

            System.out.println(raf.readBoolean());

            String color = "";
            for (int i = 0; i < 10; i++) {
                color += raf.readChar();
            }
            System.out.println(color);

            System.out.println(raf.readInt());

            String raza = "";
            for (int i = 0; i < 20; i++) {
                raza += raf.readChar();
            }
            System.out.println(raza);

            System.out.println("======");

            //segundo perrete

            raf.seek(89);
           System.out.println(raf.readInt());

            String nombre2 = "";
            for (int i = 0; i < 10; i++) {
                nombre2 += raf.readChar();
            }
            System.out.println(nombre2);

            System.out.println(raf.readBoolean());

            String color2 = "";
            for (int i = 0; i < 10; i++) {
                color2 += raf.readChar();
            }
            System.out.println(color2);

            System.out.println(raf.readInt());

            String raza2 = "";
            for (int i = 0; i < 20; i++) {
                raza2 += raf.readChar();
            }
            System.out.println(raza2);

            System.out.println("======");

            //tercer perrete
            raf.seek(178);
            System.out.println(raf.readInt());

            String nombre3 = "";
            for (int i = 0; i < 10; i++) {
                nombre3 += raf.readChar();
            }
            System.out.println(nombre3);

            System.out.println(raf.readBoolean());

            String color3 = "";
            for (int i = 0; i < 10; i++) {
                color3 += raf.readChar();
            }
            System.out.println(color3);

            System.out.println(raf.readInt());

            String raza3 = "";
            for (int i = 0; i < 20; i++) {
                raza3 += raf.readChar();
            }
            System.out.println(raza3);

            //para ver el arrayList de los perretes bonito con el toString
            //System.out.println(listaPerretes);

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error en la entrada o salida de datos");
        }
    }


}
