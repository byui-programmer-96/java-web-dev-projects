import java.util.Scanner;

// Here is an example of a comment.

/* Here is how
to have
multi-line
comments. */

/*
Or
like
this.
*/

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input; // Comments do not have to start at the beginning of a line.

        input = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String name = input.next(); //Declares the 'name' variable and initializes it with text from the command line.
        input.close();

        System.out.println("Hello, " + name + "!");

        // System.out.println("This line will NOT print!");
    }
}