package week01;

public class P03_Variables {
    public static void main(String[] args) {
        byte a=12;
        byte b=113;
        byte c=127;
        System.out.println(a+"-"+b+"-"+c);
        short sa=14;
        int ia=22;
        long la=3256;
        double d1=2.335;
        double d2=3000.0;
        double d3=24505678d;
        float f1=2.34f;
        char ch1=102;
        String str= "murat";
        System.out.println("3. harf : "+str.toUpperCase().charAt(2));
        System.out.println("str = " + str.toUpperCase());
        System.out.println("ch1 = " + ch1);
        int sayi; // Değer atamadan oluşturulabilir ama kullanılamaz
        sayi=30;
        System.out.println("sayi = " + sayi);
    }
}
