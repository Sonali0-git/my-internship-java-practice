//32. Shift zeros to right side
import java.util.*;

public class ShiftZeroRight {
    public static void main(String[] args) {

        int arr[] = {2, 0, 5, 3, 1, 0, 3, 1};
        int temp[] = new int[arr.length];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        while (index < temp.length) {
            temp[index++] = 0;
        }

        System.out.println(Arrays.toString(temp));
    }
}