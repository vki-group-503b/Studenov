package ru.nsu.hci.studenov.javalabs.lab8;

public class Locker {

    public double value;
    public boolean lock = true;

    public void SetValue(double value) throws LockExceptions {

        if (lock)
            this.value = value;
        else {
            throw new LockExceptions();
        }
    }

    public double GetValue() {
        return value;
    }

    public void Lock() {
        lock = false;
    }

    public void UnLock() {
        lock = true;
    }

}
