public class Task {


    public static void main(String[] args) {


        System.out.println(stringYak("yak123ya"));


    }

    static public String stringYak(String str) {
       while (str.indexOf("yak")!=-1){
           str=str.substring(0,str.indexOf("yak"))+str.substring(str.indexOf("yak")+3,str.length());
       }
       return str;
    }
}
