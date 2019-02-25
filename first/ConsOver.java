package first;

public class ConsOver {
	int id;
	String name;
	int age;
ConsOver(int i,String n){
	id=i;
	name=n;
}
ConsOver(int i, String n, int a){
	id=i;
	name=n;
	age=a;
}
void display(){
	System.out.println(id+" "+name+" "+age);
}
public static void main(String args[]){
	ConsOver c1=new ConsOver(111,"ashwanth",23 );
	ConsOver c2=new ConsOver(222,"ash",22 );
	c1.display();
	c2.display();
}
}
