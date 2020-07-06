package zadanie8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class Pliki {
    public static void main(String []args) throws IOException{
        Scanner scanner = new Scanner(System.in);
//        ▪Poproś użytkownika o podanie imienia i nazwiska, a następnie zapisz te
//        informacje do pliku.
        System.out.println ( "Podaj nazwe:" );
        String name = scanner.nextLine();
        File plik = new File("src/java/zadanie8/elo");
        PrintWriter writer = new PrintWriter(plik);
        writer.println(name);
        writer.close();

    }

}
