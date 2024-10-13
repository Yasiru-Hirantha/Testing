public class GreaterThanTriangle {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 0; i < row; i++) {
            for (int j =i+1 ; j >0; j--) {
                if(i>=(row/2)){
                    for (int k = row-i; k > 1 ; k--) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                    return;
                }else {
                    System.out.print(" * ");
                }
            }

            System.out.println();

        }
    }
}
