/*
 *	Steven Hernandez
 *  This interface has been separated so that it may be implemented
 *  by classes that only need to use the work function.  This follows
 *  the interface segregation principle.
 */

package threesolid;

public interface IWorker {
	public void work();
}
