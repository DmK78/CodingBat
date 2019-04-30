import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean shareDigit(int a, int b) {
        if (a < 10 && b < 10 && a == b) {
            return true;
        }
        if (a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b / 10 || a % 10 == b % 10) {
            return true;
        }
        return false;



    }
}