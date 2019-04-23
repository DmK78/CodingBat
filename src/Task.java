public class Task {


    public static void main(String[] args) {


        System.out.println(firstHalf("Hello"));


    }

    static public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else return a + b + a;


    }
}
