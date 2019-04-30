import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(repeatSeparator("Word", "X", 3));
    }


    static public String repeatSeparator(String word, String sep, int count) {
        if (count==0) return "";
        if (count == 1) {
            return word;}
            return word + sep + repeatSeparator(word, sep, count - 1);



    }


}