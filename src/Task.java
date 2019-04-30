import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(countHi("hi man che kavo hi"));
    }


    static public boolean catDog(String str) {
        if (countAnyone(str, "cat") == countAnyone(str, "dog")) {
            return true;
        }
        return false;

    }

    static public int countAnyone(String str, String find) {
        if (str.indexOf(find) == -1) {
            return 0;
        }
        return 1 + countAnyone(str.substring(0, str.indexOf(find)) + str.substring(str.indexOf(find) + find.length(), str.length()), find);
//
    }
}