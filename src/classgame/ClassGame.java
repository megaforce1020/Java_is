/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classgame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bus-5170
 */
public class ClassGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
            //throws IOException, InputMismatchException 
    {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        int number, error = 0, result, stop;
        String name = "", reply ="";
        String titles = null;
        //only objects can be null, not primitives
        //null means create the variable, but don't let it point to any address
        
        StringBuilder stringToSave = new StringBuilder("");
        
      
        
        /*System.out.println("Please enter the score that you would like to store (-1 to stop)");
        
        number = console.nextInt();
        if (number!=-1){
        
        System.out.println("You entered " +number);
            System.out.println("Please enter name: ");
            console.nextLine();
            name = console.nextLine();
            System.out.println("Your name is " +name);
            
        
        }
        //whenever you read some text after some number you need to do two .nextLine()
        else
            System.out.println("Goodbye");*/
        
        //this bottom part is to catch errors and keep the game going instead of failing
        do {
        System.out.println("Please enter the score that you would like to store (-1 to stop)");
        
        try{
            error=0;
            number = console.nextInt();
        if (number!=-1){
        
        System.out.println("You entered " +number);
            System.out.println("Please enter name: ");
            console.nextLine();
            name = console.nextLine();
            System.out.println("Your name is " +name);
            
            stringToSave.append(name).append("\t").append(number).append("\n");
            
        
        }
        //whenever you read some text after some number you need to do two .nextLine()
        else
            System.out.println("Goodbye");
        }catch(InputMismatchException ime) {
            error = -1;
            System.out.println("You Did not enter a number " +ime);
            console.nextLine();
        }
        }while(error==-1);
        
        BufferedWriter outputBuff = new BufferedWriter(
                                        new FileWriter("outfile.txt", true));
        
        String str = stringToSave.toString();
        outputBuff.write(str);
        
        BufferedReader inputBuff = new BufferedReader(
                                        new FileReader("outfile.txt"));
        
        String read ="";
        while ((read = inputBuff.readLine())!=null) {
            System.out.println("Entry from file: " +read);
        }
        
    }
    
}
