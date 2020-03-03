package Question01;

import java.util.Random;

public class B {

    public static void main(String[] args) {
        Random ran = new Random();
        int[] a = new int[5];
        int z = a.length;
        for (int i = 0; i < a.length; i++) {
            int b = ran.nextInt(10);
            a[i] = b;
            System.out.println(a[i]);
        }
        int sum =0;
        sumarray(a, z,sum);
    }
    public static void sumarray(int[]array ,int length,int sum){
        if(length==0){
            System.out.println("Sum of array "+sum);
        }
        else{
            sum+=array[length-1];
            sumarray(array, length-1, sum);
        }
    }
}
