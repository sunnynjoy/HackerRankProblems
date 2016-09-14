package main.java;

import java.util.Scanner;

/**
 * Created by sunnyghosh on 14/09/2016.
 */
public class CompareTriplets {
    public static void main(String... args) {
        final int size = 3;
        Scanner firstInput = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);
        int alicePoint = 0;
        int bobPoint = 0;
        int[] firstSpaceSeparateNumbers = new int[3];
        int[] secondSpaceSeparateNumbers = new int[3];
        for(int i=0; i < size ; i++){
            firstSpaceSeparateNumbers[i] = firstInput.nextInt();
        }
        for(int i=0; i < size ; i++){
            secondSpaceSeparateNumbers[i] = firstInput.nextInt();
        }

        for(int i=0; i < size ; i++){
            if(firstSpaceSeparateNumbers[i] != secondSpaceSeparateNumbers[i]){
                if(firstSpaceSeparateNumbers[i] > secondSpaceSeparateNumbers[i]){
                    alicePoint += 1;
                }
                else{
                    bobPoint += 1;
                }
            }
        }
        System.out.print(alicePoint + " "+ bobPoint);
    }
}
