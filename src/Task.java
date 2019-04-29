import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            if (a <= b && b <= c) {
                return true;
            }
        } else if (a < b && b < c) {
            return true;
        }
        return false;
    }
}