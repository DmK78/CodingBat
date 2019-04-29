import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean twoAsOne(int a, int b, int c) {
        if (Math.abs(a + b) == Math.abs(c) || Math.abs(a - b) == Math.abs(c)) {
            return true;
        }
        return false;

    }
}