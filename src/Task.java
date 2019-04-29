import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean lastDigit(int a, int b, int c) {
        if (rightMost(a) == rightMost(b) || rightMost(a) == rightMost(c) || rightMost(b) == rightMost(c)) {
            return true;
        }
        return false;

    }

    static int rightMost(int n) {
        if (n >= 10) {
            return n % 10;
        }
        return n;
    }
}