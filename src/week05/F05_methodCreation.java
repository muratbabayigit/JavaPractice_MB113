package week05;

import java.util.Scanner;

public class F05_methodCreation {
       /*
    Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
    bolenleri toplamını bulup bize donduren bir method olusturun.

    */
       public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           System.out.print("Lütfen pozitif bir tamsayı giriniz: ");
           int sayi= scan.nextInt();

           System.out.println(pozitifBolenToplami(sayi));

       }

    public static int pozitifBolenToplami(int sayi) {
           int toplam=0;
        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
            }

        }
        return toplam;
    }
}
