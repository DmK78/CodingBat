import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(countHi("hi man che kavo hi"));
    }


    static public boolean endOther(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
if (a.length()>b.length()){
    if (a.substring(a.length()-b.length()).equals(b)){
        return true;
    }
} else {
    if (b.substring(b.length()-a.length()).equals(a)){
        return true;
    }
}
return false;

    }


}