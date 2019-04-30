import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(xyBalance("y"));
    }


    static public boolean xyBalance(String str) {
        int posX = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                posX = i;
            }
        }
        if (posX != -1) {
            for (int i = posX + 1; i < str.length(); i++) {
                if (str.charAt(i) == 'y') {
                    return true;
                }
            }
        } else return true;
        return false;

    }


}