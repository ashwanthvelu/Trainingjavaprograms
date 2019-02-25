package first;

import java.util.*;
interface tes{
 public int getEmployeeID();
}

class Testing{
	String name;
	String dsgn;
	Testing(String name,String dsgn){
		this.name=name;
		this.dsgn=dsgn;
	}
}
class Test1 extends Testing{
	int id;
	float salary;
	Test1(int id,String name, String dsgn,float salary) {
		super(name, dsgn);
		this.salary=salary;
	}
	void display(){
		System.out.println(name+" "+dsgn+" "+salary);
		}
}
class teso implements tes{
	int id1;
	@Override
	public int getEmployeeID() {
		System.out.println("Id:" + id1);

		return 0;
	}
}

public class Assesment {
	public static void main(String[] args) {
		Test1 tst=new Test1(1,"ash","blank",20164f); 
		Test1 tst1=new Test1(1,"rins","rider",36544f);
		tst.display();
		tst1.display();
		System.out.println();
		
		List<Test1>	list=new ArrayList<>();
		Test1 manager=new Test1(1,"iannone","Manager",50000f);
		Test1 tl=new Test1(2,"rossi","  Team Leader",30000f);
		Test1 associate=new Test1(3,"maveric","associate",20000f);
		Test1 junior=new Test1(4,"miller"," junior",8000f);
		manager.display();
		tl.display();
		associate.display();
		junior.display();
		
		System.out.println();
		
		list.add(manager);
		list.add(tl);
		list.add(associate);
		list.add(junior);
		for(Test1 b:list){
			System.out.println(b.name+" "+b.dsgn+" "+b.salary);
		}
		System.out.println();
		list.stream().filter(p->p.salary>=30000).forEach(Test1->System.out.println(Test1.name+" "+Test1.dsgn+" "+Test1.salary));
	}
}
