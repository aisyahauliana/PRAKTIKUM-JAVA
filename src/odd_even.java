public class odd_even {
        public static void main(String[] args) {
            int [] bil = {2, 4, 100, 24256, 984573, 435729, 11111, 12345678, 663824, 357286411, 55576822};
            System.out.println("PROGRAM JAVA MENENTUKAN BILANGAN GANJIL GENAP");
            System.out.println("===============================================");
            System.out.print("Bilangan Genap  :  ");
            for (int i = 0; i < bil.length; i++){
                if (bil [i] % 2 == 0) {
                    System.out.print(bil[i] + " ");
                }
            }
            System.out.println("");
            System.out.print("Bilangan Ganjil :  ");
            for (int i = 0; i < bil.length; i++){
                if (bil [i] % 2!= 0){
                    System.out.print(bil[i] + " ");
                }
            }
            System.out.println("");
        }
    }


