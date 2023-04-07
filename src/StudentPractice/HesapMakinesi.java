package StudentPractice;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        System.out.println("Lütfen Yapmak İstediğiniz İşlemi seçiniz\n 1- Toplama\n 2- Çıkarma \n 3- Çarpma\n 4-Bölme");
        Scanner scan=new Scanner(System.in);
        int islem;
        System.out.print("Seçilen İşlem: ");
        islem= scan.nextInt();
        System.out.println("");
        System.out.print("İlk sayıyı giriniz: ");
        double sayi1, sayi2, sonuc;
        sayi1= scan.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2= scan.nextDouble();
        switch (islem){
            case 1:
                sonuc=sayi1+sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            case 2:
                sonuc=sayi1-sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            case 3:
                sonuc=sayi1*sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            case 4:
                sonuc=sayi1/sayi2;
                System.out.println("İşlem Sonucu: "+sonuc);
                break;
            default:
                System.out.println("Geçersiz işlem girdiniz!...");
        }

    }
}
