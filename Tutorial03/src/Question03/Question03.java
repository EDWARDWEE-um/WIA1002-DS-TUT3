/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author wic190050
 */
public class Question03 {

    public static void main(String[] args) {
        // writeLine('$', 3);
        writeBlock('$', 3, 2);
    }

    public static void writeLine(char a, int length) {
        if (length != 0) {
            System.out.print(a);
            writeLine(a, length - 1);
        }
        else{
            System.out.println("");
        }

    }

    public static void writeBlock(char a, int length, int width) {
        if(width!=0){
            writeLine(a, length);
            writeBlock(a, length, width-1);
        }

    }
}
