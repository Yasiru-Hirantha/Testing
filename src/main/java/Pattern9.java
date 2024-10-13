public class Pattern9 {
    public static void main(String[] args) {
        int row = 7;
        for (int i = 0; i < row; i++) {
            if (i <(row / 2)) {
                for (int j = i; j <( row/2); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }

            } else {
                for (int j = i-(row/2); j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = i; j < row; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}
