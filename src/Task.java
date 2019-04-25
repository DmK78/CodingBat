import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(makeBricks(1, 2, 7));
    }


    static public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday){
            if (speed<=60) return 0;
            if (speed>=60 && speed<=80) return 1;
            if (speed>80) return 2;
        }else {
            if (speed<=65) return 0;
            if (speed>=65 && speed<=85) return 1;
            if (speed>85) return 2;
        }

return 0;


    }

}