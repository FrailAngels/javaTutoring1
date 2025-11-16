import java.util.Scanner;
// This line is like telling your program, "I need a special tool called Scanner to help me read input from the user (like numbers or words they type)." The Scanner tool lives in a toolbox called java.util. We need to import it before we can use it.

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner for user input
        //This is where you actually create the Scanner tool you imported earlier and name it scanner. 
        //It's like taking the tool out of the toolbox. 
        //The System.in part tells the Scanner to specifically look for input coming from the keyboard.

        System.out.print("Enter your age: "); // Ask user for their age
        int age = scanner.nextInt(); // Read the age and store in 'age' variable
        //  This is a crucial step! The program stops and waits for the user to type a whole number (like 25, 18, or 10) and press Enter. 
        //  The scanner.nextInt() part reads that number. 
        //  Then, the computer stores this number in a labeled box we call a variable, named age. 
        //. The int stands for integer, meaning the box can only hold whole numbers. 

        if (age >= 18) { // Check if age is 18 or greater
            System.out.println("You are eligible to vote!"); // Print if condition is true
        } else {
            System.out.println("You are not eligible to vote yet."); // Print if condition is false
        }

        scanner.close(); // Close the scanner to free up resources
    }
}
