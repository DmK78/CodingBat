public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] maxEnd3(int[] nums) {
        int max;
        if (nums[0] > nums[nums.length - 1]) {
            max = nums[0];
        } else max = nums[nums.length - 1];

        for (int i=0;i<nums.length;i++){
            nums[i]=max;
        }
        return nums;
    }
}