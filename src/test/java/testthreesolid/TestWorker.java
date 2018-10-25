//This file will contain the test class for Worker.java.

package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {


  private Worker w = new Worker();

  @Test
  @DisplayName("Work Method Test")
  public void multiplicationOfZeroIntegersShouldReturnZero() {
       MyClass tester = new MyClass(); // MyClass is tested

       // assert statements
       assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
       assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
       assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
   }

  public void testWorkMethod()
  {
    assertEquals("Worker working...","I'm working already!","Mismatch between test text and method text");

  }

}
