package week04;

import java.util.Scanner;

public class P06_forLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine();
        String sonuc ="";
        int i=0;
        for(i=str.length()-1; i>=0; i--){
            sonuc+=str.charAt(i);
        }
        System.out.println(sonuc);

    }
}
