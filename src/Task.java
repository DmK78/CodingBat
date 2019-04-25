import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println(evenlySpaced(2, 2, 2));
    }


    static public boolean evenlySpaced(int a, int b, int c) {
        int max = 0;
        int middle = 0;
        int min = 0;
        int array[] = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        max = array[0];
        min = array[0];
        array[0] = a;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i : array) {
            if (i != max && i != min) {
                middle = i;
            }
        }
        if (a == b && b == c) return true;
        //System.out.println(min+" "+middle+" "+max);
        if ((middle - min) == (max - middle)) {
            return true;
        }

        return false;


    }

}