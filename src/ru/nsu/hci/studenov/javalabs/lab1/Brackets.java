package ru.nsu.hci.studenov.javalabs.lab1;

import java.util.Scanner;

public class Brackets {

    public static Boolean checkS() {
        Scanner s = new Scanner(System.in);
        String readFromKeyboard = s.nextLine();
        int open = 0;

        for (int i = 0; i < readFromKeyboard.length; ++i) {
            if (readFromKeyboard.charAt(i) == '(') {
                ++open;
            } else {
                --open;
            }
            if (open < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkS());
    }
}
