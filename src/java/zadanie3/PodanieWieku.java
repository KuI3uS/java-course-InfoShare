package zadanie3;

import java.util.Scanner;

public class PodanieWieku {
    public static void main(String []args)
    {
//        Poproś użytkownika o podanie wieku, a potem
//        sprawdź czy jest pełnoletni.
//▪Dodatkowe: Zabezpiecz program tak aby przyjmował
//        tylko liczby naturalne, nie większe niż 123 (najdłużej
//        żyjący człowiek - Francuzka Jeanne Calment (1875–
//        1997), która przeżyła 122 lata i 164 dni.)
        int wiek;
        Scanner scanner = new Scanner(System.in);
        System.out.println ( "Podaj wiek:" );
        wiek = scanner.nextInt ();

        if (wiek>17 && wiek < 122) {
            //Jesli masz wiecej niż 18 lat wykonaj kod
            System.out.println ( "jestes pełnoletni" );
        }else if (wiek < 18){
            System.out.println ( "nie jesteś pełnolietni" );

        }

    }
}
