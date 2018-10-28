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
    assertEquals(w.work(),"I'm working already!","Mismatch between test text and method text");

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
        assertEquals(sw.work(),"Destined to Fail...","Mismatch between test text and method text");

    }
}
//  private SuperWorker sw = new SuperWorker();
  //public void testSuperWorkerMethod()
  //{
  //  assertEquals(sw.eat(),"SuperWorker is soopa eating...","Mismatch between test text and method text");
