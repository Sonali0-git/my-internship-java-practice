//36. Insert element in array
import java.util.*;

public class InsertElement {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int element = 5;
        int pos = 3;

        int newArr[] = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = element;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));
    }
}