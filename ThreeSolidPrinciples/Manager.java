/*Seperating the manager class follows the Open Close prinicple becasue it makes it easy to 
add to the file without changing the code in other files. It also follows the Single Responsiblilty
principle since we can have one person working on this file if needed. It does not follow the Interface
Segregation principle*/
package threesolid;

class Manager {
	IWorker worker;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}