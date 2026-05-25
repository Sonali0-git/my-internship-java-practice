// 25. Sum of Each Element up to Single Digit

import java.util.*;

public class SingleDigitSum {

    public static void main(String[] args) {

        int arr[] = {25,55,67,3,10};

        System.out.print("Output{");

        for(int i=0; i<arr.length; i++) {

            int num = arr[i];

            while(num > 9) {

                int sum = 0;

                while(num != 0) {

                    sum = sum + num % 10;
                    num = num / 10;
                }

                num = sum;
            }

            System.out.print(num + " ");
        }

        System.out.print("}");
    }
}