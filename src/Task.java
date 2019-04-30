import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(xyzThere("abc.xyz"));
    }


    static public boolean xyzThere(String str) {
        boolean isTrue = false;
        String looking = "xyz";
        for (int i = 0; i < (str.length() - looking.length()+1); i++) {
            if (str.substring(i, i + looking.length()).equals(looking)) {
                if (i > 0 && str.substring(i - 1, i).equals(".")) {
                    isTrue=false;
                } else isTrue=true;

            }
        }
        return isTrue;
    }


}