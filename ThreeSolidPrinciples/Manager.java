/*Seperating the manager class follows the Open Close prinicple becasue it makes it easy to 
add to the file without changing the code in other files. It also follows the Single Responsiblilty
principle since we can have one person working on this file if needed. It does not follow the Interface
Segregation principle*/
package threesolid;

class Manager {
	IWorker worker;

	public Manager() {
		//Constructor
	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
//ProjectManger inherits from Manager class and adds
//schedulework method
class ProjectManager extends Manager {
	public void schedulework(){
		System.out.format("schedule work for workers\n")

	}

}

//PruductManager inherits from Manager class and add
//defineproduct method
class ProductManager extends Manager {
	public void defineproduct(){(
			System.out.format("define product used\n")

	}
}