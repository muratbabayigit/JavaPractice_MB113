package week07;

import java.util.Scanner;

public class P02_doWhileLoop {
    /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
            sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
            - Sifre kucuk harf icermelidir.
            - Sifre buyuk harf icermelidir.
            - Sifre ozel karakter icermelidir
            - Sifre en az 8 karakter olmalidir.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        boolean hasLowerCase, hasUpperCase, hasSpecialChar, hasValidLength;

        do {
            System.out.print("Lütfen bir şifre giriniz: ");
            password = input.nextLine();

            hasLowerCase = false;
            hasUpperCase = false;
            hasSpecialChar = false;
            hasValidLength = password.length() >= 8;

            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    hasSpecialChar = true;
                }
            }

            if (!hasLowerCase) {
                System.out.println("Şifreniz küçük harf içermelidir.");
            }
            if (!hasUpperCase) {
                System.out.println("Şifreniz büyük harf içermelidir.");
            }
            if (!hasSpecialChar) {
                System.out.println("Şifreniz özel karakter içermelidir.");
            }
            if (!hasValidLength) {
                System.out.println("Şifreniz en az 8 karakter olmalıdır.");
            }

        } while (!hasLowerCase || !hasUpperCase || !hasSpecialChar || !hasValidLength);

        System.out.println("Şifreniz Kabul edilmistir.");

    }
}

