public class Task {


    public static void main(String[] args) {


        int numbers[] = {6, 6, 2, 6,6,5,4,1,1,1};
        System.out.println(noTriples(numbers));


    }

    static public boolean noTriples(int[] nums) {
     for (int i=0;i<nums.length-2;i++){
         int num1=nums[i];
         if (nums[i+1]==num1 && nums[i+2]==num1){
             return false;
         }
     }
     return true;
    }
}
