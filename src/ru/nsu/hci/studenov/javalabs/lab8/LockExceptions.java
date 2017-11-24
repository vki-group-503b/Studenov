package ru.nsu.hci.studenov.javalabs.lab8;
@SuppressWarnings("serial")
public class LockExceptions extends RuntimeException {
    public LockExceptions() {
            super("Попытка изменить lock файл");
    }
}
