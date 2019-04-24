public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] frontPiece(int[] nums) {
        if (nums.length > 1) {
            int arr[] = {nums[0], nums[1]};
            return arr;
        }
        if (nums.length < 1) {
            int arr[] = new int[0];
            return arr;
        }


        int arr[] = {nums[0]};
        return arr;
    }
}