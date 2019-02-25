package first;

import java.util.*;

abstract class Employees {
	int id;
	String name;
	String designation;
	float salary;

	public Employees(int id,String name, String designation, float salary) {
		this.id=id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	abstract void show();

	public void getEmployeeDetail() {
		System.out.println(id+" "+name + " " + designation + " " + salary+"\n");
	}
	
}

class Manager extends Employees {
	public Manager(int id,String name, String designation, float salary) {
		super(id,name, designation, salary);
	}

	@Override
	final void show() {
		System.out.println("Manager");
	}
}

class Associate extends Employees {
	public Associate(int id,String name, String designation, float salary) {
		super(id,name, designation, salary);

	}

	void show() {
		System.out.println("Associate");
	}
}

class L1 extends Employees {
	public L1(int id,String name, String designation, float salary) {
		super(id,name, designation, salary);

	}

	void show() {
		System.out.println("L1");
	}
}

class L2 extends Employees {
	public L2(int id,String name, String designation, float salary) {
		super(id,name, designation, salary);

	}

	void show() {
		System.out.println("L2");
	}
}

public class Check {
	static int id=0;
	public static void main(String[] args) {
		id++;
		List<Employees> emp = new ArrayList<>();

		Manager m = new Manager(id ,"mohan", "Manager", 354756f);
		emp.add(m);
		Associate a = new Associate(id,"mani", "Associate", 3543f);
		emp.add(a);
		L1 l1 = new L1(id,"ashwanth", "L1", 455469f);
		emp.add(l1);
		L2 l2 = new L2(id,"ash", "L2", 547645f);
		emp.add(l2);
		for (Employees E : emp) {
			E.show();
			E.getEmployeeDetail();
			
		}

	}
}
