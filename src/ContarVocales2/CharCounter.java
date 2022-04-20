package ContarVocales2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharCounter {

    //atributos
    private String vocals;
    private boolean caseSensitive;

    static List<Registro> tablaCaracteres= new ArrayList<>();

    //constructor
    public CharCounter(String vocals, boolean caseSensitive) {
        this.vocals=vocals;
        this.caseSensitive=caseSensitive;
        for (int i = 0; i < this.vocals.length(); i++) {
            tablaCaracteres.add(new Registro(vocals.toUpperCase().charAt(i),0));
        }

    }

    public void countIfTargeted(char c) {
        int indice= Collections.binarySearch(tablaCaracteres,new Registro(c,0));
        if (indice>=0) {
            Registro registro = tablaCaracteres.get(indice);
            registro.incrementa(c);
        }
    }
    public String toString(){
        String cadena="";
        for (Registro registro: tablaCaracteres ) {
            cadena += registro.toString();
        }
        return cadena;
    }
}
