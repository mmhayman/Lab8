
import java.util.Scanner;


/**
 * Created by michelhayman on 7/5/17.
 */
public class Lab8 {

    public static int numAtBats;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {

            System.out.println("Welcome to Batting Average Calendar \n");

            System.out.print("Enter number of times at bat: "); // enter number of times up to bat
            int numAtBats = scan.nextInt();

            while (numAtBats <0) { // validating user input
                System.out.print("Invalid Input. Please try again: ");
                numAtBats = scan.nextInt();
            }


            System.out.println("0 = out, 1 = single, 2 = double, 3 = triple , 4 = home run");
            System.out.println();

            int[] arr = new int[numAtBats]; // array

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Result for at- bat " + (i + 1) + ": "); // result up to bat
                int numBasesEarned = scan.nextInt();

                if (numBasesEarned < 0 ) { // validating user input
                    System.out.println("You entered an invalid number. Please try again: 0 - 4 ");
                    numBasesEarned = scan.nextInt();
                    if (numBasesEarned > 5) {
                        System.out.println("You entered an invalid number Pleaes try again: 0 - 4");
                    }

                }
                arr[i] = numBasesEarned;
            }


            double atBatTotal = 0;
            double totalSumAtBat = 0;
            double sluggingPercentage;
            double battingAverage;

            for (int i = 0; i < numAtBats; i++) { // finding batting average

                if (arr[i] > 0) {
                    atBatTotal += 1;

                }

            }
            battingAverage = (atBatTotal / numAtBats);

            System.out.printf("Batting Average: " + "%.3f", +battingAverage, "%n");// printing B.A
            System.out.println();

            for (int i : arr) // finding slugging percentage

            {
                if (i > 0) {
                    totalSumAtBat+= i;

                }

            }

            sluggingPercentage = (totalSumAtBat / numAtBats);
            System.out.printf("Slugging Percentage: " + "%.3f", +sluggingPercentage, "%n");// printing S.P

            System.out.println();
            System.out.println("Another batter? (y/n) "); // asking user to continue
            choice = scan.next();
            choice.toLowerCase();
        }
        System.out.println("goodbye");

    }
}




