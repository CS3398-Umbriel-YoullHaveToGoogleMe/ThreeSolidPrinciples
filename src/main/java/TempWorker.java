/***************************************************************************
 * File Name: TempWorker.java    Author: Steven Hernandez
 * 
 * This file contains the TempWorker class that inherits from the BaseWorker
 * class.  However, this class does override the work method with its own
 * implementation of that function.  This class also implements the eat()
 * and sick() methods from the IEat and ISick interfaces.
***************************************************************************/

package threesolid;

public class TempWorker extends BaseWorker implements IEat,ISick {
	public String eat() {
		System.out.println("Tempworker is eating...");
		return "Tempworker is eating...";
	}
	
	public void sick() {
		System.out.println("TempWorker is sick...");
	}
	
	@Override
	public String work() {
		System.out.println("TempWorker is working...");
		//work() is being overridden.
		return "TempWorker is working...";
	}
}
