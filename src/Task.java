public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public boolean no23(int[] nums) {
        for(int i:nums){
            if (i==2 || i==3){
                return false;
            }
        }
      return true;


    }
}