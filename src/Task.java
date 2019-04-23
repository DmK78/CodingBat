public class Task {


    public static void main(String[] args) {


        System.out.println(hasBad("badxx"));


    }

    static public String atFirst(String str) {
        switch (str.length()) {
            case 0:
                return "@@";
            case 1:
                return str + "@";
            default:
                return str.substring(0, 2);

        }
    }
}
