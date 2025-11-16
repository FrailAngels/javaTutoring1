/**
 * Personal Information Display System
 * This program demonstrates variables, data types, and basic calculations in Java.
 * Author: NOFIU MORUF PELUMI
 * Week 1 Mini-Project
 */
public class FirstWeekProjectSolution {
	public static void main(String[] args) {
		// === PERSONAL INFORMATION VARIABLES ===
		// String to store the student's full name
		String fullName = "Emma Rodriguez";
		// int to store age in years
		int age = 21;
		// double to store height in meters (more precise than float)
		double heightInMeters = 1.68;
		// double to store weight in kilograms
		double weightInKg = 62.5;
		// char to store the first letter of student's last name
		char lastNameInitial = 'R';
		// boolean to track enrollment status
		boolean isCurrentlyEnrolled = true;
		// String to store student's major
		String major = "Computer Science";
		// double to store current GPA
		double currentGPA = 3.7;

		// === CALCULATED VALUES ===
		// Calculate BMI using formula: weight (kg) / (height (m))²
		double bmi = weightInKg / (heightInMeters * heightInMeters);
		// Round BMI to two decimals for cleaner display
		double bmiRounded = Math.round(bmi * 100.0) / 100.0;
		// Use the current calendar year (updated to 2025)
		int currentYear = 2025; // Adjust if running in a different year
		int birthYear = currentYear - age;
		// Convert height to centimeters for display
		double heightInCm = heightInMeters * 100;
		// Calculate weight in pounds (1 kg = 2.20462 pounds)
		double weightInPounds = weightInKg * 2.20462;
		// Determine how many years until graduation (assuming 4-year program starting at 18)
		int yearsUntilGraduation = 4 - (age - 18);

		// === DISPLAY FORMATTED OUTPUT ===
		System.out.println("===========================================");
		System.out.println("        STUDENT INFORMATION SYSTEM         ");
		System.out.println("===========================================");

		// Display basic personal information
		System.out.println("Full Name: " + fullName);
		System.out.println("Age: " + age + " years old");
		System.out.println("Birth Year: " + birthYear);
		System.out.println("Last Name Initial: " + lastNameInitial);

		System.out.println("\n--- PHYSICAL CHARACTERISTICS ---");
		// Display height in both meters and centimeters
		System.out.println("Height: " + heightInMeters + " meters (" + heightInCm + " cm)");
		// Display weight in both kilograms and pounds
		System.out.println("Weight: " + weightInKg + " kg (" + weightInPounds + " lbs)");
		// Display calculated BMI
		System.out.println("BMI (raw): " + bmi);
		System.out.println("BMI (rounded): " + bmiRounded);

		System.out.println("\n--- ACADEMIC INFORMATION ---");
		System.out.println("Major: " + major);
		System.out.println("Current GPA: " + currentGPA);
		System.out.println("Currently Enrolled: " + isCurrentlyEnrolled);
		System.out.println("Years until graduation: " + yearsUntilGraduation);

		System.out.println("\n--- DATA TYPE DEMONSTRATION ---");
		// Show what type each variable is
		System.out.println("Name is stored as: String");
		System.out.println("Age is stored as: int (whole number)");
		System.out.println("Height is stored as: double (decimal number)");
		System.out.println("Enrolled status is stored as: boolean (true/false)");
		System.out.println("Initial is stored as: char (single character)");

		System.out.println("\n===========================================");
		System.out.println("        Data processing complete!          ");
		System.out.println("===========================================");
	}
}
