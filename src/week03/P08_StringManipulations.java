package week03;

import java.util.Scanner;

public class P08_StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       //String manipulation
       // System.out.print("lütfen Kullanıcı adınızı giriniz");
        String str1="Emre Can";
        String str2="Emre Can";
        String str3=new String("Emre Can");

        //str1=str1.toLowerCase(); //emre can
        //System.out.println(str1);
        //str1=str1.toUpperCase();//EMRE CAN
         //equals methodu
      // System.out.println(str1.equals(str2)); // referansına bakar
      // System.out.println(str1==str2);
      // System.out.println(str1.equalsIgnoreCase(str2));
      // System.out.println(str1.equals(str3));
      // System.out.println(str1==str3);
        //System.out.println(str1.charAt(0));

        String str11="Ali";
        String str12="ali";
        //System.out.println(str11.equals(str12));
        //System.out.println(str11.equalsIgnoreCase(str12));
       // System.out.println(str1.length()); //length 1'den başlar boşluk dahil sayar
        //System.out.println(str1.length()-1);

       // System.out.println(str2.substring(1,6));
       // System.out.println(str2.substring(4));

        //int sayi=01;

        //System.out.println(str2.concat("_wise"));//Emre Can_wise

     // System.out.println(str2.substring(9));
     //   String name3="ÇekoslavakyalılaştıramadıklarımızdanMısınız";
     //   System.out.println(name3.length());
     //   System.out.println(name3.substring(44));

        //System.out.println(name3.substring(45));

       // String login="Üye Girişi";
       // System.out.println(login.contains("Üye")); //true
//
       // System.out.println(login.startsWith("Ü")); //true
       // System.out.println(login.endsWith("i")); //true
       // System.out.println(login.indexOf("ş"));
       // System.out.println(login.lastIndexOf('i'));
       // System.out.println(str1.isEmpty());

        /*
        \\s : space
        \\S :space olmayan her şey
        \\s+ :yanyana olan birden fazla space
        \\d : digit
        \\D : digit olmayan her şey
        \\w :harf veya rakam
        \\W : harf veya rakam olmayan herşey
         */
      //  String marka="Wise3@*9 Quarter";
      //  marka=marka.replaceAll("\\d","");
      //  System.out.println(marka);
      //  marka=marka.replaceAll("\\W"," ");
      //  System.out.println(marka);


































        /*
        1-Kullanicidan isim ve soyismini ayri ayri alin.
        ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.

         */

      //  System.out.print("Lütfen İsminizi Giriniz: ");
      //  String name= scan.nextLine();
      //  System.out.println("Lütfen Soyisminizi Giriniz: ");
      //  String surname= scan.nextLine();
      //  if (name.length()>surname.length()){
      //      name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
      //      surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
      //      System.out.println(name +" "+surname);
//
      //  }
      //  if(name.length()<surname.length()){
      //      name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
      //    //name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
      //      surname=surname.toUpperCase();
      //      System.out.println(name+" "+surname);
//
//
//
      //  }










        /*
        2- Kullanicidan bir cumle alin
            - cumlede ev geciyorsa, "home home sweet home" yazdirin
            - cumlede is geciyorsa, "calismak guzeldir"
            - ikisini de iceriyorsa "Hem ev lazim hem is"
            - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
         */

        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle= scan.nextLine();
        String kucukCumle=cumle.toLowerCase();
        if (kucukCumle.contains("ev")&&kucukCumle.contains("iş")){
            System.out.println("Hem ev lazim hem is");
        }else if (kucukCumle.contains("iş")){
            System.out.println("calismak guzeldir");
        } else if (kucukCumle.contains("ev")) {
            System.out.println("home home sweet home");
                    }else{
            System.out.println("cok calisman lazim");
        }


        /*
        3-Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunlugu en az 10 karakter olmali
         */


























    }
}
