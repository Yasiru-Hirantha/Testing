package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(checking(number));
    }

    public static boolean checking(int n){
//        ArrayList<Integer> factors = new ArrayList<>();
        int sum =0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum+=i;
            }
        }
        return sum == n;

    }
}
