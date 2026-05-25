//13. Duck Number
class DuckNumber {
    public static void main(String[] args) {

        int n = 1023;
        int flag = 0;

        while(n > 0) {

            int rem = n % 10;

            if(rem == 0) {
                flag = 1;
                break;
            }

            n = n / 10;
        }

        if(flag == 1)
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}