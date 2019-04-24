public class Task {


    public static void main(String[] args) {


        System.out.println(withoutX2("xxHi"));


    }

    static public String withoutX2(String str) {
        String x1="";
        String x2="";
        if (str.length()<2){
            if (str.equals("x")){
                return "";
            }
            return str;
        }
        if (str.charAt(0)=='x'){
            x1="";
        }else x1=str.substring(0,1);

        if (str.charAt(1)=='x'){
            x2="";
        }else x2=str.substring(1,2);
        return x1+x2+str.substring(2,str.length());





    }
}