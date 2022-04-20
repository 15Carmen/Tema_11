package ContarVocales2;

import java.io.FileReader;
import java.io.IOException;

public class CountingVocals2 {

    private static String FILE_NAME="input2.txt";
    private static String VOCALS="aeiou";

    public static void run(){
        try{
            CharCounter counter = new CharCounter(VOCALS, false);
            FileReader input = new FileReader(FILE_NAME);
            int c = input.read();

            while (c!=-1) {
                counter.countIfTargeted((char) c);
                c = input.read();
            }
            input.close();
            System.out.println(counter.toString());

            }catch (IOException ex) {
                System.out.println("Ha ocurrido un error!");
        }

    }

}
