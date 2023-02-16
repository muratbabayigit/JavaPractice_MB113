package week02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

            /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */

        Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen adınızı giriniz: ");
       String name = scan.nextLine();
       System.out.println("Lütfen Soyadınızı giriniz: ");
       String surname = scan.nextLine();
       System.out.println("Lütfen Yaşınızı giriniz: ");
       int yas = scan.nextInt();
       System.out.println("Lütfen E-Posta adresinizi giriniz: ");
       String email = scan.next();
       System.out.println("Lütfen bir şifre belirleyiniz");
       String pass= scan.next();
       System.out.println("*****       KAYIT BAŞARILI      *****");
       System.out.println("Adınız: "+name);
       System.out.println("Soyadınız: "+surname.toUpperCase());
       System.out.println("Yaşınız: "+yas);
       System.out.println("E-Posta Adresiniz: "+email);
       System.out.println("Şifreniz: "+pass);
       System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");
       System.out.println("=============================================== SORU BİTTİ===============================");
       System.out.println("Kullanıcı : "+name.charAt(0)+". "+surname.toUpperCase()+", "+yas);

        /*
        Yukarıda aldığınız bilgileri
         Kullanıcı : T.Yiğit, 42
         şeklinde yazdırın
         */


        /*
        2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
        üçgenin alanını hesaplayıp yazdırın

         */
        int a=100, h=120;
        System.out.println(" Üçgenin alanı: "+(a*h/2));



        /*
        3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
        değiştirin (Swap)
         */
        System.out.println("Lütfen iki adet sayı giriniz: ");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("1. Sayı olarak: "+sayi1+" girdiniz"+
        "\n 2. Sayı olarak: "+sayi2+" girdiniz.");
        System.out.println("----- Hokus Pokus ------");
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2; // sayi2 sayi1'in ilk girilen değerini aldı.
        sayi1=sayi1-sayi2;
        System.out.println("Sayı-1: "+sayi1+"\nSayı-2: "+sayi2);



    }
}