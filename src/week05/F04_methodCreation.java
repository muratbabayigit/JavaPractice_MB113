package week05;

import java.util.Scanner;

public class F04_methodCreation {
    /*
    Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
    bolenleri sayisini bulup bize donduren bir method olusturun.

    */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz: ");
        int sayi= scan.nextInt();

        System.out.println(pozitifBolenleriBulma(sayi));

    }

    private static int pozitifBolenleriBulma(int sayi) {
        int sayac=0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                sayac++;
            }

        }
        return sayac;
    }


}
