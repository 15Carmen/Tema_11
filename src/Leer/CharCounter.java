package Leer;

public class CharCounter {

    //atributos
    private String vocales;
    private boolean caseSensitive;
    private int numeroVocales;
    private boolean ignorarMayusculas;


    //constructor
    public CharCounter(String vocales, boolean caseSensitive) {
        this.vocales = vocales;
        this.caseSensitive = caseSensitive;
    }


    public void countIfTargeted(char c) {
        if (this.ignorarMayusculas) {
            if (vocales.toLowerCase().contains(Character.toString(c).toLowerCase())) {
                numeroVocales++;
            }
        } else {
            if (vocales.contains(Character.toString(c))) {
                numeroVocales++;
            }
        }

    }

    @Override
    public String toString() {
        return numeroVocales + " vocales";
    }
}