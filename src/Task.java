import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(bobThere("b9b"));
    }


    static public boolean bobThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {


            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }


}