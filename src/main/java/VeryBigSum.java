package src.main.java;

import java.util.Scanner;

/**
 * Created by sunnyghosh on 14/09/2016.
 */
public class VeryBigSum {
    public static void main(String[] args) {
        final Scanner inputSize = new Scanner(System.in);
        final int size = inputSize.nextInt();
        if (size == 0)
            return;
        veryBigSum(size, inputSize);
    }

    private final static void veryBigSum(final int size, final Scanner inputSize) {
        long sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + inputSize.nextInt();
        }
        inputSize.close();
        System.out.print(sum);
    }
}
