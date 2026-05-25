//43. Write a Java program to shuffle array elements using Math.random() method.

import java.util.*;

public class ShuffleArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++) {

            int j = (int)(Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}