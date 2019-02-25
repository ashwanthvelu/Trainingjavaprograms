package examples;

public class Associate extends Employees {
	public Associate(int id, String name, String designation, float salary) {
		super(id, name, designation, salary);

	}

	public void show() {
		System.out.println("Associate");
	}
}