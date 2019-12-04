package Normalisation;

import java.io.*;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;

public class Application {
    public static String readInput(){
        BufferedReader br=null;
        String chaine = "";
        try {
            try {
                br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("saisie : ");
                chaine=br.readLine();
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
        return chaine;
    }


    public static void main(String[] arg){
        StringHelper stringHelper=new StringHelper();
        Lexique lexique = new Lexique(stringHelper);

        String req="je veux les fichier qui parle de automati de rubrique shit.";
        String structurePath="/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/structure.txtt";
        String stoplistPath="/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/stoplist_P16.txt";

        req = stringHelper.replaceFromFile(req,"stoplist");
        req = stringHelper.replaceFromFile(req,"structure");




        //System.out.println(lexique.searchLemme("automatisenenlkfsj"));
        System.out.println(req);
    }
}

