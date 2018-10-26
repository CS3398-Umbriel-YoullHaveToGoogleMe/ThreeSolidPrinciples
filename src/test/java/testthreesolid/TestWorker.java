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

//  private SuperWorker sw = new SuperWorker();
    private SuperWorker sw = new SuperWorker();
  @Test
  @DisplayName("(Aadil Khatri)Multiplying_Test")
  public void multiplicationOfZeroIntegersShouldReturnZero() {
   // MyClass is tested

        // assert statements
        assertEquals(0, sw.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, sw.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, sw.multiply(0, 0), "0 x 0 must be 0");
    }
  //public void testSuperWorkerMethod()
  //{
  //  assertEquals(sw.eat(),"SuperWorker is soopa eating...","Mismatch between test text and method text");

  }
