package algorithms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number :");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int fact=1;
        for (int i = number; i >0 ; i--) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
