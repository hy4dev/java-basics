/*

STRINGS
- Strings are used for storing text.
- A String variable contains a collection of characters surrounded by double quotes ("").

STRING LENGTH
- A String in Java is actually an object, which means it contains methods that can perform certain operations on strings.
- For example, you can find the length of a string with the length() method.

        txt.length()

- There are many string methods available in Java:
    - The toUpperCase() method converts a string to upper case letters.
    - The toLowerCase() method converts a string to lower case letters.
    - The indexOf() method returns the index (the position) of the first occurrence 
      of a specified text in a string (including whitespace).
    - To compare two strings, you can use the equals() method.
    - The trim() method removes whitespace from the beginning and the end of a string.
- Many other string methods can be referred from https://www.w3schools.com/java/java_ref_string.asp.

SPECIAL CHARACTERS
- A special character is any symbol, mark, or punctuation sign that is not a letter (A–Z) or a number (0–9) such as "" and ''.
- Because strings must be written within quotes "", Java will misunderstand below string, and generate an error.

    String txt = "We are the so-called "Vikings" from the north.";

- The solution to avoid this problem, is to use the backslash escape character.
- The backslash \ escape character turns special characters into string characters.

Escape character	Result	Description
\'	              '	      Single quote
\"	              "	      Double quote
\\	              \	      Backslash

- The sequence \"  inserts a double quote in a string like below:

    String txt = "We are the so-called \"Vikings\" from the north.";

*/

public class _7_Strings {
    public static void main(String[] args) {

        System.out.println("**String Methods**\n");

        // .length() method
        System.out.println(".length() method");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt);
        System.out.println("The length of txt string is: " + txt.length() + "\n");

        // .toUpperCase() and .toLowerCase() method
        System.out.println(".toUpperCase() and .toLowerCase() method");
        txt = "Hello World!";
        System.out.println(txt);
        System.out.println("To Uppercase: " + txt.toUpperCase());
        System.out.println("To Lowercase: " + txt.toLowerCase() + "\n");

        /*
        - The .indexOf() method returns the index (the position) of 
          the first occurrence of a specified text in a string (including whitespace).
        - Java counts positions from zero.
        - 0 is the first position in a string, 1 is the second, 2 is the third ...
        */
       System.out.println(".indexOf() method");
        txt = "Please locate where locate occurs!";
        // P - 0, l - 1, e - 2, a - 3, s - 4, e - 5, whitespace - 6, l - 7
        System.out.println(txt);
        System.out.println("Where locate occurs? - " + txt.indexOf("locate") + "\n");

        // .charAt() method
        // You can use the charAt() method to access a character at a specific position in a string.
        System.out.println(".chatAt() method");
        txt = "Hello";
        System.out.println(txt);
        System.out.println("Char at index 0: " + txt.charAt(0));
        System.out.println("Char at index 4: " + txt.charAt(4));
        System.out.println("Char at index 1: " + txt.charAt(3 - 2) + "\n");

        // Comparing Strings
        // .equals() method
        System.out.println(".equals() method");
        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println("Is txt1 = txt2? - " + txt1.equals(txt2));
        System.out.println("Is txt3 = txt4? - " + txt3.equals(txt4) + "\n");

        // Removing Whitespace
        // .trim() method - removes whitespace from the beginning and the end of a string.
        txt = "   Hello World   ";
        System.out.println("Before: [" + txt + "]");
        System.out.println("After: [" + txt.trim() + "]\n");

        // .concat() method
        // To concatenate strings.
        System.out.println(".concat() method");
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result + "\n");

        // While you can use concat() to join multiple strings, 
        // most developers prefer the + operator because it is shorter and easier to read.

        System.out.println("**Numbers and Strings**");
        // Java uses the + operator for both addition and concatenation.
        // Numbers are added. Strings are concatenated.

        int x1 = 10;
        int y1 = 20;
        int z1 = x1 + y1;
        System.out.println("z1 = " + z1);

        String x2 = "10";
        String y2 = "20";
        String z2 = x2 + y2;
        System.out.println("z2: " + z2);

        System.out.println("\n**Special Characters**");   // \n is common escape sequence which for new line. 

        txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println("Escape sequence for \": " + txt);
        System.out.println("Escape sequence for \': " + "It\'s alright.");
        System.out.println("Escape sequence for \\: " + "The character \\ is called backslash.");

        /*
        - Most of these escape codes are rarely used in modern programming. 
        - The most common ones are \n (new line), \" (double quote), and \\ (backslash).
        - Other common escape sequences that are valid in Java are:
            - \t	Tab
            - \b	Backspace
            - \r	Carriage Return
            - \f	Form Feed
        */
       
    }
}