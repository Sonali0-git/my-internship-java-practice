//33. Shift zeros to left side
import java.util.*;

public class ShiftZeroLeft {
    public static void main(String[] args) {

        int arr[] = {2, 0, 5, 3, 1, 0, 3, 1};
        int temp[] = new int[arr.length];

        int index = temp.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                temp[index--] = arr[i];
            }
        }

        System.out.println(Arrays.toString(temp));
    }
}