package algorithms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        char[] reverse = word.toCharArray();
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }
    }
}
