import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(specialEleven(24));
    }


    static public boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 < 2) return true;


        return false;
    }


}