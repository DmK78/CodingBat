import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public String fizzString2(int n) {
        if (n % 3 == 0) {
            if (n % 5 == 0) {
                return "FizzBuzz!";
            }
            return "Fizz!";
        }
        if (n % 5 == 0) {
            return "Buzz!";
        }
        return "" + n + "!";

    }
}