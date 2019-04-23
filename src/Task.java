public class Task {


    public static void main(String[] args) {


        System.out.println(stringMatch("xxcaazz", "xxbaaz"));


    }

    static public int stringMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i <= a.length() - 2; i++) {
            //System.out.println("a " + i + " " + a.substring(i, i + 2));
            if (i <= b.length() - 2 && a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;

    }
}
