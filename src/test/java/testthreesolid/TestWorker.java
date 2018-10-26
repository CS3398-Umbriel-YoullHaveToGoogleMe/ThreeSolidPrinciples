//This file will contain the test class for Worker.java.

package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {


  private BaseWorker w = new BaseWorker();


  @Test
  @DisplayName("Work Method Test")
//  public void multiplicationOfZeroIntegersShouldReturnZero() {


  public void testWorkMethod()
  {
  //  assertEquals(0, multiply(10, 0), "10 x 0 must be 0");
    assertEquals(w.work(),"Working...","Mismatch between test text and method text");

  }
}
