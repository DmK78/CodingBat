public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int sum2(int[] nums) {
        if (nums.length==0)return 0;
        if (nums.length>1){
            return nums[0]+nums[1];
        }else return nums[0]+nums[0];
    }
}