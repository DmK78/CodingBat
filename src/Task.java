public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] makeEnds(int[] nums) {
        int arr[]=new int[2];
        arr[0]=nums[0];
        arr[1]=nums[nums.length-1];
        return arr;


    }
}