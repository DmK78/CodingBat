import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean less20(int n) {
        if ((n + 1) % 20 == 0 || (n + 2) % 20 == 0) return true;
        return false;


    }


}