package week01;

public class P02_dataTypes {
    public static void main(String[] args) {
    /*
        byte:  Sadece tam sayı değerler alır 8bit
        short: Sadece tam sayı değerler alır 16bit
        int  : Sadece tam sayı değerler alır - en sık kullanılanı 32 bit
        long : Sadece tam sayı değerler alır 64bit
        // Peki neden farklı farklı olmuş hepsi tam sayı ise
       // metrobüsteki koltuk tek kişilik mi iki kişilik mi?
       //  E-devlette 200 Milyon kişi kayıtlı ve her kişi için çok fazla bilgi tutuluyor.
       //  Her bilgi için 3 bilgilik yer ayırsanız
        float: ondalıklı sayı değerleri alır (sonuna f zorunlu)
        double : ondalıklı sayı değerleri alır (sonunda d konulabilir)
        double>float>long>int>short>byte
        boolean : true ya da false şeklinde cevap verir
        char    :tek tırnak içinde yazılır ve tek karakter alır - sayılar tırnak içinde girilmez (ASCII)
     */
        byte b1 = Byte.MAX_VALUE;
        byte b2 = Byte.MIN_VALUE;
        System.out.println("byte MAX değeri = " + b1);
        System.out.println("byte MIN değeri = " + b2);
        short s1 = Short.MAX_VALUE;
        short s2 = Short.MIN_VALUE;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        int i1= Integer.MAX_VALUE;
        int i2=Integer.MIN_VALUE;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        long l1=Long.MAX_VALUE;
        long l2=Long.MIN_VALUE;
        //yukarıdaki sarı ünleme bak
        float f1=Float.MAX_VALUE;
        float f2=Float.MIN_VALUE;
        double d2=Double.MIN_VALUE;
        System.out.println("d2 = " + d2);
        boolean kod=true;
        System.out.println("kod doğru girildi mi = " + kod);
        char giris='m';
        System.out.println("giris = " + giris);
        /*
        *nonPrimitive - çok fazla vardır
        String şu ana kadar karşlaştığımız
        * Genel adı (babası) Object tir
        * Karakter sınırı yoktur.
         */
        String isim="Tarık";
        System.out.println("isim = " + isim);
        System.out.println(isim.charAt(1));
    }
}
