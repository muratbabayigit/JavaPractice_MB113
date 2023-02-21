package week02;


import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      /*
      1-Int olarak verilen 3 sayının toplamını double olarak yazdırın
      ipucu: double>float>long>int>short>byte
      */
      double a=3, b=9, c=7;
      double toplam=(a+b+c);
      System.out.println("toplam = " +(int) toplam);




        /*
        2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdırın.
        ipucu: char
         */

        System.out.print("Lütfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);
        System.out.println("Girdiğiniz harf : " + harf);
        System.out.println("Girdiğiniz harften sonraki 3 harf : " + (char) (harf + 1) + ", " + (char) (harf + 2) + ", " + (char) (harf + 3) + "'dir");





        /*
        3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın
        ipucu: sorumluluk bende
         */
        System.out.println("Lütfen iki adet ondalıklı sayı giriniz: ");
        double sayi1 = scan.nextDouble();
        double sayi2= scan.nextDouble();
        int toplam2=(int)(sayi1/sayi2);
        System.out.println(toplam);


    }

}
