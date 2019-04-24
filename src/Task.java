public class Task {


    public static void main(String[] args) {

        int number[] = {1, 7};
        int number1[] = new int[0];
        int[] arr = (front11(number, number1));
        for (int i : arr) {
            System.out.println(i);
        }


    }

    static public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);


    }

    static public int fixTeen(int n) {
        switch (n) {
            case 13:
            case 14:
            case 17:
            case 18:
            case 19: {
                return 0;
            }

        }
        return n;

    }
}