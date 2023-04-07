package week08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P02_Arrays {
    /*
    Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
    method yaziniz.
     */
    public static void main(String[] args) {
        int[] arr = {2, -5, -3, 10, 5, 3, 6, 9, -15, 20, 35};
        System.out.println(arraydekiPozitifSayilariTopla(arr));
        //sonuç array olarak dönüyorsa Arrays.toString ile yazdırırız. Sonuc int vb. dönüyorsa direk yazdırırız
    }

    public static int arraydekiPozitifSayilariTopla(int[] arr) {
        int sonuc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sonuc += arr[i];
            }

        }
        return sonuc;
    }

}
