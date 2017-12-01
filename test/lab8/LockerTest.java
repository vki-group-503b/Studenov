package lab8;

import org.junit.jupiter.api.Test;
import ru.nsu.hci.studenov.javalabs.lab8.LockExceptions;
import ru.nsu.hci.studenov.javalabs.lab8.Locker;

import static org.junit.jupiter.api.Assertions.*;

class LockerTest {
    @Test
    void Test() throws LockExceptions, Exception{
        Locker Lock = new Locker();
        Lock.SetValue(3);
        assertEquals(Lock.GetValue(),3);
        Lock.Lock();
        try {
            Lock.SetValue(5);
            throw new Exception("Заблокированный Locker не бросил исключение");
        } catch (LockExceptions e) {}
        assertEquals(Lock.GetValue(), 3);
        Lock.UnLock();
        Lock.SetValue(5);
        assertEquals(Lock.GetValue(), 5);

    }

}