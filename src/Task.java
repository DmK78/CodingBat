import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            if (c > b) {
                return true;
            }
            return false;
        }
        if (b > a && c > b) {
            return true;
        }
        return false;

    }
}