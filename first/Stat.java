package first;

public class Stat {
	int id;
	String name;
	static String college="IIT";
Stat(int i,String n){
	id=i;
	name=n;
}
Stat(){}
void display(){
	System.out.println(id+" "+name+" "+college);
}
public static void main(String args[]){
	Stat s1= new Stat(111,"ashwanth");
	Stat s2= new Stat();
	s2.id=s1.id;
	s2.name=s1.name;
	s1.display();
	s2.display();
}

}
