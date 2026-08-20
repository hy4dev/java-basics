/*

JAVA TYPE CASTING
- Type casting means converting one data type into another. 
- For example, turning an int into a double.
- In Java, there are two main types of casting:

    Widening Casting (automatic) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manual) - converting a larger type to a smaller type size
    double -> float -> long -> int -> char -> short -> byte

*/

public class _5_Type_Casting {
    public static void main(String[] args) {

        System.out.println("**Widening Casting (automatically)**");
        
        /*

        - Widening casting is done automatically when passing 
          a smaller size type into a larger size type.
        - This works because there is no risk of losing information. 
        - For example, an int value can safely fit inside a double.
        
        */

        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("myInt: " + myInt);                // Outputs 9
        System.out.println("myDouble(cast): " + myDouble);    // Outputs 9.0

        System.out.println("\n**Narrowing Casting (manually)**");

        /*
        
        - Narrowing casting must be done manually 
          by placing the type in parentheses () in front of the value.
        - This is required because narrowing may result in data loss. (
        - For example, dropping decimals when converting a double to an int.

        */

        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println("myDouble2: " + myDouble2);       // Outputs 9.78
        System.out.println("myInt2(cast): " + myInt2);       // Outputs 9

    }
}
