public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] swapEnds(int[] nums) {
        int arr[] = new int[nums.length];
        int tmp = 0;
        tmp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = tmp;
        return nums;

    }
}