public class Task {


    public static void main(String[] args) {

        int number[] = {1, 7};
        int number1[] = new int[0];
        int[] arr = (front11(number, number1));
        for (int i : arr) {
            System.out.println(i);
        }


    }

    static public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length > 0) {
            int arr[] = {b[0]};
            return arr;
        }
        if (b.length == 0 && a.length > 0) {
            int arr[] = {a[0]};
            return arr;
        }
        if(a.length>0 && b.length>0) {
            int arr[] = {a[0], b[0]};
            return arr;
        }
        if (b.length == 0 && a.length == 0) {
            int arr[] = new int[0];
            return arr;
        }

return null;

    }
}