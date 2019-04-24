public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 6};
        System.out.println(firstLast6(number));


    }

    static public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length-1] == 6) {
            return true;
        }
        return false;

    }
}