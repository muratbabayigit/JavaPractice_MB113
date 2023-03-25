package week06;

import java.util.Scanner;

public class tersinecevir {

    public static void main(String[] args) {
        // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
        // girilen değeri tersine  yazdıran bir method oluşturun
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir cümle veya kelime giriniz");
        String girilenIfade = scan.nextLine();
        System.out.println(TersineCevir(girilenIfade));

    }public static String TersineCevir(String girilenIfade) {

        String tersIfade = "";
        for (int i = girilenIfade.length()-1; i >= 1; i--) {
            tersIfade += girilenIfade.charAt(i);


        }
        girilenIfade = tersIfade;

        return girilenIfade;
    }
}
