import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public int greenTicket(int a, int b, int c) {

        if (a + b == 10 || a + c == 10 || b + c == 10) {
            return 10;
        }
        if ((a + b) - (a + c) >= 10 || (a + b) - (b + c) >= 10) {
            return 5;
        }

        return 0;

    }
}