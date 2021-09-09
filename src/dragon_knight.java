import java.util.Arrays;

public class dragon_knight  {
    public static void main(String[] args) {
        System.out.println("PROGRAM JAVA IMPLEMENTASI DRAGON KNIGHT");
        System.out.println("===================================");

        int[] knight = { 5 };
        Arrays.sort(knight);
        int N = 0;

        int[] dragon = { 5,10 };
        Arrays.sort(dragon);
        int indeksD  = 0;
        for (int x : knight ){
            if (indeksD < dragon.length){
                if (x >= dragon[indeksD]){
                    N += x;
                    indeksD++;
                }
            }
        }

        if (indeksD == dragon.length){
            System.out.println( N);
        }
        else {
            System.out.println("Knight Fall");
        }
    }

}