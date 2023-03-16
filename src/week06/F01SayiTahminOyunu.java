package week06;

import java.util.Scanner;

public class F01SayiTahminOyunu {
    static Scanner scan=new Scanner(System.in);
      /*
    Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
    Bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
    bilince de tebrik edip durduran bir kod yazalim
     */
      public static void main(String[] args) {
          int sayi=94;
          System.out.println("Aklımdan 0-100 arası bir tam sayı tuttum. Hadi tahmin et!");
          boolean dogruMu=false;
          while (!dogruMu){
              int tahmin= scan.nextInt();
              if (tahmin>sayi){
                  System.out.println("Girdiğin sayı: "+tahmin+" Ama Çok söyledin, azalt!");
              } else if (tahmin<sayi) {
                  System.out.println("Girdiğin sayı: "+tahmin+" Ama Az söyledin, arttır");

              } else if (tahmin==sayi) {
                  System.out.println("Tebrikler Doğru bildiniz!");
                  dogruMu=true;
              }else{
                  dogruMu=false;
              }


          }

      }
}
