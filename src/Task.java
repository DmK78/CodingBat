public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public boolean double23(int[] nums) {
        int two = 0;
        int three = 0;
        for (int i : nums) {
            if (i == 2) two++;
            if (i == 3) three++;
        }
        if (two == 2) return true;
        if (three == 2) return true;
        return false;
    }
}