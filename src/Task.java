import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(makeBricks(1, 2, 7));
    }


    static public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            if (temp >= 60 && temp <= 100) return true;
        } else
            if (temp >= 60 && temp <= 90) return true;
        return false;

    }

}