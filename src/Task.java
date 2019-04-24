public class Task {


    public static void main(String[] args) {


        System.out.println(roundSum(4, 6, 5));
        }

    static public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);

    }

    static public int round10(int num) {
        if (num<=10){
            if (num>4){
                return 10;
            }else return 0;
        }
        String resultString;
        int resultInt;
        int decimal;

        String numToStr = String.valueOf(num);
        String lastSymbolStr=numToStr.substring(numToStr.length()-1);

        int roundInt = Integer.parseInt(lastSymbolStr);
        if(roundInt<5){
            resultString=numToStr.substring(0,numToStr.length()-1)+"0";
            resultInt=Integer.parseInt(resultString);
            return resultInt;
        }
        decimal=Integer.parseInt(numToStr.substring(numToStr.length()-2,numToStr.length()-1));
        decimal++;
        String decimalStr=String.valueOf(decimal);

        resultString=numToStr.substring(0,numToStr.length()-2)+decimalStr+"0";
        resultInt=Integer.parseInt(resultString);
        return resultInt;
    }
}