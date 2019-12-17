import GenerationSQL.*;
import Library.DictionnaryName;
import Normalisation.Lexique;
import Normalisation.NormalisationHelper;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import Interrogation.*;
import java.io.*;
import java.util.Scanner;

public class Application {
    private static String normalisation(String req){
        NormalisationHelper normHelper = new NormalisationHelper();

        System.out.println("Input : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.stoplist);
        System.out.println("After stoplist : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.structure);
        System.out.println("After structure : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.lexique);
        System.out.println("Output : "+req);
        return req;
    }

    public static void main(String[] arg) {
        String s = "articles ont été publiés au mois decembre";
        //antlr
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Requete : ");
        //String s = scanner.nextLine();
        while (!s.equals("*")){
            s=s.toLowerCase();
            s=s.trim();
            if (s.charAt(s.length()-1)!='.' || s.charAt(s.length()-1)!='?' ){
                s=s+'.';
            }
            s=normalisation(s);
            System.out.println(s);
            try {
                tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(s)));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                tal_sqlParser parser = new tal_sqlParser(tokens);
                String arbre = parser.listerequetes();
                System.out.println(arbre);
                //interrogPostgresql.interroger(arbre);
            }
            catch (Exception e) {
                System.out.println(""+e);
            }
            //s = scanner.nextLine();
            s="*";
        }

    }
}

