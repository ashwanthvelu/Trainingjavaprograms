package examples2;

import java.util.*;

import examples.Associate;
import examples.Employees;
import examples.L1;
import examples.L2;
import examples.Manager;

public class Check {
	static int id = 1;

	public static void main(String[] args) {

		List<Employees> emp = new ArrayList<>();

		Manager m = new Manager(id++, "mohan", "Manager", 354756f);
		emp.add(m);

		Associate a = new Associate(id++, "mani", "Associate", 3543f);
		emp.add(a);

		L1 l1 = new L1(id++, "ashwanth", "L1", 455469f);
		emp.add(l1);

		L2 l2 = new L2(id++, "ash", "L2", 547645f);
		emp.add(l2);

		for (Employees E : emp) {
			E.show();
			E.getEmployeeDetail();
		}
		// System.out.println("Filtering"+"\n"+"---------");
		// emp.stream().filter(p->p.salary>25000).forEach(Employees->System.out.println(Employees.name+" "+Employees.designation+" "+Employees.salary));
	}
}
