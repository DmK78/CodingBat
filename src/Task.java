public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3, 4, 5, 6};
        System.out.println(firstLast6(number));


    }

    static boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }
}