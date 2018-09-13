package threesolid;

public class TempWorker extends BaseWorker implements IEat,ISick {
	public void eat() {
		//TempWorker is eating.
	}
	
	public void sick() {
		//TempWorker is sick.
	}
	
	@Override
	public void work() {
		//work() is being overridden.
	}
}
