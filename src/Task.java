import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(makeBricks(1, 2, 7));
    }


    static public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) return true;
        } else {
            if (cigars >= 40 && cigars <= 60) return true;
        }
        return false;
    }

}