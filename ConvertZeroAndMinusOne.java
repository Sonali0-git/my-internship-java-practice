// 24. Convert 0 into -1 and -1 into 0

import java.util.*;

public class ConvertZeroAndMinusOne {

    public static void main(String[] args) {

        int arr[] = {0,2,-1,0,-1,3};

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == 0) {

                arr[i] = -1;
            }

            else if(arr[i] == -1) {

                arr[i] = 0;
            }
        }

        System.out.print("Output{");

        for(int i=0; i<arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        System.out.print("}");
    }
}