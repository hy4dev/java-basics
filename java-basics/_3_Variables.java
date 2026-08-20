/*

VARIABLES    
- Variables are containers for storing data values.
- In Java, there are different types of variables, for example:
    - String: stores text, such as "Hello". String values are surrounded by double quotes.
    - int: stores integers (whole numbers), without decimals, such as 123 or -123.
    - float: stores floating point numbers, with decimals, such as 19.99 or -19.99.
    - char: stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes.
    - boolean: stores values with two states: true or false.
- Syntax for declaring a variable:
    - type variableName = value;

DISPLAY VARIABLES
- The println() method is often used to display variables.
- To combine both text and a variable, use the + character.
- You can also use the + character to display a variable with another variable.
- In Java, the + symbol has two meanings:
    - For text (strings), it joins them together (called concatenation).
    - For numbers, it adds values together.

IDENTIFIERS
- All Java variables must be identified with unique names.
- These unique names are called identifiers.
- Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
- It is recommended to use descriptive names in order to create understandable and maintainable code.
- Example:

    // Good
    int minutesPerHour = 60;

    // OK, but not so easy to understand what m actually is
    int m = 60;

- The general rules for naming variables are:
    - Names can contain letters, digits, underscores, and dollar signs.
    - Names must begin with a letter.
    - Names should start with a lowercase letter, and cannot contain whitespace.
    - Names can also begin with $ and _.
    - Names are case-sensitive ("myVar" and "myvar" are different variables).
    - Reserved words (like Java keywords, such as int or boolean) cannot be used as names.

CONSTANTS
- When you do not want a variable's value to change, use the final keyword.
- A variable declared with final becomes a constant, which means unchangeable and read-only.
- Example:

    final int myNum = 15;
    myNum = 20; // Error: cannot assign a value to final variable 'myNum'

- You should declare variables as final when their values should never change.
- Example:

    final double PI = 3.14159;
    final int MINUTES_PER_HOUR = 60;
    System.out.println(PI); // Outputs 3.14159
    System.out.println(MINUTES_PER_HOUR); // Outputs 60

*/

public class _3_Variables {
    public static void main(String[] args) {

        // Declaring variables.
        String name = "John";
        int myNum; // Declaring a variable, myNum without assigning a value.
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        myNum = 15; // Assigning a value to myNum.
        
        System.out.println("**Displaying Variables**");
        System.out.println("name: " + name);
        System.out.println("myNum: " + myNum);
        System.out.println("myFloatNum: " + myFloatNum);
        System.out.println("myLetter: " + myLetter);
        System.out.println("myBool: " + myBool + "\n"); 
        // "\n" adds a new line after the output.
        
        System.out.println("**Changing Variable Values**");
        myFloatNum = 10.50f; // Assigning a new value to myFloatNum.
        System.out.println("New myFloatNum = " + myFloatNum + "\n"); 

        System.out.println("**Displaying Combined Values**");
        String firstName = "John";
        String lastName = "Doe";
        // + character to display a variable with another variable.
        System.out.println("Full name: " + firstName + " " + lastName + "\n"); 

        System.out.println("**Displaying Text and Numbers**");
        int x = 5;
        int y = 10;

        System.out.println("x + y in Parentheses");
        // x + y in parentheses (number addition).
        System.out.println("Sum of x and y: " + (x + y) + "\n"); 
        
        // Be careful when combining text and numbers in the same line of code. 
        // Without parentheses, Java will treat the numbers as text after the first string.
        
        System.out.println("x + y Not in Parentheses");
        // x + y without parentheses (string concatenation).
        System.out.println("Sum of x and y: " + x + y + "\n"); 

        // Example
        System.out.println("**Calculate the Area of a Rectangle**");
        int length = 5;
        int width = 3;
        int area;

        area = length * width;
        System.out.println("Area of rectangle is " + area);
        
    }
}