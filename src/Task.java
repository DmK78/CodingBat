public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] fix23(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==2 && nums[i+1]==3){
                nums[i+1]=0;
            }
        }
        return nums;
    }
}