public class Task {


    public static void main(String[] args) {


        System.out.println(middleThree("dsdasdasdsadsad"));


    }

    static public String middleThree(String str) {
        return str.substring(str.length()/2-1,str.length()/2+2);

    }
}
