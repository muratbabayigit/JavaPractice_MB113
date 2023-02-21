package week02;

public class C01forLoop {
    public static void main(String[] args) {
        int satir=4;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
