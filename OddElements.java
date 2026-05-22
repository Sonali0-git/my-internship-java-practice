// 5. Java program to print odd elements present in an array
// Input: {1,2,3,4,5,6}
// Output: {1,3,5}

public class OddElements {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Odd elements:");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}