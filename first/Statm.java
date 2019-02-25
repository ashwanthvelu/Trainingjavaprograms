package first;

public class Statm {
	int id;
	String name;
	static String college="iit";
Statm(int i,String n) {
		id=i;name=n;
	}
static void change(){
	college="SRM";
}
void display(){
	System.out.println(id+" "+name+" "+college);
}

	public static void main(String[] args) {
	Statm.change();
	Statm s1=new Statm(111, "ashwanth");
	Statm s2=new Statm(222, "asdhg");
	s1.display();
	s2.display();
	}

}
