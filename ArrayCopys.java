//45
public class ArrayCopys {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int b[] = new int[a.length];

        System.arraycopy(a, 0, b, 0, a.length);

        System.out.print("Copied Array: ");

        for(int i=0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}