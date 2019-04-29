import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else {
            if (isMom) return true;
        }
        if (isMorning) {
            return false;
        }
        return true;

    }


}