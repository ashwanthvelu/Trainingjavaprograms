package examples;

public abstract class Employees {
	private int id;
	private String name;
	private String designation;
	private float salary;

	public Employees(int id,String name, String designation, float salary) {
		this.id=id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public abstract void show();

	public final void getEmployeeDetail() {
		System.out.println(id+" "+name + " " + designation + " " + salary+"\n");
	}
	
}