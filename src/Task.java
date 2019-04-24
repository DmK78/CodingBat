public class Task {


    public static void main(String[] args) {


        System.out.println(startWord("hip", "zig"));


    }

    static public String startWord(String str, String word) {
        int count = 1;
        if (str.length() == 0 || word.length() == 0) return "";
        if (word.length() > 1 && str.length() > 1) {
            if (word.substring(1, 2).equals(str.substring(1, 2))) {
                boolean isMatch = true;
                while (isMatch) {
                    if (word.substring(count, count + 1).equals(str.substring(count, count + 1))) {
                        count++;
                        if (count >= word.length()) break;

                    } else isMatch = false;

                }
                return str.substring(0, count);
            }else return "";

        }
        if (str.length()==1 && word.length()==1) return str;
        if (word.length()==1 ) return str.substring(0,1);




        return "";


    }
}