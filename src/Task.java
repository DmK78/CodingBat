import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(closeFar(4, 1, 3));
    }


    static public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) < 2 || Math.abs(a - c) < 2) {
            if (Math.abs(a - c) > 1 && Math.abs(b - c) > 1 || Math.abs(a - b) > 1 && Math.abs(b - c) > 1) {
                return true;
            }

        }
        return false;
    }
}