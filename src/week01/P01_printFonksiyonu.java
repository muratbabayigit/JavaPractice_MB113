package week01;

public class P01_printFonksiyonu {

    public static void main(String[] args) {
        // burasi yorum satiri
        /*
        buraya yorum
        satirlaraca
        yazilabilir
         */
        /*
         Soru - 1
        Konsola
        Hello World ve "Hello World"
        yazdırınız.
         */
        //System.out.println("Hello World");
        //System.out.println("\"Hello World\"");
        /*
        Soru - 2
        Konsola
        "Hello  \
        'World' \/"
        yazdırınız
         */
        /*
       \n   :bir alt satirdan yazmaya baslar
       \t   :1 TAB bosluk birakir
       \"   :" yazar
       \'   :' yazar
       \\   : \ yazar
         */
        //System.out.println("\"Hello\t\\\n'World'\t\\/\"");
        /*
        Soru -3
        Değer atayarak
        Tarık Yiğit - QA Software Test Engineer
         */
        String name="Tarik";
        String surname="Yigit";
        String job="QA Software Test Engineer";
        System.out.println(name+" "+surname+" - "+job);
        System.out.println("======= KOD BASARIYLA TAMAMLANDI=============");
        System.out.print(name+" ");
        System.out.print(surname+" - ");
        System.out.print(job);
        System.out.println("");
        System.out.println("======= PRINTLN FARKI =============");
        System.out.println(name+" ");
        System.out.println(surname+" - ");
        System.out.println(job);
        /*
 ÖDEV : Aşağıdaki gibi bir ATM karşılama ekranı yazan koda dizisini yazınız.
**********  WISE BANK   **********
    WISE ATM’YE HOŞGELDİNİZ
    1 – Bakiye Sorgulama
    2 – Para Yatırma
    3 – Para Çekme
    4 – Bilgi Güncelleme
    5 – Kart İade
**********  WISE BANK   **********
         */
    }
}
