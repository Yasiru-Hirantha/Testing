public class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 6-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 2-i; j <= i+2; j++) {
                System.out.print("*");
            }
        }
    }
}
