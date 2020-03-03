package Question01;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.print("N: ");
        int N = g.nextInt();
        System.out.println("Sum of first "+N+" cubes: ");
        int sum =0;
        sumofcubes(N,sum);
    }
    public static void sumofcubes(int N,int sum){
        if(N==0){
            System.out.println(sum);
        }
        else{
            sum+=Math.pow(N, 3);
            sumofcubes(N-1, sum);
        }
    }
}
