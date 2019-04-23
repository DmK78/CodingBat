public class Task {


    public static void main(String[] args) {


        int numbers[] = {2, 7, 4};
        System.out.println(noTriples(numbers));


    }

    static public String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
