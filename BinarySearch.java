//47 BinarySearch
import java.util.*;

public class BinarySearch{
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};
        int key = 40;

        int low = 0;
        int high = a.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(a[mid] == key) {
                System.out.println("Element found at index: " + mid);
                break;
            }
            else if(a[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
    }
}