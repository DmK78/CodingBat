import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(countHi("hi man che kavo hi"));
    }


    static public int countHi(String str) {
        if (str.indexOf("hi")==-1){
            return 0;
        }
      return 1+countHi(str.substring(0,str.indexOf("hi"))+str.substring(str.indexOf("hi")+2,str.length()));


    }
}