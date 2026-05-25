//57.Arrange Character Array in Ascending Order
class CharacterAscending {
    public static void main(String[] args) {

        char a[] = {'R','A','C','D','B'};

        for(int i=0; i<a.length; i++) {

            for(int j=i+1; j<a.length; j++) {

                if(a[i] > a[j]) {

                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");

        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}