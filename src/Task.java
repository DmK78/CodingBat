import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(blackjack(19, 22));
    }


    static public int blackjack(int a, int b) {

        boolean overA = false;
        boolean overB = false;
        if (a < 0 || a > 21) overA = true;
        if (b < 0 || b > 21) overB = true;
        if (!overA && !overB) {
            if (a > b) {
                return a;
            } else return b;
        }
        if (overA && !overB) {
            return b;
        }
        if (!overA && overB) {
            return a;
        }


        return 0;


    }

}