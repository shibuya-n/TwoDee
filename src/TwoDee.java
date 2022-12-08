//Create a program that populates a 3x3 2D array with random integers ranging from 1-10.
//Once you can generate random 2D arrays, write a method that checks if any rows contain all of the same numbers. If so, your method should print that row.
import java.util.Arrays;

public class TwoDee {
    public static int x = (int) Math.floor(Math.random() * 5) + 1;
    public static int y = (int) Math.floor(Math.random() * 5) + 1;

    public static int[][] arrayOne = new int[x][y];

    public static int[][] arrayTwo = new int[y][x];

    public static int[][] resultArray = new int[arrayOne.length][arrayOne.length];
    public static int tempNum = 0;
    public static int sum = 0;

    public static void main(String[] args) {
        arrayFill();
        arrayMultiply();
    }


    public static void arrayMultiply() {
        for (int i = 0; i < arrayOne.length; i++) {
            int[] tempArray = arrayOne[i];
            for (int k = 0; k < arrayOne.length; k++) {
                for (int j = 0; j < arrayOne[i].length; j++) {
                    tempNum = tempArray[j] * arrayTwo[j][k];
                    sum += tempNum;

                }
                resultArray[i][k] = sum;
                sum = 0;

            }
        }
        System.out.println("");
        System.out.println("Result: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(Arrays.toString(resultArray[i]));
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

