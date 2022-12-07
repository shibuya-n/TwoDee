//Create a program that populates a 3x3 2D array with random integers ranging from 1-10.
//Once you can generate random 2D arrays, write a method that checks if any rows contain all of the same numbers. If so, your method should print that row.
import java.util.Arrays;

public class TwoDee {
    public static int x = (int) Math.floor(Math.random() * 5) + 1;
    public static int y = (int) Math.floor(Math.random() * 5) + 1;

    public static int[][] arrayOne = {
            {1, 2, 3},
            {4, 5, 6}
    };

    public static int[][] arrayTwo = {
            {7, 8},
            {9, 10},
            {11, 12}
    };

    public static void main(String[] args) {
        //arrayFill();
        arrayMultiply();
    }


    public static void arrayMultiply() {
        for (int i  = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[0].length; j++) {
                System.out.println(arrayOne[i][j]);
                System.out.println(arrayTwo[j][i]);
                System.out.println(arrayOne[i][j] * arrayTwo[j][i]);
                System.out.println("");
            }
        }
    }
    public static void arrayFill() {
        System.out.println("Array One");
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = ((int) Math.floor(Math.random() * 10) + 1);

            }
            System.out.println(Arrays.toString(arrayOne[i]));
        }
        System.out.println("");
        System.out.println("Array Two");
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                arrayTwo[i][j] = ((int) Math.floor(Math.random() * 10) + 1);

            }
            System.out.println(Arrays.toString(arrayTwo[i]));
        }
    }
}

