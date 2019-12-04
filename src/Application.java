import Library.DictionnaryName;
import Normalisation.Lexique;
import Normalisation.NormalisationHelper;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    private static String normalisation(String req){
        NormalisationHelper normHelper = new NormalisationHelper();
        Lexique lexique = new Lexique(normHelper);

        System.out.println("Input : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.stoplist);
        System.out.println("After stoplist : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.structure);
        System.out.println("After structure : "+req);
        req = lexique.replaceByLemme(req);
        System.out.println("Output : "+req);
        return req;
    }

    public static void main(String[] arg) {
        String req = "je veux les fichier qui parle de automati de rubrique nice.";
        //req=normalisation(req);
        //antlr
    }
}

