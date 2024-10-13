public class Pattern13 {
    public static void main(String[] args) {
        int row =21;

        for (int i = 0; i < row; i++) {
            if(i==0){
                for (int j = 0; j < row+1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
            for (int j = i; j < row; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
