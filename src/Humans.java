/*************************************************************
Matthew Stephens
This file contains the Worker and Super Worker Classes, both 
implimenting the IEmployee interface which inherits from the
IWorker interface. The use of the segregated interfaces allows
these classes to be extended further while being closed for
modification.
**************************************************************/

package threesolid;

class Worker implements IWorker, IEmployee {
	public void work(){
		System.out.println("Worker working...");
	}

	public void eat(){
		System.out.println("Worker eating...");
	}
};

class SuperWorker implements IWorker, IEmployee {
	public void work(){
		System.out.println("SuperWorker is soopa working...");
	}

	public void eat(){
		System.out.println("SuperWorker is soopa eating...");
	}
};
