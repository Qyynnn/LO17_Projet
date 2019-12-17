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
        req=req.toLowerCase();
        req=req.trim();
        if (req.charAt(req.length()-1)!='.' && req.charAt(req.length()-1)!='?' ){
            req=req+'.';
        }
        System.out.println("Input : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.stoplist);
        System.out.println("After stoplist : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.structure);
        System.out.println("After structure : "+req);
        req = normHelper.replaceFromDic(req, DictionnaryName.lexique);
        System.out.println("Output : "+req);
        return req;
    }

    private static String generateSQL(String req){
        try {
            tal_sqlLexer lexer = new tal_sqlLexer(new ANTLRReaderStream(new StringReader(req)));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tal_sqlParser parser = new tal_sqlParser(tokens);
            return parser.listerequetes();
        }
        catch (Exception e) {
            System.out.println(""+e);
            return req;
        }
    }

    public static void main(String[] arg) {
        String s = "Quel est le auteur d’articles parus entre le 3 mars 2013 et le 4 mai 2013";
        //antlr
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Requete : ");
        //String s = scanner.nextLine();
        while (!s.equals("*")){
            s=normalisation(s);
            System.out.println(s);
            s=generateSQL(s);
            System.out.println(s);
            interrogPostgresql.interroger(s);
            //s = scanner.nextLine();
            s="*";
        }

    }
}

