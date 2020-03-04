/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question04;

/**
 *
 * @author wic190050
 */
public class Greaterthan12exception extends Exception{
    private String s;

    public Greaterthan12exception(){
        super("String Length Greater Than 12 Exception");
    }

    public Greaterthan12exception(String string) {
        super(string);
    }
    
   
    
}
