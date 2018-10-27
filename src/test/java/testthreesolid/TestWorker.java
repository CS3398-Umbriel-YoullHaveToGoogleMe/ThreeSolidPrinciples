//This file will contain the test class for Worker.java.

package threesolid;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {
  

  private BaseWorker worker = new BaseWorker();

  @Test
  @DisplayName("Work Method Test")
  public void testWorkMethod() {
	  assertEquals("Worker working...","I'm working already!","Mismatch between test text and method text");
  }
  
  @Test
  @DisplayName("Test that BaseWorker Object Created")
  public void newtestSHWorkerPass() {
	  BaseWorker worker = new BaseWorker();
	  
	  assertFalse((worker == null), "worker variable should contain a BaseWorker object");
  }
  
  @Test
  @DisplayName("Test that two BaseWorker objects are different and not the same object.")
  public void newtestSHWorkerFail() {
	  BaseWorker worker1 = new BaseWorker();
	  BaseWorker worker2 = new BaseWorker();
	  
	  assertEquals(worker1, worker2, "worker1 and worker2 are not the same object.");
  }
}