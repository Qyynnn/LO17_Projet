package Normalisation;

import java.util.*;

import static java.lang.Math.*;

public class Lexique {
    private static HashMap<String, String> dictionnaire = new HashMap<String, String>();
    private static int seuilMax = 3; // Le nombre minimum de lettres d'un mot
    private static int seuilMin = 4; // La différence de longueur entre deux mots
    private static int seuilLettresCommunes = 4;
    private static int proxMin = 70;
    private String filePath = "/Users/yvonne/Documents/GI/GI04/LO17/Projet_Indexation/LO17_Projet/src/files/filtreCorpus_P16.txt";

    public Lexique(StringHelper stringHelper) {
        //dictionnaire = new HashMap<String, String>();
        stringHelper.addFileToDictionnary(filePath, dictionnaire);
    }

    public HashMap<String, String> getDictionnaire(){
        return dictionnaire;
    }

    public float calculProx(String m1, String m2){
        if(m1.length() < seuilMax || m2.length() < seuilMax){
            return 0;
        }
        else if (abs(m1.length() - m2.length()) > seuilMin){
            return 0;
        }
        else {
            int i = 0;
            while (i < min(m1.length(), m2.length()) && (m1.charAt(i) == m2.charAt(i))) {
                i++;
            }
            if (i < seuilLettresCommunes){
                return 0;
            }
            else {
                return (float)i/(max(m1.length(), m2.length()))*100;
            }
        }
    }

    public int levenshtein(String m1, String m2){
        int[][] dis = new int[m1.length()+1][m2.length()+1];

        for (int i = 1; i <= m1.length(); i++){
            dis[i][0] = i;
        }
        for (int j = 1; j <= m2.length(); j++){
            dis[0][j] = j;
        }
        int cost;
        for (int j = 1; j <= m2.length(); j++){
            for (int i = 1; i <= m1.length(); i++){
                if (m1.charAt(i-1) == m2.charAt(j-1)){
                    cost = 0;
                }
                else {
                    cost = 1;
                }
                dis[i][j] = min(min(dis[i-1][j]+1, dis[i][j-1]+1), dis[i-1][j-1]+cost);
            }
        }
        return dis[m1.length()-1][m2.length()-1];
    }

    public ArrayList<String> searchPrefixe(String mot){
        ArrayList<String> listLemme=new ArrayList<String>();
        if (dictionnaire.containsKey(mot)){
            listLemme.add(dictionnaire.get(mot));
            return listLemme;
        }
        else {
            float proxMax = 0;
            for (String motLex : dictionnaire.keySet()) {
                float prox = calculProx(motLex, mot);
                if (prox > proxMin) { //min proximité prise en compte (à partir de 70 par exemple)
                    if (prox > proxMax) { //rechercher la maximum de proximité
                        proxMax = prox;
                        listLemme.clear();
                        listLemme.add(dictionnaire.get(motLex));
                    } else if (prox == proxMax) {
                        listLemme.add(dictionnaire.get(motLex));
                    }
                }
            }
            return listLemme;
        }
    }

    public ArrayList<String> searchLemmeLeven(String mot){
        ArrayList<String> listLemme=new ArrayList<String>();
        for (String motLex : dictionnaire.keySet()) {
            int distance = levenshtein(motLex, mot);
            if (distance <= 3) {
                listLemme.add(dictionnaire.get(motLex));
            }
        }
        return removeDuplicate(listLemme);
    }

    public ArrayList<String> removeDuplicate(ArrayList<String> list){
        //Constructing LinkedHashSet using list
        LinkedHashSet<String> set = new LinkedHashSet<String>(list);
        //Constructing list without duplicate using set
        return new ArrayList<String>(set);
    }

    public ArrayList<String> searchLemme(String mot){
        ArrayList<String> listLemme=new ArrayList<String>();
        listLemme = searchPrefixe(mot);
        if(listLemme.isEmpty()){
            listLemme = searchLemmeLeven(mot);
            if(listLemme.isEmpty()){
                System.out.println("Aucun mot n'a été trouvé");
                return listLemme;
            }
        }
        System.out.println("liste de lemmes candidats : " + listLemme);
        return listLemme;
    }



/*
    public ArrayList<String> searchLemme(String mot){
        ArrayList<String> listLemme=new ArrayList<String>();
        if (dictionnaire.containsKey(mot)){
            listLemme.add(dictionnaire.get(mot));
            return listLemme;
        }
        else{
            float proxMax = 0;
            for (String motLex:dictionnaire.keySet()) {
                float prox = calculProx(motLex, mot);
                if (prox > proxMin){ //min proximité prise en compte (à partir de 70 par exemple)
                    if (prox > proxMax){ //rechercher la maximum de proximité
                        proxMax = prox;
                        listLemme.clear();
                        listLemme.add(dictionnaire.get(motLex));
                    }
                    else if (prox == proxMax){
                        listLemme.add(dictionnaire.get(motLex));
                    }
                }
                else {
                    int distance = levenshtein(motLex, mot);
                    if (distance <= 3){
                        listLemme.add(dictionnaire.get(motLex));
                    }

                }
            }
            return listLemme;
        }
    }
  */



}
