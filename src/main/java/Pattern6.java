public class Pattern6 {
    public static void main(String[] args) {
        int row = 15;
        for (int i = 0; i < row; i++) {
            if(i<=(row/2)) {
                for (int j = i+1; j <=(row/2);  j++) {
                    System.out.print(" ");

                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }else {
                for (int j =  i-(row/2); j > 0;  j--) {
                    System.out.print(" ");

                }
                for (int k = 0 ; k < row-i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }
}
