//This file will contain the test class for Worker.java.

package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {


    private BaseWorker w = new BaseWorker();

    @Test
    @DisplayName("Work Method Test")
    public void testWorkMethod()
    {
        assertEquals(w.work(),"Working...","Mismatch between test text and method text");

    }

    private SuperWorker sw = new SuperWorker();

    @Test
    @DisplayName("(Aadil Khatri)SuperWorker_Test")
    public void testSuperWorkerEatMethod()
    {
       assertEquals(sw.eat(),"SuperWorker is soopa eating...","Mismatch between test text and method text");

    }

    @Test
    @DisplayName("(Aadil Khatri)SuperWorker_Test")
    public void testWillFailSuperWorkerEatMethod()
    {
        assertEquals(sw.work(),"Its bound to fail...","Mismatch between test text and method text");

    }
}
