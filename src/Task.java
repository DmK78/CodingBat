public class Task {


    public static void main(String[] args) {


        System.out.println(altPairs("CodingHorror"));


    }

    static public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + 4) {
            if (i <= str.length() - 1) {
                result = result + str.substring(i, i + 1);
            }
            if (i <= str.length() - 2) {
                result = result + str.substring(i + 1, i + 2);
            }
        }
        return result;
    }
}
