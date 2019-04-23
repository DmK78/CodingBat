public class Task {


    public static void main(String[] args) {


        int numbers[] = {1, 9, 9, 3, 9};
        System.out.println(arrayCount9(numbers));


    }

    static public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;

    }


}
