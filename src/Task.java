public class Task {


    public static void main(String[] args) {


        int numbers[] = {2, 7, 4};
        System.out.println(makeOutWord("<<>>", "Yay"));


    }

    static public String makeOutWord(String out, String word) {

        return out.substring(0,2)+word+out.substring(2,4);
    }
}
