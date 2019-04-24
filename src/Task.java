public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 6};
        System.out.println(firstLast6(number));


    }

    static public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }
}