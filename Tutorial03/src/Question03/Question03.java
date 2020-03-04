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

    }

    public static void writeBlock(char a, int length, int width) {
        if (length != 0&&width!=0) {
            System.out.print(a);
            writeBlock(a, length - 1,width);
            
        }
        else if(length==0){
            System.out.println("");
             writeBlock(a, length+1, width-1);
        }
        else if(width!=0){
            System.out.print(a);
            writeBlock(a, length-1, width-1);
        }else{
            System.out.println("");
        }

    }
}
