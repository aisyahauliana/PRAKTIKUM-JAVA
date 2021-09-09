import java.util.Scanner;

public class bilangan_prima {

    public static void main (String[] args ){

        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM JAVA MENENTUKAN BILANGAN PRIMA");
        System.out.println("======================================");
        System.out.print("Masukkan Angka: ");

        int angka = input.nextInt();
        boolean prima = true;

        for(int pembagi = 2; pembagi <= angka / 2; pembagi++){

            if(angka % pembagi == 0 ){
                prima = false;
                break;
            }

        }

        if(prima && (angka > 1 ))
            System.out.println(angka + " adalah bilangan prima");
        else
            System.out.println(angka + " bukan bilangan prima");

    }

}