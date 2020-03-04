/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question04;

import java.util.Scanner;

/**
 *
 * @author wic190050
 */
public class Tester {
    public static void main(String[] args) {
        try{
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if(str.length()>12){
            throw new Greaterthan12exception("String length is more than 12");
        }
        else{
            System.out.println(str);
        }
        }catch(Greaterthan12exception e){
            System.out.println(e.getMessage());
        }
    }
}
