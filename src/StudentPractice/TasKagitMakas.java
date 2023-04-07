package StudentPractice;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    // Bilgisayara karsi tas kagit makas oyunu oynayin
    // 5 puana ilk ulasan oyunu kazanir


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoise = 0;
        int compChoise = 0;
        int user = 0;
        int comp = 0;

       do {
           System.out.println("Aşağıdakilerden birini seç: \n 1- Taş     2- Kağıt     3- Makas");

           //Kullanıcının seçim yapmasını istiyoruz
           userChoise = scan.nextInt();

           //Bilgisayarın seçim yapmasını sağlayalım

           compChoise = random.nextInt(3) + 1;  //burada [0-3) arasında değer seçer. bizde +1 ile 1,2,3'den birini seçmesini sağladık

           if (userChoise == 1 && compChoise == 2) {
               System.out.println("Bilgisayarın seçtiği: "+compChoise);
               System.out.println("");
               System.out.println("Kağıt taşı sarar -- Bilgisayar +1");
               comp++;
               System.out.println("Oyuncu: " + user + "  Bilgisayar: " + comp);
               System.out.println(" ");
           } else if (userChoise == 1 && compChoise == 3) {
               System.out.println("Bilgisayarın seçtiği: "+compChoise);
               System.out.println("");
               System.out.println("Taş makası kırar  -- Oyuncu +1");
               user++;
               System.out.println("Oyuncu: " + user + "  Bilgisayar: " + comp);
           } else if (userChoise == 2 && compChoise == 1) {
               System.out.println("Bilgisayarın seçtiği: "+compChoise);
               System.out.println("");
               System.out.println("Kağıt taşı sarar  -- Oyuncu +1");
               user++;
               System.out.println("Oyuncu: " + user + "  Bilgisayar: " + comp);
               System.out.println(" ");
           } else if (userChoise == 2 && compChoise == 3) {
               System.out.println("Bilgisayarın seçtiği: "+compChoise);
               System.out.println("");
               System.out.println("Makas kağıdı keser  -- Bilgisayar +1");
               comp++;
               System.out.println("Oyuncu: " + user + "  Bilgisayar: " + comp);
               System.out.println(" ");
           } else if (userChoise == 3 && compChoise == 1) {
               System.out.println("Bilgisayarın seçtiği: "+compChoise);
               System.out.println("");
               System.out.println("Taş makası kırar  -- Bilgisayar +1");
               comp++;
               System.out.println("Oyuncu: " + user + "  Bilgisayar: " + comp);
               System.out.println(" ");
           } else if (userChoise == 3 && compChoise == 2) {
               System.out.println("Bilgisayarın seçtiği: "+compChoise);
               System.out.println("");
               System.out.println("Makas kağıdı keser  -- Oyuncu +1");
               user++;
               System.out.println("Oyuncu: " + user + "  Bilgisayar: " + comp);
               System.out.println(" ");
           } else {
               System.out.println("Bilgisayarda"+userChoise+" Seçti. Berabere, Kimse puan alamadı");
               System.out.println("Oyuncu: " + user + "  Bilgisayar: " + comp);
               System.out.println(" ");
           }
       }while(user!=5 && comp!=5);
       {
            //kazananı gösterelim
            if (user>comp){
                System.out.println("-------- Tebrikler Siz Kazandınız ---------");
            }else{
                System.out.println("-------- Maalesef Kaybettiniz! ---------");
            };
            scan.close();
        }
    }
}
