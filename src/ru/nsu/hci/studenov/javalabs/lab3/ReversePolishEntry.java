package ru.nsu.hci.studenov.javalabs.lab3;

import java.util.Stack;
import java.util.Scanner;

public class ReversePolishEntry {

    public static String Conversion(String exp) {
        Stack<String> stack = new Stack<>();
        String out = new String();
        boolean brackets = false;
        for (int i = 0; i < exp.length(); i++) {
            int priority = Priority(Character.toString(exp.charAt(i)));
            if ((priority == 3)) {
                brackets = true;
            } else if (priority == -3) {
                int prior = -3;
                while (!stack.empty()) {
                    prior = Priority(Character.toString(exp.charAt(i)));
                    out = out.concat(stack.pop());
                }
                brackets = false;
            } else if (priority == 0) {
                out = out.concat(Character.toString(exp.charAt(i)));
            } else if (stack.empty()) {
                stack.push(Character.toString(exp.charAt(i)));
            } else if (Priority(stack.peek()) >= priority) {
                if (brackets == false) {
                    out = out.concat(stack.pop());
                }
                stack.push(Character.toString(exp.charAt(i)));
            } else {
                stack.push(Character.toString(exp.charAt(i)));
            }
        }
        while (!stack.empty()) {
            out = out.concat(stack.pop());
        }
        return out;
    }


    public static int Priority(String simvol) {
        int prior = 0;
        switch (simvol) {
            case " ": {
                break;
            }
            case "(": {
                prior = 3;
                break;
            }
            case ")": {
                prior = -3;
                break;
            }
            case "+": {
                prior = 1;
                break;
            }
            case "-": {
                prior = 1;
                break;
            }
            case "*": {
                prior = 2;
                break;
            }
            case "/": {
                prior = 2;
                break;
            }
        }
        return prior;
    }

    public static double Calculation(String exp) {
        Stack<Double> stack = new Stack<Double>();
        for (int i = 0; i < exp.length(); i++) {
            if (Character.isDigit(exp.charAt(i))) {
                stack.push((double) Character.getNumericValue(exp.charAt((int) i)));
            } else {
                if (exp.charAt(i) == '-') {
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.push(b - a);
                } else if (exp.charAt(i) == '+') {
                    stack.push(stack.pop() + stack.pop());

                } else if (exp.charAt(i) == '/') {
                    double a = stack.pop();
                    double b = stack.pop();
                    stack.push(b / a);
                } else if (exp.charAt(i) == '*') {
                    stack.push(stack.pop() * stack.pop());

                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String exp = in.nextLine();
        System.out.println(Conversion(exp));
        System.out.println(Calculation(Conversion(exp)));
    }
}

