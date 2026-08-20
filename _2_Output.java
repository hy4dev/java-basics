/*

- Output here means to display (or print) something on the screen.

PRINT TEXT
- Text must be wrapped inside double quotations marks ("").
    - For an example, System.out.println("Hello World!");
- If you forget the double quotes, an error occurs.

PRINT NUMBERS
- You can also use the println() method to print numbers.
- However, unlike text, we don't put numbers inside double quotes.
- You can also perform mathematical calculations inside the println() method

THE DIFFERENCE BETWEEN println() AND print()
- There is also a print() method, which is similar to println().
- The only difference is that it does not insert a new line at the end of the output.

*/

public class _2_Output {
    public static void main(String[] args) {
        
        System.out.println("**Print Text**");
        // println() method is used to print text with a new line at the end.
        
        System.out.print("Hello!");
        // print() method is used to print text without a new line at the end.
        
        System.out.print("I will be shown on the same line as Hello!");
        // The output will be on same line and no space between the two strings.
        
        System.out.print(" I'm still on the same line but with a space before me.");  
        // The whitespace before "I'm" is to print a space.
        
        System.out.println("\n" + 3.3);
        // "\n" is used to add a new line before the output.
        // This is because the instruction before is using print() instead of println().

        System.out.println(13 * 3);
        // Arithmetic operations can be performed inside the println() method.

    }
}