public class Task {


    public static void main(String[] args) {

        int number[] = {1,2,3};
        System.out.println(rotateLeft3(number).toString();


    }

    static public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }
}