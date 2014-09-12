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
        //* [."=" is the assignment operator and assigns the value 
        //on the right hand sign and assign it to the variable in the left hand side
        
        System.out.println("The value of variable i is \n" + i);
        //back slash "\n" puts the value i on the next line
        //the string is a bunch of chars stored together inside ""
        //This is a string: "The value of variable i is \n"
        //String + int is concatenation
        System.out.println(num + 10);
        System.out.println("The value of variable i is " +1 +"\nThe value of the second int num is " +num);
        System.out.println("The values of i and num are: " +i +", " +num);
        // ", " you have to use double quotes here because the space is a character
        
        
        
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
        
        float myFloat = 2.56F;
        //when creating a value in decimal you have to put a capital F at the end
        short shortNumber = 43;
        char myChar = 'B';
        boolean answer = true;
        boolean answer2 = !true;
        //answer2 is the opposite of answer
        
        int i2 =0;
        
        int sum = i + i2+ num;
        int difference = i - i2;
        int product = i2 * num;
        int quotient = i / num;
        //int quotient2 = num / i;
        //This is a decimal, and INT will drop all the decimal places and contain the whole number
        float quotient2 = ((float)num/i);
        //so we went from an int to a float, if you do it vice versa you will lose information
        
        System.out.println("Show values " +sum + ", " +difference + ", " +product + ", " +quotient + ", " +quotient2);
        
        //short handed way of typing: sum - sum + 10;
        sum+=10;
        sum-=10;
        
        
        System.out.println("Show my " + myFloat);
        System.out.println("Show my " + shortNumber);
        System.out.println("Show my " + myChar);
        
        int output = num++;
        int output2 = ++num;
        
        
        //relational operators
        
        int score =90;
        int attendence =100;
        if (score > 90){
            System.out.println("Grade is A");
            //since 85 is not >90 then it will skip the line above and go to the next string
        }
        else if (score >=80 /*&& score<90*/){
            //&& score<90 <-- this is unnecessary because the code will go to this anyways
            System.out.println("Grade is a B");
        }
        else{
            System.out.println("not A");
            System.out.println("Sucker");
        }//In if else statements, once it encounters one that is true then it will skip the rest
         //inside if else statements it is a boolean for example: score ==100 is boolean because
        // it is either yes or no
        
        
        if (score == 100 || attendence == 100){
            System.out.println("Excellent Work");
        }
        /*if (score == 100 && attendence == 100){
            System.out.println("Terrible work");
        }*/
    
    /**************************************Strings and Arrays ******************/
        
    
        String s = "This is a beaut";
        String s1 = new String ("Waitttt...");
        //new String is telling Java to get a object from the class string
        s = s+ s1;
        //s1 is a string object
        System.out.println(s1);
        
        int stringLength = s1.length();
        System.out.println("how long is s1 " +stringLength);
        
    }
    
    
    
}
