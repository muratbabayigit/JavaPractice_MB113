package week06;

import java.util.Scanner;

public class F02_WiseMarket {
    static Scanner scan = new Scanner(System.in);
    static String urunAdi;
    static String sepet = "";
    static int urunKodu;
    static int urunFiyati;
    static int urunAdedi;
    static int toplam;
    static boolean ekUrun = false;

    /*
    *
   ====================PROJEMIZ===================================
 ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET
   secime gore ,
   4-urunleri listele ve
   5-fiyatlari gelsin
     */

    public static void main(String[] args) {
        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("=========== WISE MARKET'E HOŞGELDİNİZ ===========");
        System.out.println("------------------ M E N U ------------------ ");
        System.out.println("Lütfen alışveriş yapmak istediğiniz reyonu seçiniz");
        System.out.println("1-Manav Reyonu\n2-Şarküteri Reyonu\n3-Market Reyonu\n4-Fiş Yazdır\n5-Çıkış");
        int secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Lütfen geçerli bir değer giriniz");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    // market();
                    break;
                case 4:
                    // fisYazdir();
                    break;
                case 5:
                    // cikis();
                    break;
                default:
            }
        }
    }

    private static void sarkuteri() {
        System.out.println("Lütfen alacağınız ürün kodunu seciniz:\n6-Kaşar Peyniri 130₺\n7-Zeytin 50₺\n8-Pastırma 450₺\n9-Kıyma 140₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 6 && urunKodu <= 9) {
                System.out.print("Kaç kg alacaksınız: ");
                urunAdedi = scan.nextInt();
                switch (urunKodu){
                    case 6:
                        urunAdi="Kaşar Peyniri";
                        urunFiyati=130;
                        System.out.println(urunAdedi+" kg "+urunAdi+" : "+(urunFiyati*urunAdedi)+" Tl'dir.");
                        break;
                    case 7:
                        urunAdi="Zeytin";
                        urunFiyati=50;
                        System.out.println(urunAdedi+" kg "+urunAdi+" : "+(urunFiyati*urunAdedi)+" Tl'dir.");
                        break;
                    case 8:
                        urunAdi="Pastırma";
                        urunFiyati=450;
                        System.out.println(urunAdedi+" kg "+urunAdi+" : "+(urunFiyati*urunAdedi)+" Tl'dir.");
                        break;
                    case 9:
                        urunAdi="Kıyma";
                        urunFiyati=140;
                        System.out.println(urunAdedi+" kg "+urunAdi+" : "+(urunFiyati*urunAdedi)+" Tl'dir.");
                        break;
                }
                urunFiyati=urunAdedi*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("Toplam Fiyat :"+toplam);
                sepet+=urunAdi+" : "+urunFiyati+"TL'dir";
                System.out.println("Ek ürün almak istiyorsanız ilgili ürün kodunu giriniz. Eğer almak istemiyorsanız 0 tuşuna basınız");

            }else if(urunKodu==0){
                girisEkrani();

            }
        }
    }

    private static void manav() {
        System.out.println("Lütfen alacağınız ürün kodunu seciniz:\n1-Patates - 12₺ \n2-Soğan 12₺\n3-Elma 15₺\n4-Portakal - 20₺\n5-Ananas - 30₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 1 && urunKodu <= 5) {
                System.out.println("Kaç kg alacaksınız?");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 1:
                        urunAdi = "Patates";
                        urunFiyati = 12;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 2:
                        urunAdi = "Soğan";
                        urunFiyati = 12;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 3:
                        urunAdi = "Elma";
                        urunFiyati = 15;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 4:
                        urunAdi = "Portakal";
                        urunFiyati = 20;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 5:
                        urunAdi = "Ananas";
                        urunFiyati = 30;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyatı:" + urunFiyati * urunAdedi + "TL'dir");
                        break;
                }
                urunFiyati = urunFiyati * urunAdedi;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam);
                sepet += urunAdi + ": " + urunFiyati + " TL dir";
                System.out.println(" Başka ürün almak ister misiniz? Eğer başka ürün almak isterseniz lütfen kodunu giriniz!\nAna Menüye dönmek için lütfen 0 (Sıfır) tuşuna basınız");


            } else if (urunKodu == 0) {
                girisEkrani();

            }

        }
    }
}
