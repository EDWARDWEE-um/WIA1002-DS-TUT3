/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question02;

/**
 *
 * @author wic190050
 */
public class Question02 {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        System.out.println(Acker(m, n));
        int y = 2;
        int z = 5;
        System.out.println(Acker(y, z));
    }
    public static int Acker(int m, int n){
        if(m==0){
           return n+1;
        }
        else if(n==0){
          return Acker(m-1, 1);
        }
        else{
          return  Acker(m-1, Acker(m, n-1));
        }
    }
}
