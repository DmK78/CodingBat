import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 > 0) {
            return true;
        } else if (n % 5 == 0 && n % 3 > 0) {
            return true;
        }
        return false;

    }


}