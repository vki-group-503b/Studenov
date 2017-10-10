package ru.nsu.hci.studenov.javalabs.lab2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class NumRepository {
    static int[] array;
    static int length;

    NumRepository() {
        Scanner in = new Scanner(System.in);
        length = in.nextInt();
        array = new int[length];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();
    }

    public static int MaxNumber() {

        return Arrays.stream(array).max().getAsInt();
    }

    public static int MinNumber() {

        return Arrays.stream(array).min().getAsInt();
    }

    public static double AvgMath() {

        return IntStream.of(array).average().getAsDouble();
    }

    public static double MedianOfArray() {
        Arrays.sort(array);
        if ((double) array.length % 2.0 == 0.0)
            return (double) (array[length / 2] + array[length / 2 - 1]) / 2;
        else
            return array[length / 2];
    }

    public static double AvgGeomtr() {
        double sum = 1;
        for (int i = 0; i < array.length; i++)
            sum *= array[i];

        return Math.pow(sum,1.0/length);
    }
}
