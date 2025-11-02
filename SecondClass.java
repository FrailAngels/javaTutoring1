import javax.xml.crypto.Data;

public class SecondClass{

    public static void main(String[] args) {
        System.out.println("Hello World"); //This line prints Hello World
        //Java Multi-line Comments
        /*
        * Multi-line comments start with /* and ends with 
        * */




        /* //General Java:

        //Declaring Variables 

        //int firstInteger = 7;
        //String name = "John";

        //type variableName = value; 
        //System.out.println(name);

        //int MyNum = 15;
        // MyNum = 20;

       // System.err.println(MyNum);

        //float MyFloat = 3.5f;

        //char Mychar = 'a';

        //String DogName = "Buster"; 

        //boolean IsTheComputerOn = true; 

        //String firstName = "John ";
        //String lastName = "Doe";
        //String fullName = firstName + lastName;
        //System.out.println(fullName);  */ 

        /* //int x = 5;
        //int y = 6;

        //System.out.println("The sum is " + x + y);   // Prints: The sum is 56
        //System.out.println("The sum is " + (x + y)); // Prints: The sum is 11

        //int z = 20;
        //int x = 5;
        //int y = 15;

        //System.out.println("The sum is " + (x + y + z));

        //int z = 20, y = 5, x = 15;
        //System.out.println("The sum is " + (x + y + z));

        //int x, y, z;

        //x = y = z = 15;

        //System.out.println("The sum is " + (x + y + z)); 

        //int minutePerHour = 60;
        //int m = 50;

        //System.out.println(minutePerHour);
        //System.out.println(m); */


    


        /*
         * Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter, and cannot contain whitespace
        Names can also begin with $ and _
        Names are case-sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */

         //final int minutePerHour = 60;
         //final int birthYear = 2006;

         //Student Data 

         /* String studentName = "John Doe";
         int studentID = 15;
         int studentAge = 23;
         float studentFee = 75.2f;
         char studentGrade = 'B';

         System.out.println("This student's name is " + studentName);
         System.out.println("This student's age is " + studentAge);
         System.out.println("This student's ID is " + studentID);
         System.out.println("This student has to pay "+"$" + studentFee);
         System.out.println("This student's grade is " + studentGrade); */

         /* //Area of Rectangle: 

         int rectangleLength = 4;
         int rectangleWidth = 6;
         int areaOfRectangle = rectangleLength * rectangleWidth;

         System.out.println(areaOfRectangle); */






         /* Data types are divided into two groups:

        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes */

        /* //BYTE

        byte classNumber = 100;

        System.out.println(classNumber); */

        /* Int
        The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value. */

        /* Short
        The short data type can store whole numbers from -32768 to 32767: */

        /* Byte
        The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127: */


        /* Long
        The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L": */


        /* double universityFee = 45.90;

        System.out.println(universityFee); */

        /* Floating Point Types
        You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.

        The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles: */

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("There are " + items + " items here");
        System.out.println("Each item costs " + currency + costPerItem);
        System.out.println("The total cost is " + currency + totalCost);


        /* Non-Primitive Data Types
        Non-primitive data types are called reference types because they refer to objects.

        The main differences between primitive and non-primitive data types are:

        Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
        Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
        Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
        Primitive types always hold a value, whereas non-primitive types can be null. */
    } 
}