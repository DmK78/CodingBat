import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(makeChocolate(1, 2, 7));
    }


    static public int makeChocolate(int small, int big, int goal) {
        int smallTotal = 0;
        if (small + big * 5 < goal) {
            return -1;
        }
        if (goal / 5 - big > 0) {
            smallTotal = (goal / 5 - big) * 5 + goal % 5;
        } else {
            smallTotal = goal % 5;
        }
        if (smallTotal > small) return -1;
        return smallTotal;
    }

}