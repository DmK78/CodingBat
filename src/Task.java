public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] midThree(int[] nums) {
        int arr[] = new int[3];
        arr[0] = nums[nums.length / 2 - 1];
        arr[1] = nums[nums.length / 2];
        arr[2] = nums[nums.length / 2 + 1];
        return arr;

    }
}