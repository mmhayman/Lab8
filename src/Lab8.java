import java.util.Scanner;


/**
 * Created by michelhayman on 7/5/17.
 */
public class Lab8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String choice = "y";


        while (choice.equalsIgnoreCase("y")) {

            System.out.println("Welcome to Batting Average Calendar \n");

            System.out.print("Enter number of times at bat: ");

            int numAtBats = scan.nextInt();

            while (numAtBats < 0) {
                System.out.print("Invalid Input. Please try again: ");
                numAtBats = scan.nextInt();
            }
            int[] arr = new int[numAtBats];
            getResults(scan, arr);
            getAtBatResults(scan, arr);

            System.out.println();

            System.out.println("Another batter? (y/n) ");
            choice = scan.nextLine();
        }
    }


    public static void getResults(Scanner scan, int[] arr) {

        double totalBases = 0;
        for (int i = 0; i < arr.length; i++) {
            totalBases = totalBases + arr[i];

        }


    }

    public static void getAtBatResults(Scanner scan, int[] arr) {

        int numBasesEarned = 0;
        System.out.println("0 = out, 1 = single, 2 = double, 3 = triple , 4 = home run");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Result for at- bat " + i + ": ");
            numBasesEarned = scan.nextInt();

            while (numBasesEarned > 0 && numBasesEarned > 5) {
                System.out.println("You entered an invalid number. Please try again: ");
                numBasesEarned = scan.nextInt();
            }

        }

    }
}