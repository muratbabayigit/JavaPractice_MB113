package week03;


import javax.swing.*;
import java.util.Scanner;

public class P06_TernaryOperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */
         System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz: (her girişinizde lütfen enter tuşuna basınız.)");
         System.out.print("1.kenar uzunluğu: ");
         int kenar1=scan.nextInt();
         System.out.print("2.kenar uzunluğu: ");
         int kenar2=scan.nextInt();
         System.out.print("3.kenar uzunluğu: ");
         int kenar3=scan.nextInt();
         //System.out.println(kenar1>0?(kenar1 == kenar2 && kenar1 == kenar3 ? "Eşkenar Üçgen" : "Eşkenar Üçgen Değildir."):"Yanlış giriş yaptınız");
         System.out.println(kenar1>0&&kenar2>0&&kenar3>0?
                 (kenar1 == kenar2 && kenar1 == kenar3 ? "Eskenar ucgen" : "Eskenar degil"): "Yanlis giris");
        



        /*

        2- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin, yoksa girilen harfi yazdirin
        */

        System.out.print("Lütfen bir harf giriniz: ");
        char harf=scan.next().toUpperCase().charAt(0);
       System.out.println((harf >= 97 && harf <= 122) ? (char) (harf - 32) : harf);
       System.out.println((harf >= 'a' && harf <= 'z' ? (char)(harf - 32): harf));
        System.out.println(harf >= 'a' && harf <= 'z' ? Character.toUpperCase(harf) : harf);
        System.out.println("harf = " + harf);



        /*

        3-Kullanicidan iki adet sayi isteyin ve büyük olmayan sayiyi yazdirin

         */

      System.out.println("Lütfen iki sayı girin: ");
      System.out.print("1. Sayı: ");
      double sayi1 = scan.nextDouble();
      System.out.print("2. Sayı: ");
      double sayi2 = scan.nextDouble();
      System.out.println(sayi1 > sayi2 ? "Büyük olmayan Sayı: " + sayi2 : "Büyük olmayan sayı: " + sayi1);



        /*
        4-Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.
         */
        System.out.print("Lütfen notunuzu giriniz: ");
        double not= scan.nextDouble();
        System.out.println(not >= 50 ? "Sınıfı " + not + " ortalaması ile geçtiniz." : "Maalesef " + not + " ortlama ile kaldınız.");


    }

}
