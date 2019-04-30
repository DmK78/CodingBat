import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(repeatEnd("1234", 2));
    }


    static public String repeatEnd(String str, int n) {
        if (str.length() == 0 || n < 1) {
            return "";
        }
        if (str.charAt(0) == '!') {
            str = str.substring(1, str.length());
        } else {
            str = str.substring(str.length() - n, str.length());
        }
        int count = n;
        if (count == 0) {
            return "";
        }

        count--;
        return str + repeatEnd("!" + str, count);


    }


}