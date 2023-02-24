package week03;

import java.util.Scanner;

public class P08_StringManipulations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        1-Kullanicidan isim ve soyismini ayri ayri alin.
        ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.

         */

        System.out.print("Lütfen İsminizi Giriniz: ");
        String name= scan.nextLine();
        System.out.println("Lütfen Soyisminizi Giriniz: ");
        String surname= scan.nextLine();
        if (name.length()>surname.length()){
            name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
            surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();
            System.out.println(name +" "+surname);

        }
        if(name.length()<surname.length()){
            name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
          //name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
            surname=surname.toUpperCase();
            System.out.println(name+" "+surname);



        }










        /*
        2- Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
        sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
        input : java1 ogRe2@nMek3 #ne +Gu=zel
        output : Java ogrenmek ne guzel.
         */


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
