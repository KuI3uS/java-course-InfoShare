package zadanie1;

import java.awt.*;
import java.util.Scanner;

public class Zadanie1 {
    public static void main (String[]args){
        // Napiasz program który wypisuje twoje imie i nazwisko
//       1. System.out.println ( "Jakub Marcinkowski");

//       2. System.out.println ( "Jakub" );
//        System.out.println ( "Marcinkowski" );

        //Napisz program, który wypisze Twój wiek, a w nowej
        //linii wypisze Twoje rodzinne miasto

//        int a = 21;
//        System.out.println ( a );
//        System.out.println ( "trzcianka" );

        //▪Napisz program, który doda dwie liczby, odejmie dwie
        //liczby, podzieli dwie liczby i przemnoży dwie liczby.
        //▪Każdy wynik wypisz na ekran!
        //▪Ciekawostka:
        //▪Spróbuj podzielić przez zero i zobacz co się stanie ;)


        int pierwsza_l;
        int druga_l;
        char znak;
        Scanner kal = new Scanner(System.in);
        System.out.println ( "Podaj pierwsza liczbe" );
        pierwsza_l = kal.nextInt();
        System.out.println ( "podaj druga liczbe" );
        druga_l = kal.nextInt();

        System.out.println("Dodawanie dwóch liczb - wciśnij +");
        System.out.println("Odejmowanie dwóch liczb - wciśnij -");
        System.out.println("Mnożenie dwóch liczb - wciśnij *");
        System.out.println("Dzielenie dwóch liczb - wciśnij /");

        znak = kal.next ().charAt ( 0 );

        switch (znak){
            case '+':
            {
                System.out.println ( pierwsza_l + druga_l );
                break;
            }
            case '-':
            {
                System.out.println ( pierwsza_l - druga_l );
                break;
            }
            case '*':
            {
                System.out.println ( pierwsza_l * druga_l );
            }
            case '/': {
                if (druga_l != 0) {
                    System.out.println ( pierwsza_l / druga_l);
                } else {
                    System.out.println ( "Nie dzielimy przez zero!!!" );
                }
                break;
            }
            
        }
    }
}
