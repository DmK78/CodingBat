public class Task {


    public static void main(String[] args) {


        System.out.println(twoChar("java", 3));


    }

    static public String twoChar(String str, int index) {
        if(str.length()-(index)>=2 && index>0){
            return str.substring(index,index+2);
        }else return str.substring(0,2);

    }
}
