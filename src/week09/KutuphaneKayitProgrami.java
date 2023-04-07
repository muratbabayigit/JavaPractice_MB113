package week09;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class KutuphaneKayitProgrami {
    //Kitap Sınıfı
    static class Kitap {
        String ad;
        String yazaradi;
        String yayinevi;
        int yayinyili;
        static ArrayList<Kitap> kutuphane = new ArrayList<>();

        //Kitap nesnesi yapma
        public Kitap(String ad, String yazaradi, String yayinevi, int yayinyili) {
            this.ad = ad;
            this.yazaradi = yazaradi;
            this.yayinyili = yayinyili;
            this.yayinevi = yayinevi;
        }

        //kitap özelliklerini yazdıran method
        public void kitapYazdir() {
            System.out.println("Kitap Adı: " + ad);
            System.out.println("Yazar Adı: " + yazaradi);
            System.out.println("Yayınevi: " + yayinevi);
            System.out.println("Kitabın Baskı Yılı: " + yayinyili);
        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            //Kütüphane giriş menüsü
            System.out.println("Kütüphane Kayıt Sistemi");
            System.out.println("-------------------------------------");
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            System.out.println("1- Kitap Ekle");
            System.out.println("2- Kitapları Listele");
            System.out.println("3- Sistemden Çık");

            int secim = 0;
            while (secim != 3) {

                System.out.print("Seçiminiz: ");
                secim = scan.nextInt();

                switch (secim) {
                    case 1:
                        System.out.print("Kitap Adı:");
                        String ad = scan.next();
                        System.out.print("Yazar Adı: ");
                        String yazar = scan.next();
                        System.out.print("Yayınevi Adı: ");
                        String yayinevi = scan.next();
                        System.out.print("Kitap Baskı Yılı: ");
                        int yayinyili = scan.nextInt();

                        //girilen bilgileri kutuphane listesine ekleyeceğiz

                        Kitap kitap=new Kitap(ad,yazar,yayinevi,yayinyili);
                        kutuphane.add(kitap);
                        System.out.println("Kitap Başarıyla Eklendi.");

                        break;

                    case 2:
                        System.out.println("Kütüphaneye Eklenmiş Kitaplar Listesi");
                        System.out.println("--------------------------------------------");
                        for (Kitap k :kutuphane){
                            k.kitapYazdir();
                            System.out.println("------------------------------");
                        }
                        break;

                    case 3:
                        System.out.println("Programdan çıkış yapılıyor");
                        break;
                    default:
                        System.out.println("Hatalı giriş yaptınız, Tekrar deneyiniz");
                        break;



                }


            }
            scan.close();
        }
    }
}