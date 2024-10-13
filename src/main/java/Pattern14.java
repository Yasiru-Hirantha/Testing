public class Pattern14 {
    public static void main(String[] args) {
        int row = 18;
        for (int i = 0; i < row; i++) {
            if(i!=row-1) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j < 2*row-2*i ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }else{
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
