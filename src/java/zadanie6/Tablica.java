package zadanie6;

import java.util.Random;
import java.util.Scanner;

public class Tablica {

    private static int liczba;

    public static void main (String []args) {

        for (int i = 0; i < 10; i++) {
            System.out.println ( randomBetween ( 1, 10 ) );
        }
    }
        static int  randomBetween(int start , int end){
            Random random = new Random();
            int a1 = random.nextInt (end - start + 1) ;
            int a2 = a1 + start;
            return a2 ;
        }
    }

