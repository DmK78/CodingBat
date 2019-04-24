public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] biggerTwo(int[] a, int[] b) {
        if (countSumArray(a)>countSumArray(b))return a;
        if (countSumArray(a)<countSumArray(b))return b;
        return a;
    }
    static public int countSumArray ( int[] array){
        int sum=0;
        for (int i:array){
            sum+=i;
        }
        return sum;
    }
}