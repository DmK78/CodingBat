import java.lang.*;

public class Task {


    public static void main(String[] args) {


        System.out.println();
    }


    static public boolean nearTen(int num) {
        if ((num+2)%10==0 || (num-2)%10==0 || (num+1)%10==0 || (num-1)%10==0 || num%10 ==0){
            return true;
        }

        return false;



    }


}