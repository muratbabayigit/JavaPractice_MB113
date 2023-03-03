package week04;

import java.util.Scanner;

public class P08_forLoop {
    public static void main(String[] args) {
        //verilen bir poztif tam sayinin
        //pozitif tam bolenleriniz yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir pozitif tam sayı giriniz: ");
        int sayi = scan.nextInt();
        if (sayi <= 0) {
            System.out.println("Yanlış Giriş ");
        } else {
            for (int i = 1; i <= sayi; i++) {
                if (sayi % i == 0) {
                    System.out.print(i + " ");
                }

            }
        }


    }
}
