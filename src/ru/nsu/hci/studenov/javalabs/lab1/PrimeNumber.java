package ru.nsu.hci.studenov.javalabs.lab1;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int readFromKeyboard = s.nextInt();

        for (int i = 2; (double) i <= Math.sqrt((double) readFromKeyboard); i++) {
            if (readFromKeyboard % i == 0) {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
