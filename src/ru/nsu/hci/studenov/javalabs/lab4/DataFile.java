package ru.nsu.hci.studenov.javalabs.lab4;

import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;


public class DataFile {
    public static void main(String[] args) throws FileNotFoundException {
        String s = File.separator;  //separator
        String path = (s + "Users" + s + "vened" + s + "IdeaProjects" + s + "javalabs" + s + "src" + s + "ru" + s + "nsu" + s + "hci" + s + "studenov" + s + "javalabs" + s + "lab4" + s + "text");
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int numberLines = 0;
        int numbersWords = 0;
        int numbersLetters = 0;
        HashMap<Character, Integer> hashmap = new HashMap<>();
        while (scanner.hasNextLine()) {
            numberLines++;
            Scanner word = new Scanner(scanner.nextLine());
            while (word.hasNext()) {
                numbersWords++;
                String letters = word.next();
                for (int i = 0; i < letters.length(); i++) {
                    if (Character.isLetter(letters.charAt(i))) {
                        numbersLetters++;
                        int qt = 0;
                        if (hashmap.containsKey(letters.charAt(i))) {
                            qt = hashmap.get(letters.charAt(i));
                        }
                        hashmap.put(letters.charAt(i), qt + 1);
                    }
                }
            }
        }
        System.out.println("Numbers of lines - " + numberLines);
        System.out.println("Numbers of words - " + numbersWords);
        System.out.println("Numbers of letters - " + numbersLetters);
        System.out.println(hashmap);
    }
}