//This file will contain the test class for Worker.java.

package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {


  private Worker w = new Worker();

  @Test
  @DisplayName("Work Method Test")
//  public void multiplicationOfZeroIntegersShouldReturnZero() {


  public void testWorkMethod()
  {
    assertEquals(0, w.multiply(10, 0), "10 x 0 must be 0");
    assertEquals("Worker working...","I'm working already!","Mismatch between test text and method text");

  }

}
