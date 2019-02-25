package examples;

public class Manager extends Employees {
	public Manager(int id,String name, String designation, float salary) {
		super(id,name, designation, salary);
	}

	
	public void show() {
		System.out.println("Manager");
	}

	void display(){}
}