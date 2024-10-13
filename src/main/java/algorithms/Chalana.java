package algorithms;

import java.util.Scanner;

public class Chalana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        for (int i = 0; i < limit; i++) {
            int val = Fibonacci.fibonacci(i);
            System.out.print(val + " ");
        }
    }

}


class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
