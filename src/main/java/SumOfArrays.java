package main.java;

import java.util.Scanner;

/**
 * Problem
 * <p>
 * Given an array of  integers, can you find the sum of its elements?
 * <p>
 * Input Format
 * <p>
 * The first line contains an integer, , denoting the size of the array.
 * The second line contains  space-separated integers representing the array's elements.
 * <p>
 * Output Format
 * <p>
 * Print the sum of the array's elements as a single integer.
 * <p>
 * Sample Input
 * <p>
 * 6
 * 1 2 3 4 10 11
 * <p>
 * Sample Output
 * <p>
 * 31
 * <p>
 * Explanation
 * <p>
 * We print the sum of the array's elements, which is: 1+2+3+4+10+11 = 31
 */

public class SumOfArrays {

    public static void main(String[] args) {
        final Scanner inputSize = new Scanner(System.in);
        final int size = inputSize.nextInt();
        if (size == 0)
            return;
        sumOfArrays(size, inputSize);
    }

    private final static void sumOfArrays(final int size, final Scanner inputSize) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + inputSize.nextInt();
        }
        inputSize.close();
        System.out.print(sum);
    }
}
