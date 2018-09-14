/* We seperated the main class from the rest of the files so we can mainly follow the Open Close principle.
Since we will be mostly making modifications to other files, we kept this file seperate from others so that
it is still open to modifications if needed. Since this files modification may depend on many factors then we
may not be able to apply the single responsilbity principle here. Interface Segregation does not apply to this file*/

package threesolid;

public class Main {   
   // The entry main() method
   public static void main(String[] args) {
	   //Manager tsManager = new Manager();
 
	   try 
	   {
		   System.out.format("Starting ... \n");               
	   } 
	   catch (Exception main_except)
	   {
		   main_except.printStackTrace();
	   }

	   Manager tsManager1 = new Manager();
	   Worker worker1 =  new Worker();
       tsManager1.setWorker(worker1);
       tsManager1.manage();
	   worker1.eat();
	   worker1.sick();

	   ProjectManager projMang = new ProjectManager();
	   SuperWorker supWorker1 = new SuperWorker();
	   projMang.setWorker(supWorker1);
	   projMang.manage();
	   projMang.schedulework();
	   supWorker1.eat();
	   supWorker1.sick();
	   supWorker1.work();

	   ProductManager prodMang = new ProductManager();
	   Robot rob = new Robot();
	   prodMang.setWorker(rob);
	   prodMang.manage();
	   prodMang.defineproduct();
	   rob.reboot();

       Manager tsManager2 = new Manager();
       TempWorker tempWorker1 = new TempWorker();
       tsManager2.setWorker(tempWorker1);
       tsManager2.manage();
       tempWorker1.eat();
       tempWorker1.sick();
       tempWorker1.work();


	   try 
	   {
		   System.out.format("Stopping ... \n");               
	   } 
	   catch (Exception main_except)
	   {
		   main_except.printStackTrace();
	   }

	   System.exit(0);
   }
};

 