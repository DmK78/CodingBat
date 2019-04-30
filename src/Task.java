import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(mixString("Hi", "There"));
    }


    static public String mixString(String a, String b) {
        if (a.length() == 0) return b;
        if (b.length() == 0) return a;
        return a.substring(0, 1) + b.substring(0, 1) + mixString(a.substring(1, a.length()), b.substring(1, b.length()));


    }


}