public class Task {


    public static void main(String[] args) {


        System.out.println(doubleX("aaaax"));


    }

    static boolean doubleX(String str) {
        int i = str.indexOf("x");

        if (i >= str.length()-1) {
            return false;
        }

        if (str.substring(i + 1, i + 2).contains("x")) return true;
        else return false;


    }


}
