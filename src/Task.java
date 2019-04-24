public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        if (first > middle && first > last) {
            return first;
        }
        if (middle > first && middle > last) {
            return middle;
        }
        return last;
    }
}