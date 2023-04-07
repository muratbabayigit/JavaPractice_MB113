package week09;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int userchoice=0;
        int sonuc=0;

        while (userchoice!=5){
            //Giriş menüsünü yazdıralım
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
            System.out.println("1-Toplama");
            System.out.println("2-Çıkarma");
            System.out.println("3-Çarpma");
            System.out.println("4-Bölme");
            System.out.println("5-Çıkış");
            userchoice= scan.nextInt();

                if (userchoice>=1 &&userchoice<=4){
                System.out.println("Lütfen iki sayı giriniz:");
                System.out.print("Birinci Sayı: ");
                int sayi1= scan.nextInt();
                System.out.println("İkinci Sayı: ");
                int sayi2= scan.nextInt();
                if (userchoice==1) {
                    sonuc = sayi1 + sayi2;

                }else if (userchoice==2) {
                    sonuc = sayi1 - sayi2;
                }else if (userchoice==3) {
                    sonuc = sayi1 * sayi2;
                }else if (userchoice==4){
                    sonuc=sayi1/sayi2;
                }
                    System.out.println("İşlem Sonucu="+ sonuc);
                } else if (userchoice==5) {
                    System.out.println("Program sonlandırıldı");

                }else{
                    System.out.println("Geçersiz seçim yaptınız.");

        }
                }
            }

        }

