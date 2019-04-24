public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 6};
        System.out.println(firstLast6(number));


    }

    static public int sum3(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result += i;
        }
        return result;
    }
}