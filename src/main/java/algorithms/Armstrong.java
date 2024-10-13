package algorithms;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Armstrong armstrong =new Armstrong();
        System.out.println(armstrong.checking(num));

    }
    public boolean checking(int n){
        char[] charArray  = Integer.toString(n).toCharArray();
        int size= charArray.length;
        int sum=0;
        for (char c : charArray) {
            int i= Character.getNumericValue(c);
            sum+= Math.pow(i,size);
        }
        return sum==n;


    }
}
