public class Task {


    public static void main(String[] args) {

        int number[] = {1, 7};
        int number1[] = new int[0];
        int[] arr = (front11(number, number1));
        for (int i : arr) {
            System.out.println(i);
        }


    }

    static public int loneSum(int a, int b, int c) {
        int sumA, sumB, sumC;
        sumA = a;
        sumB = b;
        sumC = c;
        if (a == b) {
            sumA = 0;
            sumB = 0;
        }
        if (a == c) {
            sumA = 0;
            sumC = 0;
        }
        if (b == c) {
            sumB = 0;
            sumC = 0;
        }
        return sumA + sumB + sumC;


    }
}