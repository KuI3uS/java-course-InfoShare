package zadanie6;

import java.util.Random;
import java.util.Scanner;

public class RandomLiczby {

    private static int liczba;

    public static void main (String []args) {


        for (int i = 0; i < 1; i++) {
            Scanner scanner = new Scanner ( System.in );
            System.out.println ("podaj liczbe od 1-10:");
            liczba = scanner.nextInt ();
            System.out.println ( randomBetween ( 1, 10 ) );

        }
    }
        static int  randomBetween(int start , int end){
            java.util.Random random = new java.util.Random ();
            int a1 = random.nextInt (end - start + 1) ;
            int a2 = a1 + start;
            return a2 ;
        }
    }

