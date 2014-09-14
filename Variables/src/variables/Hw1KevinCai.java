/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variables;

/**
 *
 * @author Kevin
 */
public class Hw1KevinCai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sentence = "Goooogggllee iiss  mmyy  bbeesstt  tteeaacchheerr";
        System.out.println("The starting sentence is " +sentence);
       
        char[] builder = sentence.toCharArray();
        StringBuilder passwd = new StringBuilder();
        for (int i=0; i<sentence.length(); i+=2) {
        if (sentence.charAt(i) != ' ')
        passwd.append(sentence.charAt(i));
}
        System.out.printf("The pasword in task 2 is: %s%n", passwd.toString());
        int passwd1 = passwd.length();
        
        if (passwd1%2 ==0){
        System.out.println(passwd.substring(0, 11)); 
    }
    
}
}