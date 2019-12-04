package Normalisation;

import java.io.*;

public class Cat{
    public static void run(String args) {
        BufferedReader br=null;
        String chaine;
        try {
            try {
                br = new BufferedReader(new FileReader(args));
                while ((chaine=br.readLine())!=null)
                    System.out.println(chaine);
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("fichier inconnu : " + args);
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }
}