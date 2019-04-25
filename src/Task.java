import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(makeBricks(1, 2, 7));
    }


    static public boolean makeBricks(int small, int big, int goal) {
        int smallTotal = 0;
        if (small + big * 5 < goal) {
            return false;
        }
        if (goal / 5 - big > 0) {
            smallTotal = (goal / 5 - big) * 5 + goal % 5;
        } else {
            smallTotal = goal % 5;
        }
        if (smallTotal > small) return false;
        return true;
    }

}