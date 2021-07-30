import java.util.*;
import java.io.BufferedReader;

// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class magicnumber {

    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args)throws IOException
    {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);



        String input = in.readLine();
        String[] minMax = input.split(" ");

        int min = Integer.parseInt(minMax[0]);
        int max = Integer.parseInt(minMax[1]);

        for (int i=min; i<=max; i++) {
            int[] digits = getDigits(i);
            if (checkRotation(digits) && checkRepetitiveDigits(digits)) {
                System.out.println(i);
            }
        }
    }

    public static int[] getDigits(int number) {
        String input = Integer.toString(number);
        int[] digits = new int[input.length()];
        for (int i=0; i<input.length(); i++) {
            digits[i] = Integer.parseInt(input.substring(i, i+1));
        }
        return digits;
    }

    public static boolean checkRotation(int[] digits) {
        boolean isMagic = true;
        int newIndex = 0;
        Set<Integer> newIndexes = new HashSet<>();
        for (int j=0; j<digits.length; j++) {
            newIndex = (digits[newIndex] + newIndex)%digits.length;
            if (!newIndexes.add(newIndex)) {
                isMagic = false;
            }
        }
        return newIndex == 0 && isMagic;
    }

    public static boolean checkRepetitiveDigits(int[] digits) {
        boolean isMagic = true;
        Set<Integer> uniqueDigits = new HashSet<>();
        for (int j=0; j<digits.length; j++) {
            if (!uniqueDigits.add(digits[j])) {
                isMagic = false;
            }
        }
        return isMagic;


    }
}
