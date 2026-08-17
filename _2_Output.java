/*

PRINT TEXT
- Text must be wrapped inside double quotations marks ("").
    - For an example, System.out.println("Hello World!");
- If you forget the double quotes, an error occurs.

PRINT NUMBERS
- You can also use the println() method to print numbers.
- However, unlike text, we don't put numbers inside double quotes.
- You can also perform mathematical calculations inside the println() method

println() vs print()
- There is also a print() method, which is similar to println().
- The only difference is that it does not insert a new line at the end of the output.

*/

public class _2_Output {
    public static void main(String[] args) {
        System.out.println("Print Text");
        System.out.print("Hello!");
        System.out.print("I will be shown on the same line as Hello!");
        // The output will be on same line and no space between the two strings.
        System.out.print(" I'm on the same line!");  // See the whitespace before I'm.
        
        System.out.println("");
        System.out.println(3.3);
        System.out.println(13 * 3);
    }
}