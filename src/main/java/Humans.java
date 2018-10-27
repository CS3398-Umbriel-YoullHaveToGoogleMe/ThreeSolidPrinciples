/*************************************************************
Matthew Stephens
This file contains the Worker and Super Worker Classes, both
implimenting the IEmployee interface which inherits from the
IWorker interface. The use of the segregated interfaces allows
these classes to be extended further while being closed for
modification.
**************************************************************/

package threesolid;

class Worker extends BaseWorker implements IWorker, IEat, ISick {
	public void sick() {
		System.out.println("Worker is sick...");
	}

	public String eat() {
		System.out.println("Worker eating...");
		return "Worker eating...";
	}
};

class SuperWorker extends BaseWorker implements IWorker, IEat, ISick {
	public void sick() {
		System.out.println("SuperWorker is soopa sick...");
	}

	public String eat() {
		System.out.println("SuperWorker is soopa eating...");
		return "SuperWorker is soopa eating...";
	}

	@Override
	public String work() {
		//work() is being overridden.
		System.out.println("SuperWorker is soopa working...");
		return "SuperWorker is soopa working...";
	}
};
