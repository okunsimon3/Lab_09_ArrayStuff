import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int SIZE = 100;
        int[] dataPoints = new int[SIZE];
        double sum = 0.0;
        double avg = 0.0;

        Scanner in = new Scanner(System.in);
        int rangedInt = 0;
        int count = 0;

        boolean found = false;
        int position = 0;

        int intMin, intMax;


        for (int d = 0; d < dataPoints.length; d++) {
            dataPoints[d] = rnd.nextInt(SIZE) + 1;
        }
        System.out.println();

        for (int d = 0; d < dataPoints.length; d++) {
            System.out.print(dataPoints[d] + " | ");
        }
        for (int d : dataPoints)
            sum += d; //sum = sum + d

        System.out.println("\n" + "The sum of the random array dataPoints is: " + sum);

        avg = sum / dataPoints.length;

        System.out.println("The average of the random array dataPoints is: " + avg);

        //Linear Scan (search)(a - b) finding a value from the user in an array and counting the times it is found

        rangedInt = SafeInput.getRangedInt(in, "\n" + "Enter a value between ", 1, 100);

        for (int d : dataPoints) {
            if(d == rangedInt) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Your number " + rangedInt + " occurred in the array " + count + " times");
        } else {
            System.out.println("Your number " + rangedInt + " was not found in the array");
        }

        //Linear Scan (search)(c) find user value and break the loop to display where it was found first

        rangedInt = SafeInput.getRangedInt(in, "\n" + "Enter a value between ", 1, 100);

        for (int d = 0; d < dataPoints.length; d++) {
            if(dataPoints[d] == rangedInt) {
                found = true;
                position = d;
                break;
            }
        }
        if(found) {
            System.out.println("Your number " + rangedInt + " was found at array index " + position);
        } else {
            System.out.println("Your number " + rangedInt + " was not found in the array");
        }


        intMin = dataPoints[0];
        intMax = dataPoints[0];
        for(int d : dataPoints) {
            if(d < intMin) {
                intMin = d;
            }
            if(d > intMax) {
                intMax = d;
            }
        }
        System.out.println("\nThe minimum value in this array is: " + intMin);
        System.out.println("\nThe maximum value in this array is: " + intMax);

        //Calling Static Method
        System.out.println("\n" + "Average of dataPoints is: " + getAverage(dataPoints));
    }


    //Static Method that takes an array of double value and returns the average

    /** A method that finds the average of an array of double values
     *
     * @param value - The array it is finding the average of
     * @return - The average
     */
    public static double getAverage(int[] value) {
        double doubleSum = 0;
        double doubleAvg = 0;

        for(int x = 0; x < value.length; x++) {
            doubleSum += value[x];
        }
        doubleAvg = doubleSum / value.length;
        return doubleAvg;
    }
}