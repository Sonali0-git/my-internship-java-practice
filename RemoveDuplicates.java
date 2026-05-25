// 27. Remove Duplicates from an Array

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int arr[] = {1,2,1,3,4};

        System.out.print("Output{");

        for(int i=0; i<arr.length; i++) {

            boolean isDuplicate = false;

            // Check previous elements
            for(int j=0; j<i; j++) {

                if(arr[i] == arr[j]) {

                    isDuplicate = true;
                    break;
                }
            }

            // Print non-duplicate element
            if(!isDuplicate) {

                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("}");
    }
}