package week03;

import java.util.Scanner;

public class P07_SwitchStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



    /*
    1-Kullanicidan bir rakam alip, rakami yaziyla yazdirin
     */
        System.out.print("Lütfen bir rakam giriniz (0 - 9 ): ");
        int rakam= scan.nextInt();

        switch (rakam) {
            case 0:
                System.out.println("Sıfır");break;
            case 1:
                System.out.println("Bir");break;
            case 2:
                System.out.println("İki");break;
            case 3:
                System.out.println("Üç");break;
            case 4:
                System.out.println("Dört");break;
            case 5:
                System.out.println("Beş");break;
            case 6:
                System.out.println("Altı");break;
            case 7:
                System.out.println("Yedi");break;
            case 8:
                System.out.println("Sekiz");break;
            case 9:
                System.out.println("Dokuz");break;
            default:
                System.out.println("Rakam 0-9 arasında olmalıdır. yanlış değer girdiniz");
        }


       // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        System.out.println("İki basamaklı bir sayı giriniz...:");
        int sayi = scan.nextInt();
        if (sayi>=10 && sayi<=99){
            int birler = sayi%10;
            int onlar = sayi/10;
            switch (onlar){
                case 1:
                    System.out.print("on ");
                    break;
                case 2:
                    System.out.print("yirmi ");
                    break;
                case 3:
                    System.out.print("otuz ");
                    break;
                case 4:
                    System.out.print("kırk ");
                    break;
                case 5:
                    System.out.print("elli ");
                    break;
                case 6:
                    System.out.print("altmış ");
                    break;
                case 7:
                    System.out.print("yetmiş ");
                    break;
                case 8:
                    System.out.print("seksen ");
                    break;
                case 9:
                    System.out.print("doksan ");
                    break;
            }switch (birler){
                case 0:
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.print("bir ");
                    break;
                case 2:
                    System.out.print("iki ");
                    break;
                case 3:
                    System.out.print("üç ");
                    break;
                case 4:
                    System.out.print("dört ");
                    break;
                case 5:
                    System.out.println("beş ");
                    break;
                case 6:
                    System.out.print("altı ");
                    break;
                case 7:
                    System.out.print("yedi ");
                    break;
                case 8:
                    System.out.print("sekiz ");
                    break;
                case 9:
                    System.out.print("dokuz ");
                    break;
            }
        }else{
            System.out.println("Lütfen sadece iki basamaklı sayı giriniz....");
        }


    /*
      2-Kullanicidan ay numarasini alip ay ismini yazdirin
     */
          System.out.print("Lütfen adını merak ettiğiniz ayın numarasını giriniz: ");
          int ay= scan.nextInt();
          switch (ay){
              case 1:
                  System.out.println(" Ocak ");break;
              case 2:
                  System.out.println(" Şubat ");break;
              case 3:
                  System.out.println(" Mart ");break;
              case 4:
                  System.out.println(" Nisan ");break;
              case 5:
                  System.out.println(" Mayıs ");break;
              case 6:
                  System.out.println(" Haziran ");break;
              case 7:
                  System.out.println(" Temmuz ");break;
              case 8:
                  System.out.println(" Ağustos ");break;
              case 9:
                  System.out.println(" Eylül ");break;
                  case 10:
                  System.out.println(" Ekim ");break;
              case 11:
                  System.out.println(" Kasım ");break;
              case 12:
                  System.out.println(" Aralık ");break;
              default:
                  System.out.println("Miladi takvimde 12 Ay vardır. geçersiz bir değer girdiniz.");


          }



    /*
    3-Kullanicidan ay numarasini alip mevsimi yazdirin.
      */
        System.out.print("Lütfen mevsimini öğrenmek istediğiniz ayın numarasını giriniz: ");
        int ayNo= scan.nextInt();
        switch (ayNo){
            case 1: case 2: case 12:
                System.out.println(" Mevsim: Kış ");break;
            case 3: case 4: case 5:
                System.out.println(" Mevsim: İlkbahar "); break;
            case 6: case 7: case 8:
                System.out.println(" Mevsim: Yaz "); break;
            case 9: case 10: case 11:
                System.out.println(" Mevsim: Sonbahar ");break;
            default:
                System.out.println("Miladi takvimde 12 Ay vardır. Geçersiz bir değer girdiniz.");
        }


    /*
    4-Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın
         */
        System.out.print(" Bilgi istediğiniz yılı giriniz: ");
        int year = scan.nextInt();
        System.out.print(" Gün sayısını merak ettiğiniz ayın kaçıncı ay olduğunu giriniz: ");
        int ayNum = scan.nextInt();

        int numdays = 0;

        switch (ayNum) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numdays = 31;
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
                break;


            case 4:
            case 6:
            case 9:
            case 11:
                numdays = 30;
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
                break;
            case 2:
                numdays = ((year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) ? 29 : 28);
                System.out.println("Girdiğiniz yıldaki ayın gün sayısı:" + numdays);
                break;
            default:
                System.out.println("Geçersiz ay");

        }



    }
}