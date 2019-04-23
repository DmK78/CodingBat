public class Task {


    public static void main(String[] args) {


        System.out.println(hasBad("badxx"));


    }

    static public boolean hasBad(String str) {
                if(str.indexOf("bad")==0 && str.indexOf("bad")==1){
            return true;
        }else return false;

    }
}
