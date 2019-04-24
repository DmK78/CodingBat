public class Task {


    public static void main(String[] args) {


        System.out.println(withoutX("x"));


    }

    static public String withoutX(String str) {

        if (str.length()<2){
            if (str==""){
                return str;
            }else if (str.equals("x")){
                return "";
            }
        }


        if (str.substring(0, 1).contains("x")) {
            str = str.substring(1, str.length());

        }
        if (str.substring(str.length() - 1, str.length()).contains("x")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;


    }
}