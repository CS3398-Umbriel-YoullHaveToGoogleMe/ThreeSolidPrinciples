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
    assertEquals(w.work(),"Working...","Mismatch between test text and method text");

  }
    private TempWorker tw = new TempWorker();

    @Test
    @DisplayName("(Aadil Khatri)TempWorker_Test")
    public void testTempWorkerSickMethod()
    {
       assertEquals(tw.sick(),"TempWorker is sick...","Mismatch between test text and method text");

    }

  //  @Test
  //  @DisplayName("(Aadil Khatri)TempWorker_Test")
  //  public void testWillFailTempWorkerEatMethod()
  //  {
  //      assertEquals(tw.eat(),"Destined to Fail...","Mismatch between test text and method text");

  //  }
}
//  private SuperWorker sw = new SuperWorker();
  //public void testSuperWorkerMethod()
  //{
  //  assertEquals(sw.eat(),"SuperWorker is soopa eating...","Mismatch between test text and method text");
