package week05;

import java.util.Scanner;

public class F02_methodCreation {
    static String duzenliStr="";
    /*
    Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");
        String name= scan.nextLine();   // next olursa ilk boşluğa kadar yazar Murat Emre dersek sadece Murat'ı alır
                                        //nextLine dersek Murat Emre alır.
        System.out.println();
        System.out.print("Lütfen soyadınızı giriniz: ");
        String surname= scan.nextLine();

        System.out.println(isimSoyisimYazdir(name, surname));
    }

    public static String isimSoyisimYazdir(String name, String surname) {
        name=name.toUpperCase().charAt(0)+name.substring(1).toLowerCase();
        surname=surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();
        duzenliStr=name+" "+surname;
        return duzenliStr;
    }

}
