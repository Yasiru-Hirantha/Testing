package algorithms;

public class fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        for (int i = 0; i < 10; i++) {
            int c=a+b;
            a=b;
            b=c;
            if(i<=1) System.out.println(i);
            System.out.println(c);
        }
    }
}
