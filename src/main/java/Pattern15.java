public class Pattern15 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row ; i++) {
            if(i==0){
                for (int j = 0; j < row/2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else if (i<=row/2) {
                for (int j = i; j <row/2 ; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0;j < 2*i-1; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            } else if (i!= row-1) {
                for (int j = row/2; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j =2*(i+1)-row; j <row-1 ; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }else {
                for (int j = 0; j <row/2 ; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }


           
            
        }
    }
}
