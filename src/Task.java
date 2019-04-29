import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public String fizzString(String str) {
        if (str.charAt(0) == 'f') {
            if (str.charAt(str.length()-1) == 'b') {
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if (str.charAt(str.length()-1) == 'b') {
            return "Buzz";
        }

        return str;

    }
}