import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public int sumLimit(int a, int b) {
        if (String.valueOf(a + b).length() > String.valueOf(a).length()) {
            return a;
        }
        return a + b;


    }
}