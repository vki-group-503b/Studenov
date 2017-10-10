package ru.nsu.hci.studenov.javalabs.lab2;

public class ArrayMain {
    public static void main(String[] args) {
        new NumRepository();
        System.out.println("Максимальное число - " + NumRepository.MaxNumber());
        System.out.println("Минимальное число - " + NumRepository.MinNumber());
        System.out.println("Среднее арифметическое - " + NumRepository.AvgMath());
        System.out.println("Медиана массива - " + NumRepository.MedianOfArray());
        System.out.println("Среднее геометрическое - " + NumRepository.AvgGeomtr());
    }
}
