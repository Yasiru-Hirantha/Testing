public class Pattern10 {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i < row; i++) {
            if(i<row/2) {
                for (int j = 0; j <i ; j++) {
                    System.out.print(" ");
                }
                for (int j = row / 2; j > i; j--) {
                    System.out.print("* ");
                }

            } else if (i<row-1) {
                for (int j =i; j <=(row/2); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i-(row/2)+1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
