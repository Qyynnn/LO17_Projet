package Normalisation;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class StringHelper {
    private static HashMap<String,String> structureDic=new HashMap<>();
    private static HashMap<String,String> stoplistDic=new HashMap<>();
    private static String structurePath="/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/structure.txt";
    private static String stoplistPath="/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/stoplist_P16.txt";

    public StringHelper(){
        addFileToDictionnary(structurePath,structureDic);
        addFileToDictionnary(stoplistPath,stoplistDic);
    }


    public boolean existInDic(String s,String dicStr){
        HashMap<String,String> dic=new HashMap<>();
        switch (dicStr){
            case "stoplist":
                dic=stoplistDic;
                break;
            case "structure":
                dic=structureDic;
        }
        if (dic.containsKey(s)){
            return true;
        }
        return false;
    }

    public String getValueOfDic(String s,String dicStr){
        HashMap<String,String> dic=new HashMap<>();
        switch (dicStr){
            case "stoplist":
                dic=stoplistDic;
                break;
            case "structure":
                dic=structureDic;
        }
        return dic.get(s);
    }

    public String replaceFromFile(String s,String dicStr){
        BufferedReader br=null;
        String chaine;
        String mot;
        String replacement;
        String result="";
        ArrayList<String> strList=new ArrayList<>();
        HashMap<String,String> dic=new HashMap<>();
        try {
            try {
                String[] strSplit=s.split("\\s");
                for (String str:
                     strSplit) {
                    if (existInDic(str,dicStr)){
                        String value=getValueOfDic(str,dicStr);
                        if (!value.isEmpty()){
                            strList.add(value);
                        }
                    }
                    else{
                        strList.add(str);
                    }
                }
                result=String.join(" ",strList);
            }
            catch(Exception e) {
                System.out.println("erreur while replacing"+e);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public void addFileToDictionnary(String file, HashMap<String,String> dic){
        BufferedReader br=null;
        String chaine;
        String mot;
        String lemme;
        try {
            try {
                br = new BufferedReader(new FileReader(file));
                while ((chaine=br.readLine())!=null) {
                    String[] split = chaine.split("\\t");
                    mot = split[0].trim();
                    if (split.length==1){
                        dic.put(mot,"");
                    }
                    else{
                        lemme = split[1].trim();
                        dic.put(mot, lemme); //ajouter les mots-lemmes dans la dictionnaire
                    }
                }
            }
            catch(EOFException e) {
                br.close();
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("fichier inconnu : " + file);
        }
        catch(IOException e) {
            System.out.println("IO Exception");
        }
    }
}
