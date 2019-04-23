public class Task {


    public static void main(String[] args) {


        System.out.println(stringX("xxHxix"));


    }

    static public String stringX(String str) {
        if (str.length()<3)return str;
        String result = str.substring(0, 1);
        for (int i = 1; i < str.length() - 1; i++) {

            if (!str.substring(i, i + 1).contains("x")) {
                result = result + str.substring(i, i + 1);
            }

        }
        result = result + str.substring(str.length() - 1, str.length());
        return result;
    }
}
