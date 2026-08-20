/*

JAVA DATA TYPES
- Data types in Java are divided into two groups:
    - Primitive data types - includes byte, short, int, long, float, double, boolean and char.
    - Non-primitive data types - such as String, Arrays and Classes (will be explained later).

YOU CAN'T CHANGE DATA TYPE
- Once a variable is declared, you cannot change its data type.
- Example:

    int myNum = 5;          // myNum is an int
    myNum = "Hello";        // Error: cannot assign a String to an int

    String myText = "Hi";   // myText is a String
    myText = 123;           // Error: cannot assign a number to a String

NUMBERS
- Primitive number types are divided into two groups:
    - Integer types.
        - Stores whole numbers, positive or negative (such as 123 or -456), without decimals.  
        - Valid types are byte, short, int and long. 
    - Floating point types 
        - Represents numbers with a fractional part, containing one or more decimals. 
        - There are two types: float and double.

THE var KEYWORD
- The var keyword was introduced in Java 10 (released in 2018).
- The var keyword lets the compiler automatically detect the type of a variable 
  based on the value you assign to it.
- This helps you write cleaner code and avoid repeating types, especially for 
  long or complex types.
- For example, instead of writing int x = 5; you can write var x = 5. 
- The compiler will automatically infer that x is of type int.
- However, the var keyword can only be used for local variables inside methods, 
  and cannot be used for class fields or method parameters.

NON-PRIMITIVE DATA TYPES
- Non-primitive data types are called reference types because they refer to objects.
- The main differences between primitive and non-primitive data types are:
    
    - Primitive types in Java are predefined and built into the language, 
    while non-primitive types are created by the programmer (except for String).
    
    - Non-primitive types can be used to call methods to perform certain operations, 
    whereas primitive types cannot.

    - Primitive types start with a lowercase letter (like int), 
    while non-primitive types typically starts with an uppercase letter (like String).

    - Primitive types always hold a value, whereas non-primitive types can be null.

*/

public class _4_Data_Types {
    public static void main(String[] args) {

        System.out.println("**Primitive Integer Data Types**");

        byte myByte = 100;
        System.out.println("myByte: " + myByte);

        myByte = 127;               
        // byte can store values from -128 to 127.
        
        // YOU CAN'T CHANGE DATA TYPE
        // myByte = "Hello"; // Error: cannot assign a String to a byte variable.

        short myShort = 5000;       
        // short can store values from -32,768 to 32,767.
        System.out.println("myShort: " + myShort);

        int myInt = 100000;          
        // int can store values from -2,147,483,648 to 2,147,483,647.
        System.out.println("myInt: " + myInt);

        long myLong = 1000000L;      
        // long can store values from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        // This is used when int is not large enough to store the value. 
        // Note that you should end the value with an "L"
        System.out.println("myLong: " + myLong + "\n");

        System.out.println("**Primitive Floating Point Data Types**");
        
        float myFloat = 5.75f;
        // float can store fractional numbers from 3.4e−038 to 3.4e+038. 
        // Note that you should end the value with an "f"
        System.out.println("myFloat: " + myFloat);

        double myDouble = 19.99d;
        // double can store fractional numbers from 1.7e−308 to 1.7e+308. 
        // Note that you should end the value with a "d"
        System.out.println("myDouble: " + myDouble + "\n");

        /* 
        Use float or double?
        - The precision of float is only 6-7 decimal digits.
        - Double variables have a precision of about 16 digits.
        - Therefore it is safer and accurate to use double for most calculations.
        */

        System.out.println("**Scientific Numbers**");

        // A floating point number can also be a scientific number with an "e" to indicate the power of 10.
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println("f1: " + f1);
        System.out.println("d1: " + d1);

        System.out.println("\n**Primitive Boolean Data Type**");
        
        /*
        - Very often in programming, you will need a data type that can only have 
          one of two values, like:
            - YES / NO
            - ON / OFF
            - TRUE / FALSE
        - For this, Java has a boolean data type, which can only take the values true or false.
        */ 

        boolean isJavaFun = true;   
        boolean isJavaHard = false;
        // boolean can only take the values true or false (case-sensitive, t and f in lowercase).
        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Java Hard? " + isJavaHard + "\n");

        System.out.println("**Primitive Character Data Type**");
        // The char data type is used to store a single character. 
        // The character must be surrounded by single quotes, like 'A' or 'c'
        char myGrade = 'A';
        System.out.println("myGrade: " + myGrade + "\n");

        System.out.println("**var Keyword**");
        /* 
        - var only works when you assign a value at the same time
          (you can't declare var x; without assigning a value).

                var x; // Error
                var x = 5;  // OK

        - Once a variable is declared with var, you cannot change its type later.

                var x = 5;  // x is now an int
                x = 10;     // OK - still an int
                x = 9.99;   // Error - can't assign a double to an int
        */
        var x = 5; // x is of type int
        var y = 5.5; // y is of type double
        var z = "Hello"; // z is of type String

        System.out.println("x: " + ((Object)x).getClass().getSimpleName());
        System.out.println("y: " + ((Object)y).getClass().getSimpleName());
        System.out.println("z: " + ((Object)z).getClass().getSimpleName());

        System.out.println("\n**Non-Primitive Data Types**");
        System.out.println("Strings, Arrays, and Classes will be explained later.");

    }
}