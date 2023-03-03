package week04;

import java.util.Scanner;

public class P04_forLoop {
    public static void main(String[] args) {
        Scanner scann=new Scanner(System.in);

        System.out.println("150 den kücük bir sayi girin");
        int girilenSayi= scann.nextInt();

        for (int i = 1; i <=girilenSayi ; i++) {
            if (i%3==0&&i%5==0){
                System.out.print(" hakan ünlü ");
            } else if (i%3==0) {
                System.out.print(" hakan ");
            } else if (i%5==0) {
                System.out.print(" ünlü ");
            }
            System.out.print(i+" ");
        }


        }
    }


