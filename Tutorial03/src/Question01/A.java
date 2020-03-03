/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01;

import java.util.Random;

/**
 *
 * @author ACER
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        int[] a = new int[5];
        int z = a.length;
        for (int i = 0; i < a.length; i++) {
            int b = ran.nextInt(10);
            a[i] = b;
            System.out.println(a[i]);
        }
        smallestelement(a, z);
    }

    public static void smallestelement(int[] n, int z) {
        if (z == 1) {
            System.out.println("The smallest element in an array is " + n[z]);
        } else {
            if (n[z - 1] > n[z - 2]) {
                n[z-1]=n[z-2];
                smallestelement(n, z - 1);
            }
            else{
                n[z-2]=n[z-1];
                smallestelement(n, z-1);
            }
        }
    }
}
