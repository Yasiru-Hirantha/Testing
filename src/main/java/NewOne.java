public class NewOne {
    public static void main(String[] args) {
        int row = 10;
        for (int i = 0; i < row; i++) {
            if(i<(row/2)){
                for (int j = 0; j < i+1; j++) {
                    System.out.print(" * ");
                    
                }
            }else {
                for (int j = row-i; j > 1; j--) {
                    System.out.print(" * ");

                }
            }
            System.out.println();
            
        }
    }
}
