import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: "); // Get first number from user
        int num1 = scanner.nextInt();              // Store first number

        System.out.print("Enter second number: "); // Get second number from user
        int num2 = scanner.nextInt();               // Store second number

        if (num1 > num2) { // Check if first number is larger
            System.out.println(num1 + " is greater than " + num2);
        }

        if (num1 == num2) { // Check if numbers are equal
            System.out.println("Both numbers are equal!");
        }

        if (num1 < num2) { // Check if second number is larger
            System.out.println(num2 + " is greater than " + num1);
        }
          


        scanner.close();
    }
}
