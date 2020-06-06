package zadanie5;

public class Petla3 {
    public static void main(String []args){
//        Pętle – foreach
        int[] array = new int[1000];
        for(int i = 1; i <= array.length ; i++){
            array[i-1] = 1;

        }
        for(int element : array){
            System.out.println ( element );
        }
    }
}
