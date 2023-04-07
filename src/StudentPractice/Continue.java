package StudentPractice;

public class Continue {
    // for Loop yaparken herhangi bir adımı atlmasını istersek contunie işlemi yapılır
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i==3){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
