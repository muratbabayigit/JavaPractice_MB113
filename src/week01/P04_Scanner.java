package week01;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */
        System.out.println("Lutfen adinizi giriniz: ");
        String name = scan.next();
        System.out.println("Lutfen soyadinizi giriniz : ");
        String surname = scan.next();
        System.out.println("Lutfen yasinizi giriniz: ");
        int age = scan.nextInt();
        System.out.println("E-posta adresinizi giriniz:");
        String mail = scan.next();
        System.out.println("Lutfen Sifrenizi giriniz:");
        String pass= scan.next();
        System.out.println("*****       KAYIT BAŞARILI      *****\n"+"\tAdiniz :"+name+"\n\tSoyadiniz: "+surname+
                "\n\tYasınız:"+age+"\n\tMail Adresiniz:"+mail+"\n\tSifreniz:"+pass+"\nşeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");
    }



}
