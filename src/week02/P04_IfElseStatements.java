package week02;

import java.util.Scanner;

public class P04_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



    /*
    1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
        85-100 -----> AA
        80-85 ------> BA
        75-80 ------> BB
        65-75 ------> CB
        50-65 ------> CC
        50 Altı ise  ------> FF
         */
     //  System.out.print("Lütfen Notunuzu Giriniz: ");
     //  int not= scan.nextInt();
     //  if (not>=85 && not<=100){
     //      System.out.println(" Sınav Notunuz: "+not+" Harf Notunuz: AA");
     //  } else if (not>=80 && not<85) {
     //      System.out.println(" Sınav Notunuz: "+not+" Harf Notunuz: BA");
     //  } else if (not>=75 && not<80) {
     //      System.out.println(" Sınav Notunuz: "+not+" Harf Notunuz: BB");
     //  } else if (not>=65 && not<75) {
     //      System.out.println(" Sınav Notunuz: "+not+" Harf Notunuz: CB");
     //  } else if (not>=50 && not<65) {System.out.println(" Sınav Notunuz: "+not+" Harf Notunuz: CC");}
     //  else {System.out.println("Sınav Notunuz: "+not+" Harf Notunuz FF");}
    /*
    Not: Birden fazla if,elseif, else durumlarında en son adıma bakılır
    else ile bitiyorsa tüm ihtimaller kapsanır.
    else if ile bitiyorsa kapsanmayan ihtimaller vardır.
     */

    /*
       2- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
          sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
          “istediginiz birim sisteme kayitli degil” yazdirin.
         */

      // System.out.print("Lütfen mesafeyi kilometre olarak giriniz : ");
      // double km= scan.nextDouble();
      // System.out.print("Lütfen dönüştürmek istediğiniz birimi giriniz (örnek Metre) :");
      // char birim=scan.next().charAt(0);
      // if (birim =='m'|| birim=='M'){
      //     System.out.println("Girdiğiniz mesafenin metre değeri : "+km*1000+" 'dir.");
      // }else if (birim=='s'|| birim=='S'){
      //     System.out.println("Girdiğiniz mesafenin santimetre değeri : "+km*1000*100+" 'dir.");
      // }else{
      //     System.out.println("istediginiz birim sisteme kayitli degil");
      // }










    /*
    3-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
    yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
    olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
    */

        System.out.println("Lütfen önce yaşınızı sonra cinsiyetinizi E ya da K şeklinde giriniz: ");
        int yas=scan.nextInt();
        char cinsiyet=scan.next().charAt(0);
        if ((cinsiyet=='K'|| cinsiyet=='k')&& yas>=60){
            System.out.println("Emekli olabilirsiniz.");
        }
        if ((cinsiyet=='K'|| cinsiyet=='k') && yas<60){
            System.out.println("Emekli olmak için "+(60-yas)+" yıl daha çalışmalısınız.");
        }
        if ((cinsiyet=='E'|| cinsiyet=='e')&& yas>=65){
            System.out.println("Emekli olabilirsiniz");
        }
        if ((cinsiyet=='E'||cinsiyet=='e')&& yas<65){
            System.out.println("Emekli olmak için "+ (65-yas)+" yıl daha çalışmanız gerekiyor");
        }








    /*
    Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol
    etmek icin yil girmesini isteyin.
    Kural 1: 4 ile bolunen yillar artik yildir
    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

     */

       // System.out.println("Lütfen Kontrol Etmek İstediğiniz Yılı Giriniz : ");
       // int yil= scan.nextInt();
       // if (yil%100==0&& yil%400==0 || yil%100!=0 &&yil%4==0 ){
       //     System.out.println("Girdiğiniz yıl Artık Yıl'dır");
       // }else{
       //     System.out.println("girdiğiniz yıl artık yıl değildir.");
       // }





    }

}
