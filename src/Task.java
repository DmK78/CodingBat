import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public int greenTicket(int a, int b, int c) {

        if (a == b && a == c) {
            return 20;
        }
        if (a == b || a == c || b == c) {
            return 10;
        }


        if (a != b && a != c) {
            return 0;
        }

        return 0;

    }
}