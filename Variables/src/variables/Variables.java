/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package variables;

/**
 *
 * @author bus-5170
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        int num = 20;
        
        System.out.println("The value of variable i is " + i);
        
        i =-100;
        
        int x=10+num;
        
        System.out.println("The value of variable i is " + i);
        System.out.println("The value of variable x is " + x);
        System.out.println("The other value of variable num is " + num);
        /*everything you put inside the "" is customizable
        * the plus operator means when the two sides of a plus side are numbers
        then the compiler performs an addition
        * if one of the two side is not a number, but some text then java does not
        perform an addition
        */
    }
    
}
