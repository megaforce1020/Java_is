
Class Notes 9/4/14
==================

Class Definition
----------------

Your "public class" is the name of your file

Method Definition
-----------------

Inside the class "Main" you have a method "main"
You can have as many methods as you want 0-infinity
You usually want to have at least one method
Your commands go inside methods
If you do not have a main method then that class cannot be called upon to run
So if you do not have a method called "main" then the program cannot run
Compile time error is error that shows up when your IDE catches these errors such as leaving out a ; or )
Runtime error will show up when you try to run the program
methods are enclosed inside ()
a command or instruction example: System.out.println("");
REMEMBER: your commands must end with a semi-colon
Method definition and class definition do not need semi-colon to end the string
Properties of method definition:

* [.public - is that any file in that project can have knowledge of methods inside that project
* [.static - is another project of a method.  You can access this method without creating another class for this method.
* [.void - tells you that when this method execute and it finishes execution does it return to another object or file to give another answer.  Does it give you an output or status.  Void means no answer
* [.(.) - anything that goes inside a method

Members are methods and variables because they are both inside a class
All methods are followed by parenthesis
Variables and fields are mostly the same thing 

BUILD
-----

When you clean and build a java program or .java file it will build a .jar files (java zip file)
and place it inside the dist folder in your java project home directory
The .jar file has your byte files, libraries, and everything else that is required to run this java programs on another computer
The java jar file is calling the JRE to run the java program