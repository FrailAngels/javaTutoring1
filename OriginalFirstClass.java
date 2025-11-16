public class OriginalFirstClass {
    public static void main(String[] args) {
        //variable = (condition) ? expressionTrue :  expressionFalse;

        /* int time = 20;
        if (time < 18) {
        System.out.println("Good day.");
            } else {
        System.out.println("Good evening.");
        }

        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        int time3 = 20;
        System.out.println((time3 < 18) ? "Good day." : "Good evening."); */

        //Tip: Use the ternary operator for short, simple choices. For longer or more complex logic, the regular if...else is easier to read.

        //* /Nested If
        //You can also place an if statement inside another if. This is called a nested if statement.

        //A nested if lets you check for a condition only if another condition is already true. */

        /* int x = 15;
        int y = 25;

        if (x > 10) {
            System.out.println("x is greater than 10");
        // Nested if 
            if (y > 20) {
            System.out.println("y is also greater than 20");
        }
    } */

        /* int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
        System.out.println("Old enough to vote.");
            if (isCitizen) {
            System.out.println("And you are a citizen, so you can vote!");
                } else {
                    System.out.println("But you must be a citizen to vote.");
            }
                } else {
            System.out.println("Not old enough to vote.");
        } */


        /* Logical Operators in Conditions
        You can combine or reverse conditions using logical operators. These work together with if, else, and else if to build more complex decisions.

        && (AND) - all conditions must be true
        || (OR) - at least one condition must be true
        ! (NOT) - reverses a condition (true = false, false = true) */

        /* int a = 200;
        int b = 33;
        int c = 500;

        if (a > b || a > c) {
            System.out.println("At least one condition is true");
        } */

        /* int a = 33;
        int b = 200;

        if (!(a > b)) {
            System.out.println("a is NOT greater than b");}
            else{System.out.println("a is greater than b");} */


        /* boolean isLoggedIn = false;
        boolean isAdmin = false;
        int securityLevel  = 0;

        if(isLoggedIn == true && isAdmin == true){
            System.out.println("Welcome admin, you can log in");
        }else{System.out.print("Unauthorized User");} */

        /* boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 2; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // Try changing securityLevel to test different outcomes:
        //
        //ecurityLevel 1 = Access granted
        // securityLevel 2 = Access granted
        // securityLevel 3 = Access denied
        // securityLevel 4 = Access denied
        //
        // If isAdmin = true, access is granted. */

        int day = 4;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
        break;
        case 3:
            System.out.println("Wednesday");
        break;
        case 4:
            System.out.println("Thursday");
        break;
        case 5:
            System.out.println("Friday");
        break;
        case 6:
            System.out.println("Saturday");
        break;
        case 7:
            System.out.println("Sunday");
        break;
    }
// Outputs "Thursday" (day 4)
    }
}

