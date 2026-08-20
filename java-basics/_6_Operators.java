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
- The following table lists some of the assignment operators in Java:

    Operator    Example     Same As
    =           x = 5       x = 5
    +=          x += 3      x = x + 3
    -=          x -= 3      x = x - 3
    *=          x *= 3      x = x * 3
    /=          x /= 3      x = x / 3
    %=          x %= 3      x = x % 3
 
COMPARISON OPERATORS
- Comparison operators are used to compare two values (or variables). 
- This is important in programming, because it helps us to find answers and make decisions.
- The return value of a comparison is either true or false. 
- These values are known as Boolean values.
- A list of comparison operators in Java is shown in the following table:

    Operator    Name                        Example
    ==          Equal to                    x == y
    !=          Not equal to                x != y
    >           Greater than                x > y
    <           Less than                   x < y
    >=          Greater than or equal to    x >= y
    <=          Less than or equal to       x <= y

LOGICAL OPERATORS
- As with comparison operators, you can also test for true or false values with logical operators.
- Logical operators are used to determine the logic between variables or values, 
  by combining multiple conditions.
- The following table lists the logical operators in Java:

    Operator    Name            Desription                                          Example
    &&          Logical AND     Returns true if both statements are true            x < 5 && y < 10
    ||          Logical OR      Returns true if one of the statements is true       x < 5 || y < 4
    !           Logical NOT     Reverse the result                                  !(x < 5 && y < 10)

    0 - False
    1 - True

    AND
    x   y   AND
    0   0   0
    1   0   0
    0   1   0
    1   1   1
    
    OR
    x   y   OR
    0   0   0
    1   0   1
    0   1   1
    1   1   1

    NOT
    x   NOT
    0   1
    1   0

OPERATOR PRECEDENCE
- When a calculation contains more than one operator, Java follows order of 
  PEMDAS operations rules to decide which part to calculate first.
- PEMDAS - Parentheses, Exponents, Multiplication, Division, Addition, and Subtraction.

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

        System.out.println("\n**Assignment Operators**");

        int savings = 100; // Initial savings amount.
        savings += 50; // Add 50 to the savings.
        System.out.println("Current savings: " + savings);

        System.out.println("\n**Comparison Operators**");
        
        int x1 = 5;
        int y1 = 3;
        
        System.out.println("x1 == y1: " + (x1 == y1));
        System.out.println("x1 != y1: " + (x1 != y1));
        System.out.println("x1 > y1: " + (x1 > y1));
        System.out.println("x1 < y1: " + (x1 < y1));
        System.out.println("x1 >= y1: " + (x1 >= y1));
        System.out.println("x1 <= y1: " + (x1 <= y1) + "\n");

        // Another comparison example.
        int age = 18;
        System.out.println("Old enough to vote? > " + (age >= 18) + "\n");

        int pwdLength = 5;
        System.out.println("Password is long enough? > " + (pwdLength >= 8) + "\n");

        System.out.println("**Logical Operators**");
        
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Admin logged in? > " + (isLoggedIn && isAdmin));
        // The query is admin AND currently logged in.

        System.out.println("Has access? > " + (isLoggedIn || isAdmin));
        // The query is has access regardless of user or admin.
        // So, we can use isLoggedIn OR isAdmin.
        // Or, much easier just use isLoggedIn current state.

        System.out.println("Not logged in? > " + (!isLoggedIn));
        // The query is NOT logged in.
        // So, inverse the current stated of isLoggedIn, which is !isLoggedIN.
        // If the query is about logged in, then just use isLoggedIn.

        System.out.println("\n**Operator Precedence");

        // PEMDAS
        // Subtraction and addition are done from left to right, unless you add parentheses.
        int result1 = 10 - 2 + 5;    // (10 - 2) + 5 = 13
        int result2 = 10 - (2 + 5);  // 10 - 7 = 3

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2 + "\n");

        // Same case for division and multiplication.
        int result3 = 10 / 2 * 5;    
        int result4 = 10 / (2 * 5);  

        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4 + "\n");

        int result5 = 2 + 3 * 4;    // Calculate multiplication first.
        int result6 = (2 + 3) * 4;  // Calculate in parentheses first.

        System.out.println("result5: " + result5);
        System.out.println("result6: " + result6);

    }
}