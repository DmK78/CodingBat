public class Task {


    public static void main(String[] args) {

        int number[] = {1, 7};
        int number1[] = new int[0];
        int[] arr = (front11(number, number1));
        for (int i : arr) {
            System.out.println(i);
        }


    }

    static public int luckySum(int a, int b, int c) {
        int array[] = {a, b, c};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 13) break;
            sum += array[i];
        }

        return sum;

    }
}