public class Task {


    public static void main(String[] args) {



        System.out.println(firstHalf("Hello"));


    }

    static public String firstHalf(String str) {
        return str.substring(0,str.length()/2);


    }
}
