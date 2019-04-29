import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean lessBy10(int a, int b, int c) {
        if (Math.abs(a-b)>=10 || Math.abs(a-c)>=10 || Math.abs(b-c)>=10){
            return true;
        }
        return false;
    }
}