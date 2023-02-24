package week02;

import java.util.Scanner;

public class P05_NestedIfStatements {
    public static void main(String[] args) {


        /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
           KURALLAR
             : 1999 yılı 9. ay öncesi işe başlamış olmak
             : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
             : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
        Scanner scan = new Scanner(System.in);
       System.out.println("İşe başlama yılınızı ve ayınızı 1999.09 seklinde giriniz:");
       double giris = scan.nextDouble();
       if (giris > 1999.09) {
           System.out.println("Siz EYT Kanun düzenlemesine tabi değilsiniz!");
       } else {
           System.out.println("Lütfen cinsiyetinizi E ya da K olarak giriniz: ");
           char cinsiyet = scan.next().charAt(0);
           System.out.println("Lütfen prim gün sayınızı giriniz: ");
           int primGun = scan.nextInt();
           System.out.println("Lütfen hizmet sürenizi yıl olarak giriniz: ");
           int yil= scan.nextInt();

           if (cinsiyet=='E'|| cinsiyet=='e'){
               if (primGun>=5500 && yil>=25){
                   System.out.println("Tebrikler EYT Kanunu yürürlüğe girdiği zaman emekli olabilirsiniz!");
               } else if (primGun<5500 && yil>=25) {
                   System.out.println("Kanun yürürlüğe girince "+(5500-primGun)+" gün prim şartını tamamlamanız gerekmektedir.");
               }else if (primGun>=5500 && yil<25){
                   System.out.println("Kanun yürülüğe girdiğinde "+(25-yil)+" yıl daha çalışmalısınız.");
               }else{
                   System.out.println("Maalesef iki şartı da sağlamıyorsunuz.");
               }
           }else if (cinsiyet=='K'|| cinsiyet=='k'){
               if (primGun>=5000 && yil>=20){
                   System.out.println("Tebrikler EYT Kanunu yürürlüğe girince emekli olabilirsiniz! ");
               }else if (primGun<5000 && yil>=20){
                   System.out.println("Kanun yürülüğe girdiği zaman "+(5000-primGun)+" gün prim şartını tamamalamanız gerekmektedir.");
               }else if (primGun>=5000 && yil<20){
                   System.out.println("Kanun yürürlüğe girdiği zaman "+(20-yil)+" yıl daha çalışmalısınız.");
               }else{
                   System.out.println("Maalesef iki şartı da sağlamıyorsunuz!");
               }
           }else {
               System.out.println(" Yanlış bir değer girdiniz");
           }

       }




        /*
     2-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
    karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
    %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
    alirsa %15, yoksa %10 indirim yapin
       */
        System.out.println("Lütfen ürün adedini ve liste fiyatı giriniz");
        int adet= scan.nextInt();
        double listeFiyati= scan.nextDouble();
        System.out.println("T113 kart kullnıyor musunuz? E/H : ");
        char kart=scan.next().charAt(0);
        if (kart=='E'|| kart=='e'){
            if (adet>10){
                System.out.println("%20 indirimli olarak ödemeniz gereken tutar: "+(listeFiyati*adet*0.8));
            }else{
                System.out.println("%15 indirimli olarak ödemeniz gereken tutar: "+(listeFiyati*adet*0.85));
            }

        } else if (kart=='H'|| kart=='h') {
            if (adet>10){
                System.out.println("%15 indirimli olarak ödemeniz gereken tutar: "+(listeFiyati*adet*0.85));
            }else {
                System.out.println("%10 indirimli olarak ödemeniz gereken tutar: "+(listeFiyati*adet*0.9));
            }
        }



        /*
    3- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
    “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
    gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
    zamani” yazdirin.
     */


    }
}
