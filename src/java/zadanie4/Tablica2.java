package zadanie4;

import java.util.Scanner;

public class Tablica2 {
    public static void main (String []args){


            int x, y;
            Scanner odczyt = new Scanner (System.in);


            String[][] tab = new String[2][4];

            for(int i=0; i<2; i++){
                for(int j=0; j<4; j++){

                    tab[i][j] = "*";
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(odczyt);


        }
    }
