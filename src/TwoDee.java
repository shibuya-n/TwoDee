//Create a program that populates a 3x3 2D array with random integers ranging from 1-10.
//Once you can generate random 2D arrays, write a method that checks if any rows contain all of the same numbers. If so, your method should print that row.
import java.util.Arrays;

public class TwoDee {
    public static int[][] randNumbers = {
            {1, 1, 1},
            {0, 0, 0},
            {0, 0, 0}
    };
    public static void main(String[] args) {
        arrayFill();
        arrayCheck();
    }

    public static void arrayFill() {
        for (int i = 0; i < randNumbers.length; i++) {
            for (int j = 0; j < randNumbers[i].length; j++) {
                randNumbers[i][j] =  ((int)Math.floor(Math.random() * 10) + 1);

            }
            System.out.println(Arrays.toString(randNumbers[i]));
        }
        System.out.println("");
    }
    public static void arrayCheck() {
        for (int i = 0; i < randNumbers.length; i++) {
            if ((randNumbers[i][0] == (randNumbers[i][1])) && (randNumbers[i][0] == (randNumbers[i][2]))) {
                System.out.println(Arrays.toString(randNumbers[i]));
            }
            else {
                System.out.println("No matches!");
            }
        }
        }
    }

