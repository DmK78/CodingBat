public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] makeLast(int[] nums) {
        int arr[] = new int[nums.length * 2];
        arr[arr.length-1]=nums[nums.length-1];
        return arr;


    }
}