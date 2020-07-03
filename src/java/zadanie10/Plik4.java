package zadanie10;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Plik4 {
//    Napisz program, który pobierze od użytkownika tekst I zapisze go do pliku
//    od tyłu.
    public static void main(String []args)throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println ( "Podaj tekst:" );
        String name = scanner.nextLine();
        char[] chars = name.toCharArray();

        File file = new File("src/java/zadanie10/plik");
        PrintWriter writer = new PrintWriter(file);
        for (int i = chars.length - 1 ; i >= 0 ; i--){
            writer.print (chars[i]);
        }

        writer.close ();
    }
}
