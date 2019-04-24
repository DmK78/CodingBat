public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] middleWay(int[] a, int[] b) {
        int arr[]=new int[2];
        arr[0]=a[1];
        arr[1]=b[1];
        return arr;


    }
}