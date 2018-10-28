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
  @DisplayName("NabilManasiya_Pass")
  public void testSuperWorkerMethod()
  {
    assertEquals(sw.eat(),"SuperWorker is soopa eating...","Mismatch between test text and method text");

  }
    
  @Test
  @DisplayName("NabilManasiya_Failed")
  public void tempworkersickMethod()
  {
    assertEquals(sw.sick(),"This will fail for sure","Mismatch between test text and method text");

  }
}
