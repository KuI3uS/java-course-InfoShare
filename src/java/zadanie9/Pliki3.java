package zadanie9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class Pliki3 {
    public static void main (String []args) throws IOException{
        Random random = new Random();
        for (int i = 1; i < 100 ; i++);
        int liczba = random.nextInt();
//        ▪Napisz program, który wylosuje 100 liczb I zapisze je do pliku.
//▪Wylosuj kolejne 100 liczb
        File file = new File("src/java/zadanie9/loko");
        PrintWriter writer = new PrintWriter(file);
        writer.println (liczba);
        writer.close ();

    }
}
