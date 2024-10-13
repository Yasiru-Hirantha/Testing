package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {14, 23, 63, 18, 40, 56, 11, 96, 82, 32, 57, 100, 100, 76, 60};

        int temp;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                temp = arr[j];
                if(arr[j]<arr[i]){
                    arr[i]=temp;
                    arr[j]=min;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
