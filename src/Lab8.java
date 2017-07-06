import java.util.Scanner;
import java.text.DecimalFormat;


/**
 * Created by michelhayman on 7/5/17.
 */
public class Lab8 {

    public static void main(String[] args) {

        // 1. display welcome message
        System.out.println("Welcome to Batting Average Calendar \n");

        // 2. ask for the number of at bats

        System.out.print("Enter number of times at bat: ");

        //3. get user input
        Scanner scan = new Scanner(System.in);
        int numAtBats = scan.nextInt();

        System.out.println();
        //4. using array to store at bat results

        int[] arr = new int[numAtBats];
        int [] arr1 = new int [numAtBats];

        System.out.println("0 = out, 1 = single, 2 = double, 3 = triple , 4 = home run");
        fillArray(scan, arr);
        fillArray2(scan, arr, arr1);

    }

    public static void fillArray(Scanner scan, int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Result for at-bat " + i + " : ");
            int atBat = scan.nextInt();
            arr[i] = atBat;
            

        }
    }

    public static void fillArray2(Scanner scan, int [] arr, int [] arr1) {

        DecimalFormat df = new DecimalFormat("#.000");

        double battAverage = 0.0;
        double slugPercentage = 0.0;

        System.out.println("Batting Average : " + df.format(battAverage) );
        System.out.println("Slugging Percentage: "+ df.format(slugPercentage) );
    }
}



