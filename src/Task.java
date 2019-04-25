import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(makeBricks(1, 2, 7));
    }


    static public int dateFashion(int you, int date) {
        if (date<3 || you<3) return 0;
        if (you>7 || date>7) return 2;
        return 1;

    }

}