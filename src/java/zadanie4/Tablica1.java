package zadanie4;

import java.awt.*;

public class Tablica1 {
    public static void main (String []args){
//        Stwórz tablicę jednowymiarową i umieść w niej dowolne wartości
        int[] array = new int[10];
        int oddSum = 0;

        for (int i = 0; i <= array.length; i++) {
            if (i % 1 == 0) {
                oddSum += i;
            }
        }
        //Wypisz na ekran tylko komórki o indeksie nieparzystym.

       System.out.println ( array );
    }
}
