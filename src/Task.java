import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(in1To10(9, true));
    }


    static public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            if (n <= 1 || n >= 10) {
                return true;
            }
        } else if (n >= 1 && n <= 10) {
            return true;
        }

        return false;
    }

}