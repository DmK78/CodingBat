public class Task {


    public static void main(String[] args) {


        int numbers[] = {2, 7, 4};
        System.out.println(noTriples(numbers));


    }

    static public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int num = nums[i];
            if (nums[i + 1] == num + 5 && Math.abs(nums[i + 2]-(num-1)) <= 2) {
                return true;
            }


        }
        return false;
    }
}
