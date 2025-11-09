public class thirdClass {
    public static void main(String[] args) {
        // var x = 5;

        // System.out.println(x);

        //With the var keyword, we don't need to explicitly define the type of variable. We can do it for others as well. 

        /* var myDouble = 9.98;
        var myChar = 'a';
        var myBoolean  = true;

        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(myDouble); */

        //CASTING
        /* Type casting means trying to turn one data type into another. Two types of casting, widening casting and narrowing casting.  Widening means automatic while narrowing means manual. Widening means converting a smaller type to a larger type. 

        Widening Casting (automatic) - converting a smaller type to a larger type size
         byte -> short -> char -> int -> long -> float -> double

         Narrowing Casting (manual) - converting a larger type to a smaller type size
         double -> float -> long -> int -> char -> short -> byte */

        /* int myInt = 9;
        double newDouble = myInt; 

        System.out.println(newDouble);
        System.out.println(myInt); */

        //double myDouble = 9.78d;
        //int newInt = (int)myDouble;

        /* Manual way with parentheses, the automatic way is without parentheses.  Without the parentheses you can lose the data that you have. */

        //System.out.println(newInt);

        /* int maxScore = 500;
        int userScore = 423; 
        double doubleUserScorePercentage = (double)userScore/maxScore * 100.0d;
        System.out.println(doubleUserScorePercentage); */

        //OPERATORS

        /* We use them to perform operations on values */

        //Plus operator

        /* int x = 100;
        int y = 50;
        int sum = x + y; 

        System.out.println(sum);

        int z = x + y + 250;
        System.out.println(z); */ 

        /* int c = 5;
        int f = 2;
        int g = c % f;

        System.out.println(g); */

        /* int x = 5;
        ++x; 
        System.out.println(x); 

        int y = 8;
        --y;
        System.out.println(y);  */

        /* double x = 10.0d;
        int y = 3;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x/y);
        System.out.println(x * y);
        System.out.println(x % y); */

        /* Note: When dividing two integers in Java, the result will also be an integer. For example, 10 / 3 gives 3. If you want a decimal result, use double values, like 10.0 / 3. */

        /* int peopleInRoom = 0;

        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;

        System.out.println("There are " + peopleInRoom + " people in this room now");

        peopleInRoom--;
        System.out.println("There are " + peopleInRoom + " people in this room now");

        ++peopleInRoom;
        System.out.println("There are " + peopleInRoom + " people in this room now"); */

        /* Note: Most assignment operators are just shorter ways of writing code. For example, x += 5 is the same as x = x + 5, but shorter and often easier to read. */

        //Tracking Savings

        /* int savings = 100;
        savings += 50;
        System.out.println(savings); */

        
        /* int votingAge = 18;
        System.out.println(votingAge >= 18);
        System.out.println(votingAge < 18); */

        /* int x = 5;
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10 */

        /* boolean islogIn = true;
        boolean isAdmin = false;

        System.out.println("Regular User: " + (islogIn && !isAdmin));
        System.out.println("Has access: " + (islogIn || isAdmin));
        System.out.println("Not Logged In: " + (!islogIn)); */

        /* int x = 5;
        System.out.println(!(x > 3 && x < 10)); // returns false because ! (not) is used to reverse the result */


        /* int result1 = 2 + 3 * 4;     // 2 + 12 = 14
        int result2 = (2 + 3) * 4;   // 5 * 4 = 20

        System.out.println(result1);
        System.out.println(result2); */

        /* int result3 = 10 - 2 + 5; 
        System.out.println(result3); */

        //METHODS IN JAVA
        

        /* String myString = "Hello World";
        System.out.println(myString.toUpperCase());

        String newString = "Please locate where 'locate' occurs!";
        System.out.println(newString.indexOf("locate")); */

        /* String myString = "Hello";
        System.out.println(myString.charAt(0));

        String txt1 = "Hello";
        String txt2 = "Hello";
        String txt3 = "Greetings";
        String txt4 = "Great Things";

        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));

        String txt5 = " Hello World ";
        System.out.println(txt5.trim()); */

        /* String firstName = "John ";
        String lastName = "Doe";

        System.out.println(firstName.concat(lastName));

        String x = "10";
        int y = 20;
        System.out.println(x + y);

        String txt = "We are the so called \"Vikings\" of the north";
        System.out.println(txt); */

        /* System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.pow(2, 8)); // 2 raised to the power of 8. Will always return double
        //System.out.println(Math.random());

        int randomNum = (int) (Math.random()); //pickas a random number between 0 and 100 
        System.out.println(randomNum); */

        /* boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);    // Outputs true
        System.out.println(isFishTasty);  // Outputs false */

        //Java Conditions and If statements 

        /* //Conditions and if statements let you control the flow of the program. They decide which code runs and which is kicked. Every if statement needs a condition that results in true or false. This means if statements work hand in hand with boolean values. */ 

        /* boolean isRaining = true;

        if(isRaining){
            System.out.println("Bring an umbrella");
        } */

    /* Most often, conditions are created using comparison operators, like the ones below:

    Less than: a < b
    Less than or equal to: a <= b
    Greater than: a > b
    Greater than or equal to: a >= b
    Equal to: a == b
    Not equal to: a != b
    You can use these conditions to perform different actions for different decisions.

    Java has the following conditional statements:

    Use if to specify a block of code to be executed, if a specified condition is true
    Use else to specify a block of code to be executed, if the same condition is false
    Use else if to specify a new condition to test, if the first condition is false
    Use switch to specify many alternative blocks of code to be executed
 */

        /* if(20 > 18){
            System.out.println("20 is greater than 18");
        } */

        /* boolean isRaining = false;

        if(isRaining){
            System.out.println("Bring an umbrella");
        } else{
            System.out.println("No need for an umbrella");
        } */

        int weather = 2;
        

        if(weather == 1){
            System.out.println("Bring an umbrella");
        } else if(weather == 2){
            System.out.println("Wear sunglasses ");
        } else{
            System.out.println("Just go outside normaly");
        }
        
    }
    
}
