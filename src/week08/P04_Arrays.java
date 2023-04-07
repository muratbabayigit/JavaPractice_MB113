package week08;

import java.util.Arrays;
import java.util.Scanner;

public class P04_Arrays {
    /*
    Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
    donduren bir method olusturun.
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(kullaniciyaArrayYaptir()));

    }

    private static int[] kullaniciyaArrayYaptir() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen oluşturmak istediğiniz Array'in boyutunu giriniz:  ");
        int length= scan.nextInt();
        int [] arr=new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Array'e eklemek istediğiniz sayıyı giriniz: ");
            arr[i]= scan.nextInt();
        }return arr;
    }
}
