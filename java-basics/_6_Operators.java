/*

JAVA OPERATORS
- Java divides the operators into the following groups:
    - Arithmetic operators
    - Assignment operators
    - Comparison operators
    - Logical operators

ARITHMETIC OPERATORS
- Arithmetic operators are used to perform common mathematical operations.
- The following table lists the arithmetic operators in Java:   

    Operator    Name            Example
    +           Addition        x + y
    -           Subtraction     x - y
    *           Multiplication  x * y
    /           Division        x / y
    %           Modulus         x % y
    ++          Increment       x++
    --          Decrement       x--
    - It follows the order of operations (PEMDAS) when evaluating expressions with multiple operators.
 
ASSIGNMENT OPERATORS
- Assignment operators are used to assign values to variables.
- The following table lists the assignment operators in Java:

    Operator    Example     Same As
    =           x = 5       x = 5
    +=          x += 3      x = x + 3
    -=          x -= 3      x = x - 3
    *=          x *= 3      x = x * 3
    /=          x /= 3      x = x / 3
    %=          x %= 3      x = x % 3
 


*/

public class _6_Operators {
    public static void main(String[] args) {

        System.out.println("**Arithmetic Operators**");

        int x = 10;
        int y = 5;

        System.out.println("x + y = " + (x + y)); // Outputs 15
        System.out.println("x - y = " + (x - y)); // Outputs 5
        System.out.println("x * y = " + (x * y)); // Outputs 50
        System.out.println("x / y = " + (x / y)); // Outputs 2
        System.out.println("x % y = " + (x % y)); // Outputs 0

        // The ++ operator increases a value by 1. 
        // The -- operator decreases a value by 1.

        x++; // Increment x by 1
        System.out.println("After incrementing, x = " + x); // Outputs 11

        y--; // Decrement y by 1
        System.out.println("After decrementing, y = " + y); // Outputs 4

        /*
        
        - When dividing two integers in Java, the result will also be an integer. 
        - For example, 10 / 3 gives 3. 
        - If you want a decimal result, use double values, like 10.0 / 3.0.

        */

        int a = 10;
        int b = 3;
        System.out. println("Integer division a / b = " + (a/b));

        double c = 10.0d;
        double d = 3.0d;
        System.out.println("Double division c / d = " + (c/d));
    }
}