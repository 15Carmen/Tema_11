package ficherosRandom.Ejercicio1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Metodos {

    public static List<Perretes> generarListaPerretes(){
        List<Perretes> listaPerretes = new ArrayList<>();

        listaPerretes.add(new Perretes(1, "Choco", true, "rubio", 4, Perretes.Raza.CORGUI));
        listaPerretes.add(new Perretes(2, "Thor", true, "negro", 3, Perretes.Raza.PASTOR_ALEMAN));
        listaPerretes.add(new Perretes(3, "Moraima", false, "blanco y marrón", 3, Perretes.Raza.PODENCO));

        return listaPerretes;
    }


    //escribimos en el fichero el array
    public static void guardarListaFichero(List <Perretes> lista){

        for (Perretes perro :generarListaPerretes();
             ) {

        }

    }
}
