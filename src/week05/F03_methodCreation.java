package week05;

import java.util.Scanner;

public class F03_methodCreation {
    /*
    Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    sonuclarini donduren bir method olusturun.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayi= scan.nextInt();
        System.out.println(asalSayiKontrolEt(sayi));
    }

    private static String asalSayiKontrolEt(int sayi) {
        String sonuc="sayı asal sayıdır";
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sonuc="sayı asal sayı değildir";
            }
            }

        return sonuc;
    }


}
