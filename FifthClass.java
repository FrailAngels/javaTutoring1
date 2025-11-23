public class FifthClass {
    public static void main(String[] args) {

        //WHILE LOOPS

        /* int i = 0;

        while(i < 5){
            System.out.println(i);
            i++;
        } */

            /* int countdown = 3;
            while(countdown > 0){
                System.out.println(countdown);
                countdown--;
            }
            System.out.println("Happy New Year!!!!"); */

            //DOWHILE LOOPS
            /* int i = 10;
            do {
                System.out.println("i is " + i);
                i++;
            } while (i < 5); */

            //int dice = 1;

            /* while (dice <= 6) {
                if (dice < 6) {
                    System.out.println("No Yatzy.");
                } else {
                    System.out.println("Yatzy!");
                }
                dice = dice + 1;
            } */

                /* for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                } */

            /* Statement 1 is executed (one time) before the execution of the code block.

            Statement 2 defines the condition for executing the code block.

            Statement 3 is executed (every time) after the code block has been executed. */


            // Outer loop
            /* for (int i = 1; i <= 2; i++) {
                System.out.println("Outer: " + i); // Executes 2 times
                // Inner loop
                for (int j = 1; j <= 3; j++) {
                    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
                }
            } */

            /* String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

            for (String car : cars) { //Each item in the array "cars", they are called "car"
                System.out.println(car);
            } */

            /* for (type variableName : arrayName) {
                // code block to be executed
            } */

            /* //PROGRAM THAT COUNTS TO 100 BY TENS
           int count = 1;
           for (int i = 0; i <= 100; i+=10) {
                count++;
                System.out.println(i);
           }
           System.out.println("We went up by 10 " + count + " times"); */

           /* for(int i = 0; i <= 10; i+=2){
            System.out.println(i);
           } */

            int n = 5;
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial of " + n + " is " + fact);
            // Output: Factorial of 5 is 120
    }

}
