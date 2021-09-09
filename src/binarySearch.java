import java.util.Scanner;

public class binarySearch {
    public static int binary_search (int array [], int element, int start, int end) {
        int mid = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (element == array[mid]) {
            return mid;
        }
        if (element < array[mid]) {
            return binary_search(array, element, start, mid = 1);
        } else {
            return binary_search(array, element, mid + 1, end);
        }
    }
    public static void main (String[] args ){
        Scanner sc = new Scanner (System.in);
        System.out.println("PROGRAM JAVA METODE BINARY SEARCH");
        System.out.println("===================================");
        System.out.print("Tentukan panjang array: ");
        int panjang_array;
        panjang_array = sc.nextInt();
        int[] array = new int[panjang_array];

        System.out.println("Masukkan angka pada array: ");
        for(int i=0; i<panjang_array; i++){
            array[i]=sc.nextInt();
        }
        int panjang = array.length;

        System.out.print("Angka yang ingin dicari: ");
        int cari = sc.nextInt();

        int result = binary_search(array, cari,0, panjang);
        if (result == -1)
            System.out.println("Angka yang dicari tidak ditemukan");
        else
            System.out.println("Angka " + cari + " ditemukan pada indeks ke- " + result);
    }
}