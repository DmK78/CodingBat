import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(repeatFront("Ice Cream", 2));
    }


    static public String repeatFront(String str, int n) {

        if (n==0){
            return "";
        }
        return str.substring(0,n)+repeatFront(str,n-1);


    }


}