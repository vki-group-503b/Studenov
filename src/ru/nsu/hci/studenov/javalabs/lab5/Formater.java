package ru.nsu.hci.studenov.javalabs.lab5;

import java.util.Formatter;

public class Formater {
    public static void main(String[] args) {
        Formatter format = new Formatter();
        String yourName = "Venedikt", name = "Jarvis", description = "AI from some movie";
        format.format("Hello, %s. My name is %s,\nI am  %s - %s.", yourName, name, name, description);
        System.out.println(format);
    }
}
