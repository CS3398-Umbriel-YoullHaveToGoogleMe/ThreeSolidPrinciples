/****************************************************************************
 * File Name: Robot.java    Author: Steven Hernandez
 * 
 * This file contains the Robot class which inherets the work() method from
 * the BaseWorker class.  The Robot class also implements the reboot() method
 * from the IReboot interface.
****************************************************************************/

package threesolid;

public class Robot extends BaseWorker implements IReboot {
	public void reboot() {
		System.out.println("Robot is rebooting...");
	}
}
