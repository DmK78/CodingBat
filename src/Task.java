public class Task {


    public static void main(String[] args) {

        int number[] = {4, 5};
        int number1[] = {1, 2, 3};
        int[] arr = (make2(number, number1));
        for (int i : arr) {
            System.out.println(i);
        }


    }

    static public int[] make2(int[] a, int[] b) {
        int arr[] = new int[2];
        boolean aIsempty = false;
        boolean bIsempty = false;
        if (a.length == 0) aIsempty = true;
        if (b.length == 0) bIsempty = true;
        int count = 0;
        while (count < arr.length && count < a.length) {
            if (!aIsempty) {
                arr[count] = a[count];
                count++;
            }

        }
        int countB = 0;
        while (count < arr.length && countB < b.length) {
            if (!bIsempty) {
                arr[count] = b[countB];
                count++;
                countB++;
            }
        }

        return arr;
    }
}