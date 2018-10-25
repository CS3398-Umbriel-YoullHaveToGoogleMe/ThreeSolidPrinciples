//This file will contain the test class for Worker.java.

package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

  private Robot w = new Robot();

  @Test
  @DisplayName("Robot Method Test")
  public void testRobotMethod()
  {
  //  assertEquals("Worker working...","I'm working already!","Mismatch between test text and method text");
    assertEquals("Robot rebooting....","I am already rebooting!","Mismatch between test text and method text");
  }

}
