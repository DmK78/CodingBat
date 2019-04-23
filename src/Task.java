public class Task {


    public static void main(String[] args) {


        int numbers[] = {1, 2};
        System.out.println(array123(numbers));


    }

    static public boolean array123(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i < nums.length-2 && nums[i + 1] == 2) {
                    if (nums[i + 2] == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
