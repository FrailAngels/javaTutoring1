import java.math.BigDecimal;
// This tells Java you want to use the BigDecimal class.
// BigDecimal helps you do precise decimal math without the weird rounding issues doubles sometimes have.
// We’ll use it later when we want exact-looking results for division and other operations.
import java.math.RoundingMode;
// This imports a helper that tells BigDecimal how to round numbers.
// For example, when you divide and the result has many decimals, RoundingMode decides whether to round up or down.
// We’ll use RoundingMode.HALF_UP, which means “round to nearest, and go up on .5”.

public class FirstWeekExerciseSolution {
//  This starts a public class named ExerciseSolution (the file name must match the class name).
//  A class is a container for code: variables, methods (functions), etc.
// “public” means other code can access this class; it’s visible outside this file.

	// 1) This is the "main" method where Java starts running your program.
	// 2) "public" means any other code can call it; "static" means it belongs to the class, not an object.
	// 3) The parameter String[] args can hold text passed from the command line when launching the program.
	public static void main(String[] args) {
		// 1) This line calls the method named exercise1 so its code runs now.
		// 2) Methods help organize code into small, readable chunks.
		// 3) After this finishes, the next line will run.
		exercise1();

		// 1) Calls exercise2 to perform arithmetic demo with two numbers.
		// 2) Keeping each exercise in its own method keeps main() tidy.
		// 3) Execution flows top-to-bottom: this runs after exercise1.
		exercise2();

		// 1) Calls exercise3 to show how to swap values between variables.
		// 2) You’ll see output showing before and after values.
		// 3) This demonstrates using a temporary variable to avoid data loss.
		exercise3();

		// 1) Calls exercise4 to compute rectangle area and perimeter.
		// 2) This shows multiplication and addition with doubles.
		// 3) The results are printed with clear labels.
		exercise4();

		// 1) Calls exercise5 to convert Celsius to Fahrenheit.
		// 2) Uses 9.0/5.0 to ensure decimal math (not integer division).
		// 3) Prints both temperatures in one friendly line.
		exercise5();

		// 1) Calls exercise6 to compute remainder of a number divided by 2.
		// 2) The remainder is 0 for even numbers and 1 for odd numbers.
		// 3) Next week you’ll learn if/else to act on this info.
		exercise6();

		// 1) Calls exercise7, a mini calculator that shows +, -, ×, and ÷.
		// 2) Uses BigDecimal so the text output looks clean (no weird extra decimals).
		// 3) This is last so you see all previous outputs first.
		exercise7();
	}

	// Exercise 1: Variable Declaration
	// 1) This method groups code for Exercise 1 so it's easy to find and run.
	// 2) "private static" means it belongs to this class and isn’t accessible outside it.
	// 3) "void" means it doesn’t return a value—its purpose is to print information.
	private static void exercise1() {
		// 1) Declares a text variable (String) to store the student’s name.
		// 2) The value inside quotes is literal text data.
		// 3) We’ll later print it with a descriptive label.
		String name = "Alex Smith";

		// 1) Declares an integer (whole number) variable for age.
		// 2) int cannot store decimals; it’s perfect for counts or ages.
		// 3) The value 22 is assigned immediately.
		int age = 22;

		// 1) Declares a double to hold a decimal measurement in meters.
		// 2) double is used for numbers with fractional parts.
		// 3) Here we store 1.75 meters for the student’s height.
		double heightMeters = 1.75;

		// 1) Declares a boolean that can be true or false.
		// 2) We use it for yes/no type information like graduation status.
		// 3) The student hasn’t graduated yet, so it’s false.
		boolean isGraduated = false;

		// 1) Prints a single, combined line by joining text and variables.
		// 2) The + operator concatenates (glues) strings together.
		// 3) Everything between parentheses is evaluated, then printed.
		System.out.println(
			// 1) Start of the message with a label.
			// 2) After the label, we append the name variable.
			// 3) A space after the colon keeps the output readable.
			"Student Name: " + name +
			// 1) Add a space, the Age label, and the age number.
			// 2) Append the phrase " years old" for clarity.
			// 3) The + operator automatically converts numbers to text here.
			" Age: " + age + " years old" +
			// 1) Add Height with the numeric value and unit "meters".
			// 2) Spaces inside the quotes keep words separated.
			// 3) This keeps the entire output on one console line.
			" Height: " + heightMeters + " meters" +
			// 1) Finally, add the Graduated label and boolean value.
			// 2) Booleans print as true/false automatically.
			// 3) The closing parenthesis ends println.
			" Graduated: " + isGraduated
		);
	}

	// Exercise 2: Basic Arithmetic
	// 1) Demonstrates addition, subtraction, multiplication, division, and remainder.
	// 2) Shows integer division vs. double average calculation.
	// 3) Prints each result on its own line.
	private static void exercise2() {
		// 1) First number operand for calculations.
		// 2) int means a whole number with no decimals.
		// 3) Set to 24 per the exercise requirements.
		int num1 = 24;

		// 1) Second number operand for calculations.
		// 2) Also an int, set to 7 as required.
		// 3) We’ll use this with num1 for all operations.
		int num2 = 7;

		// 1) Compute sum with the + operator.
		// 2) The result is an int because both inputs are ints.
		// 3) Here, 24 + 7 = 31.
		int sum = num1 + num2;

		// 1) Compute difference with the - operator.
		// 2) 24 - 7 = 17.
		// 3) Stored in an int variable named difference.
		int difference = num1 - num2;

		// 1) Compute product with the * operator.
		// 2) 24 * 7 = 168.
		// 3) Stored in product for printing later.
		int product = num1 * num2;

		// 1) Compute integer division with the / operator.
		// 2) Because both are ints, decimals are dropped.
		// 3) 24 / 7 = 3 (remainder ignored here).
		int quotient = num1 / num2; // integer division

		// 1) Compute the remainder with % (modulo).
		// 2) This gives what’s left after division.
		// 3) 24 % 7 = 3.
		int remainder = num1 % num2;

		// 1) Compute average as a double to get decimals.
		// 2) Casting (double) forces decimal math instead of integer math.
		// 3) (24 + 7) / 2 = 31/2 = 15.5.
		double average = (double) (num1 + num2) / 2;

		// 1) Print both input numbers with a label.
		// 2) + joins text and numbers into one string.
		// 3) Helps the reader see inputs before results.
		System.out.println("Numbers: " + num1 + " and " + num2);

		// 1) Print the sum with a label.
		// 2) Uses the sum variable computed above.
		// 3) Each result is on its own line for clarity.
		System.out.println("Sum: " + sum);

		// 1) Print the difference with a label.
		// 2) Value comes from the difference variable.
		// 3) Matches expected output format exactly.
		System.out.println("Difference: " + difference);

		// 1) Print the product with a label.
		// 2) Uses the product variable computed earlier.
		// 3) Order mirrors how we computed values.
		System.out.println("Product: " + product);

		// 1) Print the integer quotient with a label.
		// 2) No decimals appear because it’s integer division.
		// 3) Shows 3 for 24 / 7.
		System.out.println("Quotient: " + quotient);

		// 1) Print the remainder with a label.
		// 2) Shows what’s left after dividing 24 by 7.
		// 3) Expected value is 3.
		System.out.println("Remainder: " + remainder);

		// 1) Print the average as a decimal.
		// 2) This demonstrates casting to double for precise results.
		// 3) Expected value is 15.5.
		System.out.println("Average: " + average);

	}

	// Exercise 3: Number Swapping
	// 1) Shows how to swap values of two variables using a temporary variable.
	// 2) Without a temp variable, one original value would be lost.
	// 3) Prints the result to verify the swap.
	private static void exercise3() {
		// 1) Start with x as 10 per the instructions.
		// 2) We will make x become 20 after the swap.
		// 3) int stores whole numbers like 10.
		int x = 10;

		// 1) Start with y as 20 per the instructions.
		// 2) We will make y become 10 after the swap.
		// 3) Another int variable for the second value.
		int y = 20;

		// 1) temp saves x’s original value so we don’t lose it.
		// 2) After this line, temp = 10.
		// 3) Now we can safely change x.
		int temp = x;

		// 1) Move y’s value into x.
		// 2) After this line, x = 20.
		// 3) We still have x’s original 10 saved in temp.
		x = y;

		// 1) Move temp (which is 10) into y.
		// 2) After this line, y = 10.
		// 3) Swap complete: x is 20, y is 10.
		y = temp;

		// 1) Print a combined line showing before and after.
		// 2) The "before" part is hard-coded text for clarity.
		// 3) The "after" part uses the variables x and y.
		System.out.println("Before swap: x = 10, y = 20 After swap: x = " + x + ", y = " + y);
	}

	// Exercise 4: Rectangle Area Calculator
	// 1) Computes area = length × width using doubles for decimals.
	// 2) Computes perimeter = 2 × (length + width).
	// 3) Prints results with labels and units.
	private static void exercise4() {
		// 1) Rectangle length as a double with decimals.
		// 2) Value per the exercise: 12.5.
		// 3) Doubles store fractional measurements.
		double length = 12.5;

		// 1) Rectangle width as a double.
		// 2) Value per the exercise: 7.3.
		// 3) Will multiply length * width for the area.
		double width = 7.3;

		// 1) Compute area by multiplying length and width.
		// 2) Using doubles preserves fractional parts.
		// 3) Expected result: 91.25.
		double area = length * width;

		// 1) Compute perimeter by adding sides then doubling.
		// 2) 2 * (12.5 + 7.3) = 39.6.
		// 3) Parentheses ensure addition happens before multiplication.
		double perimeter = 2 * (length + width);

		// 1) Print the dimensions in L x W format.
		// 2) + joins text with the numeric values.
		// 3) Helps visualize the rectangle size.
		System.out.println("Rectangle dimensions: " + length + " x " + width);

		// 1) Print the computed area with units.
		// 2) Units clarify what the number represents.
		// 3) Matches the expected output text.
		System.out.println("Area: " + area + " square units");

		// 1) Print the computed perimeter with units.
		// 2) Again, labels make output easy to read.
		// 3) Ends this exercise’s output.
		System.out.println("Perimeter: " + perimeter + " units");
	}

	// Exercise 5: Temperature Converter
	// 1) Converts Celsius to Fahrenheit using the standard formula.
	// 2) Uses decimal division (9.0/5.0) so we don’t lose precision.
	// 3) Prints both temperatures together.
	private static void exercise5() {
		// 1) Starting temperature in Celsius.
		// 2) Using a double to allow fractional temperatures.
		// 3) Value per the exercise: 25.0.
		double celsius = 25.0;

		// 1) Apply the formula F = C × 9/5 + 32.
		// 2) 9.0/5.0 ensures decimal math (not integer division).
		// 3) Result should be 77.0.
		double fahrenheit = (celsius * (9.0 / 5.0)) + 32.0;

		// 1) Print a friendly sentence with both units.
		// 2) The Unicode ° symbol is part of the string.
		// 3) toString conversion is automatic during concatenation.
		System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
	}

	// Exercise 6: Even or Odd Check
	// 1) Uses modulo (%) to find remainder when dividing by 2.
	// 2) Remainder 0 means even; 1 means odd.
	// 3) Prints the number and its remainder.
	private static void exercise6() {
		// 1) The number we’ll test for even/odd.
		// 2) Per the exercise, start with 17.
		// 3) int holds the whole number.
		int number = 17;

		// 1) Compute remainder when dividing by 2.
		// 2) number % 2 is 1 for odd numbers and 0 for even numbers.
		// 3) We’ll display this remainder to the user.
		int remainder = number % 2;

		// 1) Print the number and the remainder with labels.
		// 2) The parentheses text explains how to interpret the remainder.
		// 3) Later you can replace the note with if/else logic.
		System.out.println("Number: " + number + " Remainder when divided by 2: " + remainder +
				" (If remainder is 0, the number is even; if 1, it's odd)");
	}

	// Exercise 7: Simple Calculator
	// 1) Demonstrates +, -, ×, ÷ with readable decimal output.
	// 2) Uses BigDecimal to avoid floating-point display glitches.
	// 3) Prints results in a clean, labeled format.
	private static void exercise7() {
		// 1) First input number as a double.
		// 2) Value per the exercise instructions.
		// 3) Will be used for all four operations.
		double firstNumber = 45.6;

		// 1) Second input number as a double.
		// 2) Value per the exercise instructions.
		// 3) Combined with firstNumber to compute results.
		double secondNumber = 12.3;

		// 1) BigDecimal stores numbers as text to keep exact decimal representation.
		// 2) Creating from a string ("45.6") avoids binary floating rounding issues.
		// 3) We’ll use these for precise printed results.
		// Use BigDecimal for stable string formatting without floating noise
		BigDecimal bdFirst = new BigDecimal("45.6");
		// 1) Second BigDecimal for the other operand.
		// 2) Also created from a string for precision.
		// 3) Matches the value of secondNumber.
		BigDecimal bdSecond = new BigDecimal("12.3");
		// 1) Add the two BigDecimals.
		// 2) Result is an exact decimal, suitable for display.
		// 3) Will print as 57.9 (not 57.900000000000006).
		BigDecimal bdAdd = bdFirst.add(bdSecond);
		// 1) Subtract using BigDecimal.
		// 2) Result is precise and printable.
		// 3) Matches the expected 33.3.
		BigDecimal bdSub = bdFirst.subtract(bdSecond);
		// 1) Multiply using BigDecimal for exact decimal output.
		// 2) Avoids floating noise in string form.
		// 3) Expected 560.88.
		BigDecimal bdMul = bdFirst.multiply(bdSecond);
		// 1) Divide with a scale (15 digits) and HALF_UP rounding.
		// 2) Scale controls how many decimal places to keep.
		// 3) HALF_UP means .5 rounds up to the next digit.
		BigDecimal bdQuot = bdFirst.divide(bdSecond, 15, RoundingMode.HALF_UP);

		// 1) Header line summarizing the two inputs.
		// 2) Helps the reader understand what values are used.
		// 3) Printed before the detailed results.
		System.out.println("Calculator Results for " + firstNumber + " and " + secondNumber + ":");

		// 1) Print addition result using BigDecimal.
		// 2) toPlainString() prints without scientific notation or extra noise.
		// 3) Matches expected: 57.9.
		System.out.println(firstNumber + " + " + secondNumber + " = " + bdAdd.toPlainString());

		// 1) Print subtraction result.
		// 2) Uses the precisely computed bdSub value.
		// 3) Matches expected: 33.3.
		System.out.println(firstNumber + " - " + secondNumber + " = " + bdSub.toPlainString());

		// 1) Print multiplication result.
		// 2) Uses bdMul for clean decimal text.
		// 3) Matches expected: 560.88.
		System.out.println(firstNumber + " × " + secondNumber + " = " + bdMul.toPlainString());

		// 1) Print division result.
		// 2) bdQuot shows many decimals to match the expected example.
		// 3) The ÷ symbol is just a character in the string.
		System.out.println(firstNumber + " ÷ " + secondNumber + " = " + bdQuot.toPlainString());
	}
}
