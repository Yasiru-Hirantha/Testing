public class Pattern11 {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
