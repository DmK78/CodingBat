public class Task {


    public static void main(String[] args) {


        int numbers[] = {2, 7, 4};
        System.out.println(extraEnd("Hello"));


    }

    static public String extraEnd(String str) {

        String result = "";
        for (int i = 0; i < 3; i++) {
            result = result + str.substring(str.length() - 2, str.length());
        }
        return result;
    }
}
