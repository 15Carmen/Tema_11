package Buffer;

import java.io.*;


public class HowlerMaker {

    public static void escribirBuffer() throws IOException {
        String texto="";
        BufferedWriter bw = null;
        try{
            bw=new BufferedWriter(new FileWriter("howler.txt"));
            //Escribimos en el fichero
            bw.write(texto.toUpperCase());
            bw.newLine();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }finally {
            bw.close();
        }
    }
    public static void leerBuffer(){
        try{
            BufferedReader br=new BufferedReader(new FileReader("mail.txt"));
            //Leemos el fichero y lo mostramos por pantalla
            String linea=br.readLine();
            int conta_linea=0;
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
                conta_linea++;
            }
            System.out.println("la cadena de texto tiene "+conta_linea +" lineas");
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
}

