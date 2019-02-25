package first;

public class Copy {
	int id;
	String name;
	int age;
	Copy(int i,String n, int a){
		id=i;
		name=n;
		age=a;
	}

	Copy(Copy c){
		id=c.id;
		name=c.name;
		age=c.age;
		}

void display(){
	System.out.println(id+" "+name+""+age);
	}  
	public static void main(String[] args) {
		Copy c1= new Copy(111,"ashwanth ",22);
		Copy c2= new Copy(c1);	
		Copy c3= new Copy(c1);
		c1.display();
		c2.display();
		c3.display();

	}
}
