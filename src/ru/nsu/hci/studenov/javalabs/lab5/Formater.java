package ru.nsu.hci.studenov.javalabs.lab5;


public class Formater {
    public static void main(String[] args) {
        Formatter format = new Formatter();
        String yourName = "Venedikt", name = "Jarvis", description = "AI from some movie";

        System.out.println(format.Format("Hello, ${0}. My name is ${1}.\n I am ${1} - ${2}.", yourName, name,description));
    }
}
