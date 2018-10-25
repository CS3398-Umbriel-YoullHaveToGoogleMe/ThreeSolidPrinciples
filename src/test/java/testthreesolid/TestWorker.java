//This file will contain the test class for Worker.java.

package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
  

  private Worker w = new Worker();

  @Test
  @DisplayName("Work Method Test")
  public void testWorkMethod()
  {
    assertEquals("Worker working...","I'm working already!","Mismatch between test text and method text");

  }

  @Test
  @DisplayName("SalvadorRomeroTest")
  public void newtestSRWorkerPass()
  {
  	assertEquals((5+5),10, "Error Test did not pass");
  }

}
