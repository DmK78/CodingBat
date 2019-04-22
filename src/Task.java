public class Task {


    public static void main(String[] args) {


        System.out.println(stringBits("Heeololeo"));


    }

    static public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < (str.length()); i = i + 2) {
            result = result + str.substring(i, i + 1);

        }
        return result;
    }


}
