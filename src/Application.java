import GenerationSQL.*;
import Library.DictionnaryName;
import Normalisation.Lexique;
import Normalisation.NormalisationHelper;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

import java.io.*;
import java.util.Scanner;

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
        String s = "je veux les fichier qui parle de automati et de rubrique nice et de date 20/12/2014.";
        s=normalisation(s);
        //antlr
        Scanner scanner = new Scanner(System.in);
        System.out.print("Requete : ");
        //String s = scanner.nextLine();
        System.out.println(s);
        try {
            tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tal_sqlParser parser = new tal_sqlParser(tokens);
            String arbre = parser.listerequetes();
            System.out.println(arbre);
        }
        catch (Exception e) {
            System.out.println(""+e);
        }
    }
}

