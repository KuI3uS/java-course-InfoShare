package zadanie7;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class Pliki1 {
    public static void main (String []args)throws IOException {
        String [] names = {"Adam" , "Juri", "Rafał" , "Milek" , "Piotrek"};
        File pa = new File("src/java/zadanie7/plik");
        PrintWriter printWriter = new PrintWriter(pa);
        for (String name : names){
            printWriter.println (name);
        }
        printWriter.close ();

        }
    }
