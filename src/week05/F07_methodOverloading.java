package week05;

public class F07_methodOverloading {

        // İki integer değeri toplayan metot
        static int topla(int a, int b) {
            return a + b;
        }

        // Üç integer değeri toplayan metot
        static int topla(int a, int b, int c) {
            return a + b + c;
        }

        // İki double değeri toplayan metot
        static double topla(double a, double b) {
            return a + b;
        }

        public static void main(String[] args) {
            // Farklı parametre kombinasyonları ile metot çağrıları
            System.out.println(topla(5, 10));       // 1. Metot çağrısı
            System.out.println(topla(3, 6, 9));     // 2. Metot çağrısı
            System.out.println(topla(4.5, 2.3));    // 3. Metot çağrısı
        }
    }

