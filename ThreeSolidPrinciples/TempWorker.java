/************************************************************************
Steven Hernandez
This file contains the TempWorker class that inherits from the BaseWorker
class.  However, this class does override the work method with its own
implementation of that function.  This class also implements the eat()
and sick() methods from the IEat and ISick interfaces.
************************************************************************/

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
