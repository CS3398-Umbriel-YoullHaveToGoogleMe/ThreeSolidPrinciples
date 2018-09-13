package threesolid;

public class SuperWorker extends BaseWorker implements IEat,ISick {
	public void eat() {
		//SuperWorker is super eating.
	}
	
	public void sick() {
		//SuperWorker is sick.
	}
	
	@Override
	public void work() {
		//work() is being overridden.
	}
}
