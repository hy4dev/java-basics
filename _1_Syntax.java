/*

- In Java, every application begins with a class name, and that class must match the filename.
- Every line of code that runs in Java must be inside a class. 
- The class name should always start with an uppercase first letter.

- The main() method is required in every Java program.
- It is where the program starts running.
- Any code placed inside the main() method will be executed.
- public, static, and void will be explained later.

- Inside the main() method, we can use the println() method to print a line of text to the screen.
- The curly braces {} mark the beginning and the end of a block of code.
- System.out.println() is a command that means: "Send this text to the screen."
- Here's what each part means:
    - System is a built-in Java class.
    - out is a member of System, short for "output".
    - println() is a method, short for "print line".

- A statement is a programming instruction executed by a computer.    
- Remember that each Java statement must end with a semicolon (;).
- The following statement "instructs" the compiler to print the text "Welcome to Java Programming!" to the screen.
    - System.out.println("Welcome to Java Programming!");

- Comments are used to explain the code and are ignored by the compiler.
- A single-line comment begins with //.
- A multi-line comment is like this note in the multi-line comment.

*/

public class _1_Syntax {
    public static void main(String[] args) {
      System.out.println("Welcome to Java Programming!");
    }
}