public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(reverse3(number));


    }

    static public int[] reverse3(int[] nums) {
        int reverse[] = new int[nums.length];
        for (int i = 0; i < nums.length ; i++) {
            reverse[reverse.length - i-1] = nums[i];
        }

        return reverse;
    }
}