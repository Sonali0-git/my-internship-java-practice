//38. Print distinct elements from two arrays
import java.util.*;

public class DistinctElements {
    public static void main(String[] args) {

        int a[] = {1, 2, 4, 5, 6};
        int b[] = {2, 5, 8, 9, 3, 1};

        System.out.print("Distinct Elements: ");

        for (int i = 0; i < a.length; i++) {

            boolean found = false;

            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(a[i] + " ");
            }
        }

        for (int i = 0; i < b.length; i++) {

            boolean found = false;

            for (int j = 0; j < a.length; j++) {

                if (b[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(b[i] + " ");
            }
        }
    }
}