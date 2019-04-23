public class Task {


    public static void main(String[] args) {


        int numbers[] = {6, 6, 2, 6,6};
        System.out.println(array667(numbers));


    }

    static public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6) {
                if (nums[i + 1] == 6 || nums[i + 1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
}
