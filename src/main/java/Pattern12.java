public class Pattern12 {
    public static void main(String[] args) {
        int row = 15;
        for (int i = 0; i < row; i++) {
            if(i<=row/2) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
            }else {
                for (int j = 1; j < row-i; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            if(i!=row/2 && i< row/2) {
                for (int j = 0; j <row-2*(i+1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if(i>(row/2)) {
                for (int j = (row/2)-2; j <=2*(i+1)-row; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
