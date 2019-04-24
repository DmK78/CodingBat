public class Task {


    public static void main(String[] args) {

        int number[] = {1, 2, 3};
        System.out.println(maxEnd3(number));


    }

    static public int[] plusTwo(int[] a, int[] b) {
        int arr[] = new int[a.length + b.length];
        for (int i=0;i<a.length;i++){
            arr[i]=a[i];
            arr[i+a.length]=b[i];
        }
        return arr;
    }
}