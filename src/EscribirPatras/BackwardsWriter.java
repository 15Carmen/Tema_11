package EscribirPatras;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BackwardsWriter {

    private static String FICHERO = "backwardsWriter.txt";
    private static Scanner sc = new Scanner(System.in);

    public static void run(){
        String text;
        try{
            System.out.println("Introduzca un texto: ");
            text= sc.nextLine();

            FileWriter output = new FileWriter(FICHERO);
            for(int i=text.length()-1; i>=0; i--){
                output.write(text.charAt(i));
            }
            output.write(System.lineSeparator());

            for(int i=0; i<text.length(); i++){
                output.write(text.charAt(i));
            }
            output.close();
        }catch (IOException ex){
            System.out.println("Algo malo pasó: ");
        }
    }


}
