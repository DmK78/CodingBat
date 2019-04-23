public class Task {


    public static void main(String[] args) {


        int numbers[] = {1, 2, 4, 6, 4, 5};
        System.out.println(arrayFront9(numbers));


    }

    static public boolean arrayFront9(int[] nums) {

        if (nums.length <= 3) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i <= 3; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
